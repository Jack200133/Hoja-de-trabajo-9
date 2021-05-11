import static org.junit.jupiter.api.Assertions.*;

class RBTTest {

    @org.junit.jupiter.api.Test
    void add() {
        RBT rbt = new RBT(7);
        rbt.add(5);
        rbt.add(4);
        rbt.add(6);
        rbt.add(3);

    }
}