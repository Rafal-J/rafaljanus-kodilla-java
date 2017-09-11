package com.kodilla.patterns.builder.bigmac;

import org.junit.Assert;
import org.junit.Test;

public class BigmacTestSuite {

    @Test
    public void bigmacTest() {
        Bigmac myBigmac = new Bigmac.BigmacBuilder()
                .sauce(BigmacSauces.tysiąc_wysp)
                .burgers(5)
                .roll(BigmacRoll.bez_sezamu)
                .ingredient(BigmacIngredients.bekon)
                .ingredient(BigmacIngredients.krewetki)
                .ingredient(BigmacIngredients.cebula)
                .ingredient(BigmacIngredients.papryczki_chilli)
                .build();

        System.out.println(myBigmac);

        int numberOfIngredients = myBigmac.getIngredients().size();

        Assert.assertEquals(4, numberOfIngredients);
        Assert.assertTrue(myBigmac.getBurgers() == 5);
        Assert.assertTrue(myBigmac.getRoll().toString().equals("bez_sezamu"));
    }
}
