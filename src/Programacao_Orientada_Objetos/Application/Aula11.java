package Programacao_Orientada_Objetos.Application;

import Programacao_Orientada_Objetos.Entities.Enums.OrderStatus;
import Programacao_Orientada_Objetos.Entities.Order;

import java.util.Date;

public class Aula11 {
    public static void main(String[] args) {

        Order order = new Order(1080, new Date(), OrderStatus.PENDING_PAYMENT);

        System.out.println(order);

        OrderStatus os1 = OrderStatus.DELIVERED;
        OrderStatus os2 = OrderStatus.valueOf("DELIVERED");

        System.out.println(os1);
        System.out.println(os2);



    }
}
