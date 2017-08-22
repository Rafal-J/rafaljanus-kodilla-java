package com.kodilla.good.patterns.allegro;

/**
 * Created by RJanus on 22.08.2017.
 */
public class Order {
    private User buyer;
    private User seller;
    private String item;
    private double price;
    private int amount;

    public Order(User buyer, User seller, String item, double price, int amount) {
        this.buyer = buyer;
        this.seller = seller;
        this.item = item;
        this.price = price;
        this.amount = amount;
    }

    public User getBuyer() {
        return buyer;
    }

    public User getSeller() {
        return seller;
    }

    public String getItem() {
        return item;
    }

    public double getPrice() {
        return price;
    }

    public int getAmount() {
        return amount;
    }
}
