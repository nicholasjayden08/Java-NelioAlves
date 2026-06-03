package Programacao_Orientada_Objetos.Application;


import java.util.Locale;
import java.util.Scanner;
import Programacao_Orientada_Objetos.Entities.Triangle;

public class Aula1 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        Triangle x, y;
        x = new Triangle();
        y = new Triangle();

        System.out.println("Enter the measures of triangle X: ");
        x.a = scanner.nextDouble();
        x.b = scanner.nextDouble();
        x.c = scanner.nextDouble();

        System.out.println(" ");

        System.out.println("Entre the measures of triangle Y: ");
        y.a = scanner.nextDouble();
        y.b = scanner.nextDouble();
        y.c = scanner.nextDouble();

        double areaX = x.area();

        double areaY = y.area();

        System.out.printf("Triangle X area: %.4f%n", areaX);
        System.out.printf("Triangle Y area: %.4f%n", areaY);

        System.out.println(" ");

        if (areaX > areaY) {
            System.out.println("Larger area: X ");
        }
        System.out.println("Larger area: Y ");
    }
}
