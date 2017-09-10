package com.kodilla.patterns.builder.bigmac;

import org.junit.Assert;
import org.junit.Test;

public class BigmacTestSuite {

    @Test
    public void bigmacTest() {
        Bigmac myBigmac = new Bigmac.BigmacBuilder()
                .sauce("barbecue")
                .burgers(5)
                .roll("bez sezamu")
                .ingredient("sałata")
                .ingredient("cebula")
                .ingredient("bekon")
                .ingredient("ogórek")
                .build();

        System.out.println(myBigmac);

        int numberOfIngredients = myBigmac.getIngredients().size();

        Assert.assertEquals(4, numberOfIngredients);
        Assert.assertTrue(myBigmac.getBurgers() == 5);
        Assert.assertTrue(myBigmac.getRoll().equals("bez sezamu"));
    }
}
