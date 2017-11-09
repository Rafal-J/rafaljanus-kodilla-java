package com.kodilla.patterns2.decorator.pizza;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;

public class PizzaMargherita implements PizzaOrder {
    private final BigDecimal price = new BigDecimal(20);
    private final String ingredients = "Pizza Margherita (ciasto, sos pomidorowy i ser)";

    @Override
    public BigDecimal getPrice() {
        return price;
    }

    @Override
    public String getIngredients() {
        return ingredients;
    }
}