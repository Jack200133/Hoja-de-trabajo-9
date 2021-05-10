
import java.util.Map;


public class MapFactory {

    public Map getMAP(String entry) {
        return switch (entry) {
            //regresa un Red Black TreeMap
            case "RBT" -> new RBT();
            //regresa un Hashing map|
            default -> new Hash();

        };
    }
}
