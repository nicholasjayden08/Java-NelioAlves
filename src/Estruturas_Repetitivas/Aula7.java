package Estruturas_Repetitivas;

import java.util.Scanner;

public class Aula7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int Numeros = scanner.nextInt();

        int soma = 0;
        for (int i = 0; i < Numeros; i++) {
            int x = scanner.nextInt();
            soma = soma + x;
        }

        System.out.println(soma);

        for (int i = 0; i <= 5; i++) {
            System.out.println("Valor de i: " + i);
        }

        System.out.println("  ");

        for (int i = 4; i >= 0; i--) {
            System.out.println("Valor de i: " + i);
        }
    }
}
