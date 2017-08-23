package com.kodilla.good.patterns.allegro;

/**
 * Created by RJanus on 23.08.2017.
 */
public interface InformationService {
    void sentMessageToBuyer(User buyer,String messageBody);
    void sentMessageToSeller(User seller,String messageBody);

}
