package com.kodilla.good.patterns.fooddelivery;

public class Vendor {
    private final String vendorName;
    private final String vendorCity;
    private final String NIP;
    private VendorSpecificOrderProcessor vendorSpecificOrderProcessor;

    public Vendor(String vendorName, String vendorCity, String NIP, VendorSpecificOrderProcessor vendorSpecificOrderProcessor) {
        this.vendorName = vendorName;
        this.vendorCity = vendorCity;
        this.NIP = NIP;
        this.vendorSpecificOrderProcessor = vendorSpecificOrderProcessor;
    }

    public String getVendorName() {
        return vendorName;
    }

    public VendorSpecificOrderProcessor getVendorSpecificOrderProcessor() {
        return vendorSpecificOrderProcessor;
    }

    public String getVendorCity() {
        return vendorCity;
    }

    public String getNIP() {
        return NIP;
    }
}
