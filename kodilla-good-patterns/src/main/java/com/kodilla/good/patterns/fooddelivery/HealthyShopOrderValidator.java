package com.kodilla.good.patterns.fooddelivery;

import java.util.ArrayList;
import java.util.Arrays;

public class HealthyShopOrderValidator implements VendorSpecificOrderProcessor {
    public boolean process(Item item, double amount){
        ArrayList<String> productsList = new ArrayList<String>(Arrays.asList("Ziemniaki","Cebula","Marchewki"));
        double amountOfMarchewki = 100;
        if(productsList.contains(item.getItemName()) && amount <= amountOfMarchewki) {
            return true;
        }
        else{
            return false;
        }
    }
}
