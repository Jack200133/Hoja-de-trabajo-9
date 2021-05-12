/**
 * @author unclepete-20 y Jack200133
 * Carnet 20188 y 20593
 * Universidad del Valle de Guatemala
 * Algoritmos y estructuras de datos
 * Seccion 10
 * Hoja de trabajo 9
 */

import java.util.Scanner;

public class Modelo {
    Scanner scan;
    Mapas<String, String> datos;
    MapFactory mf;

    public Modelo() {
        this.scan = new Scanner(System.in);;
        mf = new MapFactory();
    }

    public void cual(){
        System.out.println("\n=================== TRADUCTOR FELIZ :) ===================\n");

       System.out.println("Ingrese que tipo de Mapeo (Balanced Search Tree) se implementara:");
       System.out.println("1. HashMap");
       System.out.println("2. Splay Tree");
       System.out.println("3. Red Black Tree");

       int op = scan.nextInt();

       String res = "";
       if(op ==1){
           res = "HM";
       }
       else if(op ==2){
           res = "SPLT";
       }else if(op==3){
           res = "RBT";
       } else {
           res = "";
       }

       datos = mf.getMAP(res);
   }

   public void datos(){
        Reader rd = new Reader();
       // falta agregar que busque un valor dentro del arbol RBT
        // falta agregar la implementacion de Association
        // Aqui falta agragar los datos al diccionario
       // Falta trducir el documento


       /*
       * En esta seccion se realizara el ingreso de las palabras para la
       * traduccion del ingles al español. Se hara un llamado a la clase
       * Reader, el cual se encargara de leer los archivos solicitados
       * para esta hoja de trabajo.
       */

        rd.dataToTree(datos);


       /**
        * Se realiza la lectura de la oracion, la cual sera traducida posteriorme
        */

        rd.sentenceReader(datos);


   }
}
