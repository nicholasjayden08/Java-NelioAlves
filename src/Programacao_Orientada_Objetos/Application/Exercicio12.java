package Programacao_Orientada_Objetos.Application;

import Programacao_Orientada_Objetos.Entities.Employee1;
import Programacao_Orientada_Objetos.Entities.OutsourcedEmployee;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Exercicio12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        List<Employee1> list = new ArrayList<>();

        System.out.print("Enter the number of employees: ");
        int n = scanner.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println("Employee #" + i + " data:");
            System.out.print("Outsourced (y/n)? ");
            char ch = scanner.next().charAt(0);
            System.out.print("Name: ");
            scanner.nextLine();
            String name = scanner.nextLine();
            System.out.print("Hours: ");
            int hours = scanner.nextInt();
            System.out.print("Value per hour: ");
            double valuePerHour = scanner.nextDouble();
            if (ch == 'y') {
                System.out.print("Additional charge: ");
                double charge = scanner.nextDouble();
                list.add(new OutsourcedEmployee(name, hours, valuePerHour, charge));
            }
            else {
                list.add(new Employee1(name, hours, valuePerHour));
            }

        }
        System.out.println();
        System.out.println("PAYMENTS: ");
        for (Employee1 emp : list) {
            System.out.println(emp.getName() + " - $ " + String.format("%.2f", emp.payment()));
        }
    }
}
