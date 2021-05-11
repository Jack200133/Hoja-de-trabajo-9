


public class MapFactory {

    public Mapas getMAP(String entry) {
        return switch (entry) {
            //regresa un Hashing map|
            case "HM" -> new HashMapa();
            //regresa un Red Black TreeMap
            default -> new RedBlackTree();

        };
    }
}
