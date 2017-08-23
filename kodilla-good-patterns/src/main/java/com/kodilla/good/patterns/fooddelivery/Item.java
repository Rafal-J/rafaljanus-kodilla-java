package com.kodilla.good.patterns.fooddelivery;

/**
 * Created by RJanus on 23.08.2017.
 */
public class Item {
    private String itemName;
    private double itemPrice;

    public Item(String itemName, double itemPrice) {
        this.itemName = itemName;
        this.itemPrice = itemPrice;
    }

    public String getItemName() {
        return itemName;
    }

    public double getItemPrice() {
        return itemPrice;
    }
}
