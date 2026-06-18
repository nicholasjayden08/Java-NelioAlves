package Programacao_Orientada_Objetos.Application;

import Programacao_Orientada_Objetos.Entities.Company;
import Programacao_Orientada_Objetos.Entities.Individual;
import Programacao_Orientada_Objetos.Entities.TaxPayer;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Exercicio14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        List<TaxPayer> list = new ArrayList<>();

        System.out.print("Enter the number of tax payers: ");
        int n = scanner.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println("Tax payer #" + i + " data: ");
            System.out.print("Individual or Company (i/c) ");
            char ch = scanner.next().charAt(0);
            System.out.print("Name: ");
            scanner.nextLine();
            String name = scanner.nextLine();
            System.out.print("Anual income: ");
            double anualIncome = scanner.nextDouble();
            if (ch == 'i') {
                System.out.print("Health expenditures: ");
                double healthExpenditures = scanner.nextDouble();
                list.add(new Individual(name, anualIncome, healthExpenditures));
            }
            else {
                System.out.print("Number of employees: ");
                int numberOfEmployees= scanner.nextInt();
                list.add(new Company(name, anualIncome, numberOfEmployees));
            }
        }
        double sum = 0.0;
        System.out.println();
        System.out.println("TAXES PAID: ");
        for (TaxPayer tp : list) {
            double tax = tp.tax();
            System.out.println(tp.getName() + ": $ " + String.format("%.2f", tax));
            sum += tax;
        }

        System.out.println();
        System.out.println("TOTAL TAXES: $ " + String.format("%.2f", sum));
    }
}
