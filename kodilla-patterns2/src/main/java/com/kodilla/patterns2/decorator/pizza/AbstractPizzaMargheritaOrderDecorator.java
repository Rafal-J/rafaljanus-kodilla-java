package com.kodilla.patterns2.decorator.pizza;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

public abstract class AbstractPizzaMargheritaOrderDecorator implements PizzaOrder {
    public final PizzaOrder pizzaOrder;
    String ingredient;

    public AbstractPizzaMargheritaOrderDecorator(PizzaOrder pizzaOrder) {
        this.pizzaOrder = pizzaOrder;
    }

    @Override
    public BigDecimal getPrice() {
        return pizzaOrder.getPrice();
    }

    @Override
    public String getIngredients() {
        return pizzaOrder.getIngredients();
    }
}