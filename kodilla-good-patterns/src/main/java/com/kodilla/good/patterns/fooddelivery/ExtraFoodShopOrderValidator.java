package com.kodilla.good.patterns.fooddelivery;

public class ExtraFoodShopOrderValidator implements VendorSpecificOrderProcessor {
    public boolean process(Item item, double amount){
        String[] itemsList = {"Ziemniaki","Marchewki"};
        double amountOfMarchewki = 1000;
        if((item.getItemName().equals(itemsList[0]) || item.getItemName().equals(itemsList[1])) && amount <= amountOfMarchewki) {
            return true;
        }
        else{
            return false;
        }
    }
}
