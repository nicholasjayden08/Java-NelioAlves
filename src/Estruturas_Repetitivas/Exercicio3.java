package Estruturas_Repetitivas;

import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int diasSemana = scanner.nextInt();
        String dia;

        switch (diasSemana) {
            case 1:
                dia = "Domingo";
                break;
            case 2:
                dia = "Segunda";
                break;
            case 3:
                dia = "Terça";
                break;
            case 4:
                dia = "Quarta";
                break;
            case 5:
                dia = "Quinta";
                break;
            case 6:
                dia = "Sexta";
                break;
            case 7:
                dia = "Sábado";
                break;
            default:
                dia = "Valor imvalido";
                break;
        }
        System.out.println("Dias da semana: " + dia);
    }
}
