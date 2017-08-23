package com.kodilla.good.patterns.allegro;

public interface OrderService {
    boolean validateOrder(User buyer, User seller, String item, double price, double amount);
}
