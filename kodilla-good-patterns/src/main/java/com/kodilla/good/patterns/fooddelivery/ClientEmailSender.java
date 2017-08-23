package com.kodilla.good.patterns.fooddelivery;

/**
 * Created by RJanus on 23.08.2017.
 */
public class ClientEmailSender implements ClientInformationServices {
    public void sentMessage(Client client,boolean isAvailable){
        if(isAvailable){
            System.out.println("Drogi " + client.getUserRealName() + "! Twoje zamówienie zostało złożone");
        }
        else{
            System.out.println("Drogi " + client.getUserRealName() + "! Twoje zamówienie zawiera błędy.");
        }
    }
}
