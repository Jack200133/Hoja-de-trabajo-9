import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RedBlackTreeTest {

    @Test
    void put() {
        RedBlackTree rbt = new RedBlackTree();
        rbt.add("primero",1);
        rbt.add("segun",2);
        rbt.add("tercer",3);
        rbt.add("cuarto",4);
        assert (rbt.get("cuarto").equals(4));

    }
}