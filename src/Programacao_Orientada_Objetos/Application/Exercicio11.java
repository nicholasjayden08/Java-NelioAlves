package Programacao_Orientada_Objetos.Application;


import Programacao_Orientada_Objetos.Entities.Client;
import Programacao_Orientada_Objetos.Entities.Enums.OrderStatus1;
import Programacao_Orientada_Objetos.Entities.Order1;
import Programacao_Orientada_Objetos.Entities.OrderItem;
import Programacao_Orientada_Objetos.Entities.Product2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Exercicio11 {
    public static void main(String[] args) throws ParseException {

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter client data: ");
        System.out.print("Name: ");
        String name = scanner.nextLine();
        System.out.print("Email: ");
        String email = scanner.next();
        System.out.print("Birth date (DD/MM/YYYY): ");
        Date birthDate = sdf.parse(scanner.next());

        Client client = new Client(name, email, birthDate);

        System.out.println("Enter order data: ");
        System.out.print("Status: ");
        OrderStatus1 status = OrderStatus1.valueOf(scanner.next());

        Order1 order = new Order1(new Date(), status, client);

        System.out.print("How many items to this order? ");
        int N = scanner.nextInt();
        for (int i = 1; i <= N; i++) {
            System.out.println("Enter #" + i + " item data: ");
            System.out.print("Product name: ");
            scanner.nextLine();
            String productName = scanner.nextLine();
            System.out.print("Product price: ");
            double productPrice = scanner.nextDouble();
            System.out.print("Quantity: ");
            int quantity = scanner.nextInt();

            Product2 product = new Product2(productName, productPrice);

            OrderItem it = new OrderItem(quantity, productPrice, product);

            order.addItem(it);
        }

        System.out.println();
        System.out.println(order);
    }
}
