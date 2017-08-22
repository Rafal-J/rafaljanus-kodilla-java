package com.kodilla.good.patterns.allegro;

/**
 * Created by RJanus on 23.08.2017.
 */
public class OrderDto {
    private User buyer;
    private User seller;
    boolean isOrderSucces;

    public OrderDto(User buyer, User seller, boolean isOrderSucces) {
        this.buyer = buyer;
        this.seller = seller;
        this.isOrderSucces = isOrderSucces;
    }

    public User getBuyer() {
        return buyer;
    }

    public User getSeller() {
        return seller;
    }

    public boolean isOrderSucces() {
        return isOrderSucces;
    }
}
