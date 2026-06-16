package Programacao_Orientada_Objetos.Application;

import Programacao_Orientada_Objetos.Entities.Account2;
import Programacao_Orientada_Objetos.Entities.BusinessAccount1;
import Programacao_Orientada_Objetos.Entities.SavingsAccount;

public class Aula13 {
    public static void main(String[] args) {

        Account2 acc = new Account2(1001, "Alex", 0.0);
        BusinessAccount1 bacc = new BusinessAccount1(1002, "Maria", 0.0, 500.0);

        // UPCASTING

        Account2 acc1 = bacc;
        Account2 acc2 = new BusinessAccount1(1003, "Bob", 0.0, 200.0);
        Account2 acc3 = new SavingsAccount(1004, "Anna", 0.0, 0.01);

        // DOWNCASTING

        BusinessAccount1 acc4 = (BusinessAccount1) acc2;
        acc4.loan(100.0);

        // BusinessAccount1 acc5 = (BusinessAccount1) acc3;
        if (acc3 instanceof BusinessAccount1) {
            BusinessAccount1 acc5 = (BusinessAccount1) acc3;
            acc5.loan(200.0);
            System.out.println("Loan!");
        }

        if (acc3 instanceof SavingsAccount) {
            SavingsAccount acc5 = (SavingsAccount) acc3;
            acc5.updateBalance();
            System.out.println("Update!");
        }

        Account2 acc6 = new Account2(1005, "Bethut", 1000.0);
        acc6.withdraw(200.0);
        System.out.println(acc6.getBalance());

        Account2 acc7 = new SavingsAccount(1006, "Antônio", 1000.0, 0.01);
        acc7.withdraw(200.0);
        System.out.println(acc7.getBalance());

        Account2 acc8 = new BusinessAccount1(1007, "Lixolas", 1000.0, 500.0);
        acc8.withdraw(200.0);
        System.out.println(acc8.getBalance());
    }
}
