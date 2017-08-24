package com.kodilla.good.patterns.fooddelivery;

public class OrderProcessor {
    private ClientInformationServices clientInformationServices;
    private VendorInformationServices vendorInformationServices;
    private WriteOrderServices writeOrderServices;
    private VendorSpecificOrderProcessor vendorSpecificOrderProcessor;

    public OrderProcessor(ClientInformationServices clientInformationServices, VendorInformationServices vendorInformationServices, WriteOrderServices writeOrderServices, VendorSpecificOrderProcessor vendorSpecificOrderProcessor) {
        this.clientInformationServices = clientInformationServices;
        this.vendorInformationServices = vendorInformationServices;
        this.writeOrderServices = writeOrderServices;
        this.vendorSpecificOrderProcessor = vendorSpecificOrderProcessor;
    }

    public boolean processOrder(final Order order){

        boolean isItemAvailable = vendorSpecificOrderProcessor.process(order.getItem(), order.getAmount());

        /*
        boolean isItemAvailable = true;

        if(order.getVendor().getVendorName().equals("Healthy Shop")) {
            HealthyShopOrderValidator test = new HealthyShopOrderValidator();
            isItemAvailable = test.process(order.getItem(), order.getAmount());
        }
        else if(order.getVendor().getVendorName().equals("Extra Food Shop")){
            ExtraFoodShopOrderValidator test = new ExtraFoodShopOrderValidator();
            isItemAvailable = test.process(order.getItem(), order.getAmount());
        }
        else if (order.getVendor().getVendorName().equals("Gluten Free Shop")){
            GlutenFreeShopOrderValidator test = new GlutenFreeShopOrderValidator();
            isItemAvailable = test.process(order.getItem(), order.getAmount());
        }
        */

        if(isItemAvailable){
            clientInformationServices.sentMessage(order.getClient(),true);
            vendorInformationServices.sentConfirmation(order.getItem(),order.getAmount());
            writeOrderServices.writeOrder();
            return true;

        }
        else{
            clientInformationServices.sentMessage(order.getClient(),false);
            return false;
        }
    }
}



