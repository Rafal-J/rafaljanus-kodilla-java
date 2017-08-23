package com.kodilla.good.patterns.fooddelivery;

/**
 * Created by RJanus on 23.08.2017.
 */
public class Application {
    public static void main(String[] args){
        Order newOrder = OrderPreparation.newOrder();

        OrderProcessor orderProcessor = new OrderProcessor(new ClientEmailSender(), new VendorEmailSender(), new WriteToDB(), new ExtraFoodShopOrderValidator());
        boolean processOrder = orderProcessor.processOrder(newOrder);

    }
}
