package Programacao_Orientada_Objetos_PT2.Application;

import Programacao_Orientada_Objetos_PT2.Model.Entities.Product1;

import java.util.ArrayList;
import java.util.List;

public class Aula26 {
    public static void main(String[] args) {
        List<Product1> list = new ArrayList<>();

        list.add(new Product1("TV", 900.00));
        list.add(new Product1("Notebook", 1200.00));
        list.add(new Product1("Tablet", 450.00));

        list.sort((p1,p2) -> p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase()));

        for (Product1 p : list) {
            System.out.println(p);
        }
    }
}
