package Programacao_Orientada_Objetos.Application;

import Programacao_Orientada_Objetos.Entities.Department;
import Programacao_Orientada_Objetos.Entities.Enums.WorkerLevel;
import Programacao_Orientada_Objetos.Entities.HourContract;
import Programacao_Orientada_Objetos.Entities.Worker;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class Exercicio9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.print("Entre o nome do departamento: ");
        String departamentName = scanner.nextLine();

        Department dept = new Department(departamentName);

        System.out.println("Entre os dados do trabalhador:");
        System.out.print("Nome: ");
        String workerName = scanner.nextLine();
        System.out.print("Nível: ");
        WorkerLevel workerLevel = WorkerLevel.valueOf(scanner.nextLine());
        System.out.print("Salario base: ");
        double baseSalary = scanner.nextDouble();

        Worker worker = new Worker(workerName, workerLevel, baseSalary, dept);
        int n = scanner.nextInt();

        for (int i=1; i<=n; i++) {
            IO.println("Entre com os dados do contrato #" + i + ":");
            IO.print("Data (DD/MM/YYYY): ");
            LocalDate contractDate = LocalDate.parse(scanner.next(), fmt1);
            IO.print("Valor por hora: ");
            double valuePerHour = scanner.nextDouble();
            IO.print("Duracao (horas): ");
            int hours = scanner.nextInt();
            HourContract contract = new HourContract(contractDate, valuePerHour, hours);
            worker.addContract(contract);
        }

        IO.println();
        IO.print("Entre o ano e mes para calcular o ganho (MM/YYYY): ");
        String monthAndYear = scanner.next();

        int month = Integer.parseInt(monthAndYear.substring(0, 2));
        int year = Integer.parseInt(monthAndYear.substring(3));

        IO.println("Nome: " + worker.getName());
        IO.println("Departamento: " + worker.getDepartment().getName());
        IO.println("Ganho para " + monthAndYear + ": " + String.format("%.2f", worker.income(year, month)));

    }
}
