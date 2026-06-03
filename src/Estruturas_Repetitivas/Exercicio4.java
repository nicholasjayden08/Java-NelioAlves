package Estruturas_Repetitivas;

import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String senhaInvalida = "Senha Inválida";
        String acessoPermitido = "Acesso Permitido";

        int senha = scanner.nextInt();

        while (senha != 2002) {
            System.out.println(senhaInvalida);
            senha = scanner.nextInt();
        }

        System.out.println(acessoPermitido);

    }
}
