package Programacao_Orientada_Objetos_PT2.Application;

import java.util.Arrays;

public class Aula27 {

    public static int globalValue = 10;

    public static void main(String[] args) {
        int [] vect = new int[] { 3, 4, 5 };
        changedOddValue(vect);
        System.out.println(Arrays.toString(vect));
    }

    public static void changedOddValue(int [] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 != 0) {
                numbers[i] += globalValue;
            }
        }
    }
}
