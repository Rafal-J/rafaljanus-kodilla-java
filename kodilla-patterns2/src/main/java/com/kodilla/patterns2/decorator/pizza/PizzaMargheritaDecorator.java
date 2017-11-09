package com.kodilla.patterns2.decorator.pizza;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

@Component
public class PizzaMargheritaDecorator extends AbstractPizzaMargheritaOrder {
    String ingredient;

    @Autowired
    private PizzaIngredientsPriceList pizzaIngredientsPriceList;

    @Autowired(required=true)
    public PizzaMargheritaDecorator(PizzaOrder pizzaOrder) {
        super(pizzaOrder);
    }

    public PizzaMargheritaDecorator(PizzaOrder pizzaOrder, String ingredient) {
        super(pizzaOrder);
        this.ingredient = ingredient;
    }

    @Override
    public BigDecimal getPrice() {
        return pizzaOrder.getPrice().add(pizzaIngredientsPriceList.getIngredients().get(ingredient));
    }

    @Override
    public String getIngredients() {
        return super.getIngredients();
        }
}