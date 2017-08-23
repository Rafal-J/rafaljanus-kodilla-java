package com.kodilla.good.patterns.fooddelivery;

/**
 * Created by RJanus on 23.08.2017.
 */
public class ExtraFoodShopOrderValidator implements VendorSpecificOrderProcessor {
    public boolean process(Item item, double amount){
        String[] itemsList = {"Ziemniaki","Marchewki"};
        double amountOfMarchewki = 100;
        if((item.getItemName() == itemsList[0] || item.getItemName() == itemsList[1]) && amount <= amountOfMarchewki) {
            return true;
        }
        else{
            return false;
        }
    }
}
