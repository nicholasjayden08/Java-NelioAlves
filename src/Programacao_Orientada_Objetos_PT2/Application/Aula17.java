package Programacao_Orientada_Objetos_PT2.Application;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Aula17 {
   public static void main(String[] args) {
       File file = new File("/Users/studiocreative/Desktop/in.txt");
       Scanner scanner = null;
       try {
           scanner = new Scanner(file);
           while (scanner.hasNextLine()) {
               System.out.println(scanner.nextLine());
           }
       }
       catch (IOException e) {
           System.out.println("Error: " + e.getMessage());
       }
       finally {
           if (scanner != null) {
               scanner.close();
           }
       }
    }
}
