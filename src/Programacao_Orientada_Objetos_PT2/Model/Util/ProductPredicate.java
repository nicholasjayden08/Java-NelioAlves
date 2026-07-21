package Programacao_Orientada_Objetos_PT2.Model.Util;

import Programacao_Orientada_Objetos_PT2.Model.Entities.Product1;

import java.util.function.Predicate;

public class ProductPredicate implements Predicate<Product1> {

    @Override
    public boolean test(Product1 p) {
        return p.getPrice() >= 100.0;
    }
}
