/**
 * @author unclepete-20 y Jack200133
 * Carnet 20188 y 20593
 * Universidad del Valle de Guatemala
 * Algoritmos y estructuras de datos
 * Seccion 10
 * Hoja de trabajo 9
 */

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RedBlackTreeTest {

    @Test
    void add() {
        RedBlackTree rbt = new RedBlackTree();
        rbt.add("primero",1);
        rbt.add("segun",2);
        rbt.add("tercer",3);
        rbt.add("cuarto",4);
        rbt.add("quinto",5);
        rbt.add("seis",6);
        assert (rbt.contains("primero"));

    }

    @Test
    void get() {
        RedBlackTree rbt = new RedBlackTree();
        rbt.add("primero",1);
        rbt.add("segun",2);
        rbt.add("tercer",3);
        rbt.add("cuarto",4);
        rbt.add("quinto",5);
        rbt.add("seis",6);
        assert (rbt.get("primero").equals(1));

    }
}