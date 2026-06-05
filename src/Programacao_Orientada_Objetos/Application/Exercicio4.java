package Programacao_Orientada_Objetos.Application;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        int n;

        System.out.print("Quantos numeros voce vai digitar: ");
        n = scanner.nextInt();



        double[] vect = new double[n];

        for (int i = 0; i < vect.length; i++) {
            System.out.print("Digite um numero: ");
            vect[i] = scanner.nextDouble();
        }

        double sum = 0.0;
        for (int i = 0; i < vect.length; i++) {
            sum += vect[i];
        }
        double average = sum / vect.length;

        System.out.print("VALORES = ");
        for (int i = 0; i < vect.length; i++) {
            System.out.print(vect[i] + "  ");
        }
        System.out.println();
        System.out.println("SOMA = " + String.format("%.2f", sum));
        System.out.println("MEDIA = " + String.format("%.2f", average));
    }
}
