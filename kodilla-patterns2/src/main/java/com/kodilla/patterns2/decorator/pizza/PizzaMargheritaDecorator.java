package com.kodilla.patterns2.decorator.pizza;

import java.math.BigDecimal;
import java.util.HashMap;

public class PizzaMargheritaDecorator extends AbstractPizzaMargheritaOrderDecorator {
    String ingredient;
    HashMap<String, BigDecimal> pizzaIngredientsPriceList = new PizzaIngredientsPriceList().getIngredientsPriceList();

    public PizzaMargheritaDecorator(PizzaOrder pizzaOrder, String ingredient) {
        super(pizzaOrder);
        this.ingredient = ingredient;
    }

    @Override
    public BigDecimal getPrice() {
        return pizzaOrder.getPrice().add(pizzaIngredientsPriceList.get(ingredient));
    }

    @Override
    public String getIngredients() {
        return pizzaOrder.getIngredients() + " + " + ingredient;
        }
}