package com.kodilla.good.patterns.fooddelivery;

public class Client {
    private String userNickName;
    private String userRealName;
    private double discount;

    public Client(String userNickName, String userRealName, double discount) {
        this.userNickName = userNickName;
        this.userRealName = userRealName;
        this.discount = discount;
    }

    public String getUserNickName() {
        return userNickName;
    }

    public String getUserRealName() {
        return userRealName;
    }

    public double getDiscount() {
        return discount;
    }
}
