package Programacao_Orientada_Objetos.Application;

import Programacao_Orientada_Objetos.Entities.ImportedProduct;
import Programacao_Orientada_Objetos.Entities.Product3;
import Programacao_Orientada_Objetos.Entities.UsedProduct;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class Exercicio13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        List<Product3> list = new ArrayList<>();

        System.out.print("Enter the number of products: ");
        int n = scanner.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println("Product #" + i + " data:");
            System.out.print("Common, used or imported (c/u/i)? ");
            char ch = scanner.next().charAt(0);
            System.out.print("Name: ");
            scanner.nextLine();
            String name = scanner.nextLine();
            System.out.print("Price: ");
            double price = scanner.nextDouble();
            if (ch == 'i') {
                System.out.print("Customs fee: ");
                double customsFee = scanner.nextDouble();
                list.add(new ImportedProduct(name, price, customsFee));
            }
            else if (ch == 'u') {
                    System.out.print("Manufacture date (DD/MM/YYYY): ");
                    LocalDate date = LocalDate.parse(scanner.next(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));
                    list.add(new UsedProduct(name, price, date));
            }
            else {
                list.add(new Product3(name, price));
            }

        }
        System.out.println();
        System.out.println("PRICE TAGS: ");
        for (Product3 prod : list) {
            System.out.println(prod.priceTag());
        }
    }
}
