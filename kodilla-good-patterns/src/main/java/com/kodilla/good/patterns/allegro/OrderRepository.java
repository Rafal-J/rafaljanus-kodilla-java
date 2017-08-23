package com.kodilla.good.patterns.allegro;

public interface OrderRepository {
    void writeOrderToDB(User buyer, User seller, String item, double price, int amount);
}
