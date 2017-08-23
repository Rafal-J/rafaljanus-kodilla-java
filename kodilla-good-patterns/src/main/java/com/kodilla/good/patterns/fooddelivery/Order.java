package com.kodilla.good.patterns.fooddelivery;

public class Order {
    private Client client;
    private Vendor vendor;
    private Item item;
    private double amount;
    private double totalPrice;

    public Order(Client client, Vendor vendor, Item item, double amount) {
        this.client = client;
        this.vendor = vendor;
        this.item = item;
        this.amount = amount;
        this.totalPrice = amount * item.getItemPrice() * (1-client.getDiscount());
    }

    public Client getClient() {
        return client;
    }

    public Vendor getVendor() {
        return vendor;
    }

    public Item getItem() {
        return item;
    }

    public double getAmount() {
        return amount;
    }

    public double getTotalPrice() {
        return totalPrice;
    }
}