package Programacao_Orientada_Objetos_PT2.Application;

import Programacao_Orientada_Objetos_PT2.Model.Entities.Circle;
import Programacao_Orientada_Objetos_PT2.Model.Entities.Rectangle;
import Programacao_Orientada_Objetos_PT2.Model.Entities.Shape;

import java.util.ArrayList;
import java.util.List;

public class Aula25 {
   public static void main(String[] args) {
       List<Shape> myShapes = new ArrayList<>();
       myShapes.add(new Rectangle(3.0, 2.0));
       myShapes.add(new Circle(2.0));

       System.out.println("Total area: " + totalArea(myShapes));
    }

    public static double totalArea(List<Shape> list) {
       double sum = 0.0;
       for (Shape s : list) {
           sum += s.area();
       }
       return sum;
    }
}
