package com.kodilla.patterns2.decorator.pizza;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;

import static org.junit.Assert.*;

public class PizzaOrderTest {

    @Test
    public void getPriceTest() {
        PizzaOrder pizzaOrder = new PizzaMargherita();
        pizzaOrder = new PizzaMargheritaDecorator(pizzaOrder, "szynka");
        pizzaOrder = new PizzaMargheritaDecorator(pizzaOrder, "pieczarki");
        pizzaOrder = new PizzaMargheritaDecorator(pizzaOrder, "oliwki");

        BigDecimal price = pizzaOrder.getPrice();

        Assert.assertEquals(new BigDecimal(28.5), price);
    }

    @Test
    public void getIngredientsTest() {
        PizzaOrder pizzaOrder = new PizzaMargherita();
        pizzaOrder = new PizzaMargheritaDecorator(pizzaOrder, "szynka");
        pizzaOrder = new PizzaMargheritaDecorator(pizzaOrder, "czosnek");
        pizzaOrder = new PizzaMargheritaDecorator(pizzaOrder, "papryka");

        String ingredients = pizzaOrder.getIngredients();

        Assert.assertEquals("Pizza Margherita (ciasto, sos pomidorowy i ser) + szynka + czosnek + papryka", ingredients);
    }
}