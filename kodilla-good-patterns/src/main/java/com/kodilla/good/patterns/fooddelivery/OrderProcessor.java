package com.kodilla.good.patterns.fooddelivery;

public class OrderProcessor {
    private ClientInformationServices clientInformationServices;
    private VendorInformationServices vendorInformationServices;
    private WriteOrderServices writeOrderServices;

    public OrderProcessor(ClientInformationServices clientInformationServices, VendorInformationServices vendorInformationServices, WriteOrderServices writeOrderServices) {
        this.clientInformationServices = clientInformationServices;
        this.vendorInformationServices = vendorInformationServices;
        this.writeOrderServices = writeOrderServices;
    }

    public boolean processOrder(Order order){

        boolean isItemAvailable = VendorSpecificOrderProcessor.process(order.getItem(),order.getAmount());

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



