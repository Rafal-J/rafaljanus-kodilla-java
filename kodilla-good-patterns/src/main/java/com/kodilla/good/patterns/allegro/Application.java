package com.kodilla.good.patterns.allegro;

public class Application {
    public static void main(String[] args){
        User seller = new User("Kowal","Piotr Kowalski");
        User buyer = new User("Nowy", "Jan Nowak");

        Order order = new Order(buyer, seller, "Latarka",20.5,2);

        ProductOrderService processNewOrder = new ProductOrderService(new EmailSender(), new OrderValidator(), new OrderDB());
        processNewOrder.process(order);

    }
}
