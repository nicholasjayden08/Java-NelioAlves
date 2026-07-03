package Programacao_Orientada_Objetos_PT2.Application;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Aula24 {
    public static void main(String[] args) {
        List<Integer> myInts = Arrays.asList(67, 42, 69);
        printList(myInts);

        List<String> myStrs = Arrays.asList("Antonio", "Gercino", "Ademir");
        printList(myStrs);
    }

    public static void printList(List<?> list) {
        for (Object obj : list) {
            System.out.println(obj);
        }
    }
}
