package Estruturas_Repetitivas;

import java.util.Scanner;

public class Aula2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Minha forma de fazer uso do scanner

        System.out.println("Digite seu nome: ");
        String nome = scanner.nextLine();

        System.out.println("Você digitou: " + nome);;

        // Forma que o professor usou o scanner

        int x;
        String s1, s2, s3;
        x = scanner.nextInt();
        scanner.nextLine();
        s1 = scanner.nextLine();
        s2 = scanner.nextLine();
        s3 = scanner.nextLine();

        System.out.println("DADOS DIGITADOS:");
        System.out.println(x);
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);

        scanner.close();
    }
}
