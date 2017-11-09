package com.kodilla.patterns2.decorator.pizza;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.HashMap;

@Component
public class PizzaIngredientsPriceList {
    private final HashMap<String, BigDecimal> ingredients = new HashMap<>();

    public PizzaIngredientsPriceList() {
        ingredients.put("papryka", new BigDecimal(2.5));
        ingredients.put("dodatkowy ser", new BigDecimal(3.5));
        ingredients.put("pieczarki", new BigDecimal(2));
        ingredients.put("szynka", new BigDecimal(4));
        ingredients.put("szparagi", new BigDecimal(5));
        ingredients.put("kiełbasa", new BigDecimal(3.5));
        ingredients.put("oliwki", new BigDecimal(2.5));
        ingredients.put("boczek", new BigDecimal(2.5));
        ingredients.put("cebula", new BigDecimal(1));
        ingredients.put("kurczak", new BigDecimal(2.5));
        ingredients.put("pomidory", new BigDecimal(3));
        ingredients.put("czosnek", new BigDecimal(1.5));
    }

    public HashMap<String, BigDecimal> getIngredients() {
        return ingredients;
    }
}
