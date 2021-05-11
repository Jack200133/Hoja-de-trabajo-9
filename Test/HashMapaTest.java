import org.junit.jupiter.api.Test;

import java.util.HashMap;

import static org.junit.jupiter.api.Assertions.*;

class HashMapaTest {

    @Test
    void put() {
        HashMapa rbt = new HashMapa();
        rbt.add("primero",1);
        rbt.add("segun",2);
        rbt.add("tercer",3);
        rbt.add("cuarto",4);
        assert (rbt.get("cuarto").equals(4));

    }
}