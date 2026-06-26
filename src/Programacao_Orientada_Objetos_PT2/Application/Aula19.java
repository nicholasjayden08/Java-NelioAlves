package Programacao_Orientada_Objetos_PT2.Application;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Aula19 {
    public static void main() {

        String[] lines = new String[]{"Good Morning", "Good afternoon", "Good Night"};

        String path = "c:\\temp\\out.txt";

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(path, true))) {
            for (String line : lines) {
                bw.write(line);
                bw.newLine();
            }
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}
