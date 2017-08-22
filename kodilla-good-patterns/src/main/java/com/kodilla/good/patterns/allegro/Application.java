package com.kodilla.good.patterns.allegro;

/**
 * Created by RJanus on 22.08.2017.
 */
public class Application {
    public static void main(String[] args){
        User seller = new User("Kowal","Piotr Kowalski");
        User buyer = new User("Nowy", "Jan Nowak");

        Order order = new Order(buyer, seller, "Latarka",20.5,2);

        ProductOrderService processNewOrder = ProductOrderService(new InformationService, new OrderService, new OrderRepository();
        processNewOrder.process(order);

    }
}
