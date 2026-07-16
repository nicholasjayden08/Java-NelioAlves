package Programacao_Orientada_Objetos_PT2.Model.Entities;

public class Product1 {
    private String name;
    private Double price;

    public Product1() {
    }

    public Product1(String name, Double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product [name=" + name + ", price=" + price + "]";
    }
}
