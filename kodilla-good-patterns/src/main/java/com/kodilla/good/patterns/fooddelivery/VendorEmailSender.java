package com.kodilla.good.patterns.fooddelivery;

/**
 * Created by RJanus on 23.08.2017.
 */
public class VendorEmailSender implements VendorInformationServices{
    public void sentConfirmation(Item item, double amount){
        System.out.println("Potwierdzamy zamówienie na " + item.getItemName() + ". Cena: " + item.getItemPrice() + ". Ilość: " + amount);
    }
}
