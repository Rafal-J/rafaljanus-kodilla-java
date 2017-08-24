package com.kodilla.good.patterns.fooddelivery;

import java.util.HashMap;

public class GlutenFreeShopOrderValidator implements VendorSpecificOrderProcessor {
    public boolean process(Item item, double amount){
        HashMap<String,Double> productsList = new HashMap<String,Double>();
        productsList.put("Ziemniak",(double)50);
        productsList.put("Marchewki",(double)100);
        productsList.put("Cebula",(double)20);

        if(productsList.containsKey("Marchewki") && amount <= productsList.get(item.getItemName())){
            return true;
        }
        else{
            return false;
        }
    }
}
