package Programacao_Orientada_Objetos_PT2.Application;

import Programacao_Orientada_Objetos_PT2.Model.Entities.Contract;
import Programacao_Orientada_Objetos_PT2.Model.Entities.Installment;
import Programacao_Orientada_Objetos_PT2.Model.Services.ContractService;
import Programacao_Orientada_Objetos_PT2.Model.Services.PaypalService;

import java.time.LocalDate;

import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class Exercicio17 {
    public static void main() {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.println("Entre com os dados do contrato: ");
        System.out.print("Numero: ");
        int number = scanner.nextInt();
        System.out.print("Data (dd/MM/yyyy): ");
        LocalDate date = LocalDate.parse(scanner.next(), fmt);
        System.out.print("Valor do contrato: ");
        double totalValue = scanner.nextDouble();

        Contract obj = new Contract(number, date, totalValue);

        System.out.println("Entre com o numero de parcelas: ");
        int n = scanner.nextInt();

        ContractService contractService = new ContractService(new PaypalService());

        contractService.processContract(obj, n);

        System.out.println("Parcelas: ");
        for (Installment installment : obj.getInstallments()) {
            System.out.println(installment);
        }
    }
}
