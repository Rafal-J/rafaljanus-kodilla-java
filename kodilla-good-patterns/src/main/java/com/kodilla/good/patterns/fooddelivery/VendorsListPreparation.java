package com.kodilla.good.patterns.fooddelivery;

public class VendorsListPreparation {
    public static void preparingList(VendorsList vendorsList){
        Vendor newVendor1 = new Vendor("Extra Food Shop", "Zgierz", "1130385921", new ExtraFoodShopOrderValidator());
        Vendor newVendor2 = new Vendor("Gluten Free Shop", "Koszalin", "9522135502", new GlutenFreeShopOrderValidator());
        Vendor newVendor3 = new Vendor("Healthy Shop", "Kazimierz", "1152050023", new HealthyShopOrderValidator());

        vendorsList.addNewVendor(newVendor1);
        vendorsList.addNewVendor(newVendor2);
        vendorsList.addNewVendor(newVendor3);

    }
}
