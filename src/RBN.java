public class RBN<E> {
    RBN left, right;
    E element;
    int color;

    /* Constructor */
    public RBN(E theElement)
    {
        this(theElement, null, null );
    }
    /* Constructor */
    public RBN(E theElement, RBN lt, RBN rt)
    {
        left = lt;
        right = rt;
        element = theElement;
        color = 1;
    }
}
