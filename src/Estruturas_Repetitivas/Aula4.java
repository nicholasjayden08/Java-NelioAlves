package Estruturas_Repetitivas;

import java.util.Locale;
import java.util.Scanner;

public class Aula4 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        int minutos = scanner.nextInt();

        double conta = 50.0;
        if (minutos > 100) {
            conta += (minutos - 100) * 2.0;
        }

        System.out.println("Valor da conta a pagar = R$ " + conta);
    }
}
