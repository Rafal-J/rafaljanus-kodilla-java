package com.kodilla.good.patterns.fooddelivery;

public interface VendorSpecificOrderProcessor {
    boolean process(Item item,double amount);
}
