package Programacao_Orientada_Objetos.Application;

import java.util.Locale;
import java.util.Scanner;
import Programacao_Orientada_Objetos.Entities.Employee;

public class Exercicio1 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        Employee employee = new Employee();
        System.out.print("Name: ");
        employee.name = scanner.nextLine();
        System.out.print("Gross salary: ");
        employee.grossSalary = scanner.nextDouble();
        scanner.nextLine();
        System.out.print("Tax: ");
        employee.tax = scanner.nextDouble();
        scanner.nextLine();

        System.out.println();
        System.out.println("Employee: " + employee);
        System.out.println();
        System.out.print("Which percentage to increase salary? ");
        double percentage = scanner.nextDouble();
        employee.increaseSalary(percentage);
        scanner.nextLine();
        System.out.println();
        System.out.println("Updated data: " + employee);
        scanner.close();

    }
}
