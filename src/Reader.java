/**
 * @author unclepete-20 y Jack200133
 * Carnet 20188 y 20593
 * Universidad del Valle de Guatemala
 * Algoritmos y estructuras de datos
 * Seccion 10
 * Hoja de trabajo 9
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;


public class Reader {

    Scanner scanner = new Scanner(System.in);

    
    /**
     * @param tree
     * Pre: Ingresa la informacion deseada al Binary Search Tree.
     * Post: La informacion ya esta almacenada en el arbol por medio de nodos.
     */
    public static void dataToTree(Mapas tree){ //Ingresa la informacion deseada al Binary Search Tree.
        try {
            File file = new File("Spanish.txt");
            Scanner reader = new Scanner(file);
            int c = 0;
            while (reader.hasNextLine()) {
                c++;
                String dictionary = reader.nextLine();
                String[]  words = dictionary.split("	"); 
                tree.add(words[0], words[1]);
            }

            reader.close();
        } catch (FileNotFoundException e) {
            System.out.println("Archivo no encontrado.");
            e.printStackTrace();
        }

    }

    
    /** 
     * @param map
     * Pre: Lee la oracion desde el archivo de texto.
     * Post: Almacena cada palabra de la oracion en un array. 
     */
    public void sentenceReader(StringBuilder string){
        try {
            File myObj = new File("texto.txt");
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                String[] temp = data.split("\\.");
                string = new StringBuilder();
                for (String s : temp) {
                   String[] oracion = s.split(" ");
                   for(String i: oracion){
                       ComparableAssociation top = new ComparableAssociation(i.toLowerCase());
                   }
                }
            }
            myReader.close();
        }catch (Exception e) {
            System.out.println("Archivo no encontrado");
            e.printStackTrace();
        }
    }


}
