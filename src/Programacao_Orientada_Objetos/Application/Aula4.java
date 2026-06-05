package Programacao_Orientada_Objetos.Application;

import Programacao_Orientada_Objetos.Entities.Product1;

import java.util.Locale;
import java.util.Scanner;

public class Aula4 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        
        int n = scanner.nextInt();
        Product1[] vect = new Product1[n];

        for (int i = 0; i < vect.length; i++) {
            scanner.nextLine();
            String name = scanner.nextLine();
            double price = scanner.nextDouble();
            vect[i] = new Product1(name, price);
        }
        
        double sum = 0.0;
        for (int i = 0; i < vect.length; i++) {
            sum += vect[i].getPrice();
        }
        double average = sum / vect.length;

        System.out.println("AVERAGE PRICE: " + String.format("%.2f", average));
    }
}
