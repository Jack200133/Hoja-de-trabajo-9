public class RBT<E extends Comparable<E>> implements Mapas<E>{
    private RBN<E> current;
    private RBN<E> parent;
    private RBN<E> grand;
    private RBN<E> great;
    private RBN<E> header;
    private static RBN nullNode;
    /* static initializer for nullNode */
    static
    {
        nullNode = new RBN(0);
        nullNode.left = nullNode;
        nullNode.right = nullNode;
    }
    /* Black - 1  RED - 0 */
    static final int BLACK = 1;
    static final int RED   = 0;
    /* Constructor */
    public RBT(E negInf)
    {
        header = new RBN(negInf);
        header.left = nullNode;
        header.right = nullNode;
    }
    /* Function to check if tree is empty */
    public boolean isEmpty()
    {
        return header.right == nullNode;
    }
    /* Make the tree logically empty */
    public void makeEmpty()
    {
        header.right = nullNode;
    }
    /* Function to insert item */
    public void add(E item)
    {
        current = parent = grand = header;
        nullNode.element = item;
        while (current.element != item)
        {
            great = grand;
            grand = parent;
            parent = current; //regresa un Red Black TreeMap
            current = item.compareTo(current.element)<1/* < current.element*/ ? current.left : current.right;
            // Check if two red children and fix if so            
            if (current.left.color == RED && current.right.color == RED)
                handleReorient( item );
        }
        // Insertion fails if already present
        if (current != nullNode)
            return;
        current = new RBN(item, nullNode, nullNode);
        // Attach to parent
        if (item.compareTo(parent.element)<1 /*< parent.element*/)
            parent.left = current;
        else
            parent.right = current;
        handleReorient( item );
    }
    private void handleReorient(E item)
    {
        // Do the color flip
        current.color = RED;
        current.left.color = BLACK;
        current.right.color = BLACK;

        if (parent.color == RED)
        {
            // Have to rotate
            grand.color = RED;
            if (item.compareTo(grand.element) /*< grand.element*/ != item.compareTo(parent.element)/* < parent.element*/)
                parent = rotate(item, grand );  // Start dbl rotate
            current = rotate(item, great );
            current.color = BLACK;
        }
        // Make root black
        header.right.color = BLACK;
    }
    private RBN rotate(E item, RBN parent)
    {
        if(item.compareTo((E) parent.element) <1 /*parent.element*/)
            return parent.left = item.compareTo((E) parent.left.element) <1 /*parent.left.element*/ ? rotateWithLeftChild(parent.left) : rotateWithRightChild(parent.left) ;
        else
            return parent.right = item.compareTo((E)parent.right.element) <1 /*parent.right.element*/ ? rotateWithLeftChild(parent.right) : rotateWithRightChild(parent.right);
    }
    /* Rotate binary tree node with left child */
    private RBN rotateWithLeftChild(RBN k2)
    {
        RBN k1 = k2.left;
        k2.left = k1.right;
        k1.right = k2;
        return k1;
    }
    /* Rotate binary tree node with right child */
    private RBN rotateWithRightChild(RBN k1)
    {
        RBN k2 = k1.right;
        k1.right = k2.left;
        k2.left = k1;
        return k2;
    }
    /* Functions to count number of nodes */
    public int countNodes()
    {
        return countNodes(header.right);
    }
    private int countNodes(RBN r)
    {
        if (r == nullNode)
            return 0;
        else
        {
            int l = 1;
            l += countNodes(r.left);
            l += countNodes(r.right);
            return l;
        }
    }
    /* Functions to search for an element */
    public boolean search(E val)
    {
        return search(header.right, val);
    }
    private boolean search(RBN r, E val)
    {
        boolean found = false;
        while ((r != nullNode) && !found)
        {
            E rval = (E) r.element;
            if (val.compareTo(rval) < 1 /*rval*/)
                r = r.left;
            else if (val.compareTo(rval) > 1 /*rval*/)
                r = r.right;
            else
            {
                found = true;
                break;
            }
            found = search(r, val);
        }
        return found;
    }
    /* Function for inorder traversal */
    public void inorder()
    {
        inorder(header.right);
    }
    private void inorder(RBN r)
    {
        if (r != nullNode)
        {
            inorder(r.left);
            char c = 'B';
            if (r.color == 0)
                c = 'R';
            System.out.print(r.element +""+c+" ");
            inorder(r.right);
        }
    }
    /* Function for preorder traversal */
    public void preorder()
    {
        preorder(header.right);
    }
    private void preorder(RBN r)
    {
        if (r != nullNode)
        {
            char c = 'B';
            if (r.color == 0)
                c = 'R';
            System.out.print(r.element +""+c+" ");
            preorder(r.left);
            preorder(r.right);
        }
    }
    /* Function for postorder traversal */
    public void postorder()
    {
        postorder(header.right);
    }
    private void postorder(RBN r)
    {
        if (r != nullNode)
        {
            postorder(r.left);
            postorder(r.right);
            char c = 'B';
            if (r.color == 0)
                c = 'R';
            System.out.print(r.element +""+c+" ");
        }
    }

}
