import java.util.Scanner;
import java.util.Map;

public class Modelo {
    Scanner scan;
    Mapas datos;
    MapFactory mf;

    public Modelo() {
        this.scan = new Scanner(System.in);;
        mf = new MapFactory();
    }

    public void cual(){
       System.out.println("Ingrese que tipo de Map se implementara:");
       System.out.println("1. HashMap");
       System.out.println("2. Red Black Tree");

       int op = scan.nextInt();

       String res = "";
       if(op ==1){
           res = "HM";
       }
       else if(op ==2){
           res = "";
       }
       else{
           res = "";
       }

       datos = mf.getMAP(res);
   }
}
