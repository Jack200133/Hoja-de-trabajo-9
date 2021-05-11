
import java.util.Map;


public class MapFactory {

    public Mapas getMAP(String entry) {
        return switch (entry) {
            //regresa un Hashing map|
            case "HM" -> new RBT("");
            //regresa un Red Black TreeMap
            default -> new RBT("");

        };
    }
}
