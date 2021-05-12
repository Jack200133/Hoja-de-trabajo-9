/**
 * @author unclepete-20 y Jack200133
 * Carnet 20188 y 20593
 * Universidad del Valle de Guatemala
 * Algoritmos y estructuras de datos
 * Seccion 10
 * Hoja de trabajo 9
 */

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

   public void datos(){
       // falta agregar que busque un valor dentro del arbol RBT
        // falta agregar la implementacion de Association
        // Aqui falta agragar los datos al diccionario
       // Falta trducir el documento
   }
}
