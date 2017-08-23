package com.kodilla.good.patterns.allegro;

public class OrderValidator implements OrderService {
    @Override
    public boolean validateOrder(User buyer, User seller, String item, double price, double amount){
        if(buyer!=null && seller!=null && item!=null && price > 0 && amount > 0){
            return true;
        }

        return false;
    }
}
