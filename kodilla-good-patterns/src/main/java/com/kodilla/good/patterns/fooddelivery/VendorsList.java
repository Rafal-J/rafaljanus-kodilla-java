package com.kodilla.good.patterns.fooddelivery;

import java.util.ArrayList;

public class VendorsList {
    private ArrayList<Vendor> vendorsList = new ArrayList<Vendor>();

    public void addNewVendor(Vendor vendor){
        vendorsList.add(vendor);
    }

    public ArrayList<Vendor> getVendorsList() {
        return vendorsList;
    }
}
