package com.kodilla.patterns2.decorator.pizza;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest

public class PizzaOrderTest {
    @Autowired
    private PizzaIngredientsPriceList priceList;

    @Test
    public void priceTest() {
        BigDecimal price = priceList.getIngredients().get("szynka");

        Assert.assertEquals(new BigDecimal(4), price);
    }

    @Test
    public void getPrice() {
        PizzaOrder pizzaOrder = new PizzaMargherita();
        pizzaOrder = new PizzaMargheritaDecorator(pizzaOrder, "szynka");

        BigDecimal price = pizzaOrder.getPrice();

        Assert.assertEquals(new BigDecimal(20), price);
    }

    /*
    @Test
    public void getIngredients() {
    } */

}