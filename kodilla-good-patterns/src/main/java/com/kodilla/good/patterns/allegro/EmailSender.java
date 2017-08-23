package com.kodilla.good.patterns.allegro;

/**
 * Created by RJanus on 23.08.2017.
 */
public class EmailSender implements InformationService {
    public void sentMessageToBuyer(User buyer,String messageBody){
        System.out.println("Drogi " + buyer.getUserRealname() + ". " + messageBody);
    }

    public void sentMessageToSeller(User seller,String messageBody){
        System.out.println("Drogi " + seller.getUserRealname() + ". " + messageBody);
    }

}
