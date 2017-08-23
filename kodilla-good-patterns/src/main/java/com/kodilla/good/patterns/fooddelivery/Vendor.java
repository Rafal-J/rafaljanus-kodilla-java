package com.kodilla.good.patterns.fooddelivery;

/**
 * Created by RJanus on 23.08.2017.
 */
public class Vendor {
    private final String vendorName;
    private final String vendorCity;
    private final String NIP;

    public Vendor(String vendorName, String vendorCity, String NIP) {
        this.vendorName = vendorName;
        this.vendorCity = vendorCity;
        this.NIP = NIP;
    }

    public String getVendorName() {
        return vendorName;
    }

    public String getVendorCity() {
        return vendorCity;
    }

    public String getNIP() {
        return NIP;
    }
}
