package Estruturas_Repetitivas;

import java.util.Scanner;

public class Aula9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter three numbers: ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        if (a > b && a > c) {
            System.out.println("Higher = " + a);
        }
        else if (b > c) {
            System.out.println("Higher = " + b);
        }
        else {
            System.out.println("Higher = " + c);
        }
    }
}
