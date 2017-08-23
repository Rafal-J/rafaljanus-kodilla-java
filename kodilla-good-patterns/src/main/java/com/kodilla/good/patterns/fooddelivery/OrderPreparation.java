package com.kodilla.good.patterns.fooddelivery;

/**
 * Created by RJanus on 23.08.2017.
 */
public class OrderPreparation {
    public static Order newOrder(){
        Client newClient = new Client("Kowal", "Jan Kowal", 0.05);
        Vendor newVendor = new Vendor("ExtraFoodShop");
        Item newItem = new Item("Marchewki",2.5);
        Order newOrder = new Order(newClient,newVendor,newItem,205);
        return newOrder;
    }
}
