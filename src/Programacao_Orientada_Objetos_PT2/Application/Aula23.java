package Programacao_Orientada_Objetos_PT2.Application;

import Programacao_Orientada_Objetos_PT2.Model.Services.PrintService;

import java.util.Scanner;

public class Aula23 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        PrintService<Integer> ps = new PrintService<>();

        System.out.print("How many values? ");
        int n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            Integer value = scanner.nextInt();
            ps.addValue(value);
        }

        ps.print();
        Integer x = ps.first();
        System.out.println("First: " + x);
    }
}
