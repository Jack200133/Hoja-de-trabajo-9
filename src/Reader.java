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
import java.util.Scanner;


public class Reader {

    Scanner scanner = new Scanner(System.in);

    
    /**
     * @param tree
     * Pre: Ingresa la informacion deseada al Binary Search Tree.
     * Post: La informacion ya esta almacenada en el arbol por medio de nodos.
     */
    public void dataToTree(Mapas tree){ //Ingresa la informacion deseada al Binary Search Tree.
        try {
            File file = new File("Spanish.txt");
            Scanner reader = new Scanner(file);
            int c = 0;
            while (reader.hasNextLine()) {
                c++;
                String dictionary = reader.nextLine();
                String[]  words = dictionary.split("	");
                String[] words2 = words[1].split(",");
                tree.add(words[0], words2[0]);
            }

            reader.close();
        } catch (FileNotFoundException e) {
            System.out.println("Archivo no encontrado.");
            e.printStackTrace();
        }

    }

    
    /**
     * Pre: Lee la oracion desde el archivo de texto.
     * Post: Almacena cada palabra de la oracion en un array. 
     */
    public void sentenceReader(Mapas map){
        StringBuilder res = new StringBuilder();
        try {
            
            File myObj = new File("texto.txt");
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                String[] temp = data.split("\\.");
                res = new StringBuilder();
                for (String s : temp) {
                   String[] oracion = s.split(" ");
                   System.out.println("\nOracion original: " + data + "\n");
                   for(String i: oracion){
                       if(map.contains(i.toLowerCase())){
                           res.append(" ");
                           res.append(map.get(i));
                           res.append(" ");
                       } else{
                           res.append(" ").append("*").append(i).append("*").append(" ");
                       }
                   }
                }
            }
            myReader.close();
            System.out.println("\nTraduccion al espanol: " + res.toString() + "\n");
        }catch (Exception e) {
            System.out.println("Archivo no encontrado");
            e.printStackTrace();
        }
    }


}
