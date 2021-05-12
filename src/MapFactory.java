/**
 * @author unclepete-20 y Jack200133
 * Carnet 20188 y 20593
 * Universidad del Valle de Guatemala
 * Algoritmos y estructuras de datos
 * Seccion 10
 * Hoja de trabajo 9
 */

public class MapFactory {

    public Mapas getMAP(String entry) {
        return switch (entry) {
            //regresa un Hashing map|
            case "HM" -> new HashMapa();
            //regresa un Red Black TreeMap
            case "RBT" -> new RedBlackTree();
            //regresa un Splay Tree
            case "SPLT" -> new SplayBST();
            
            default -> throw new IllegalArgumentException("Unexpected value: " + entry);

        };
    }
}
