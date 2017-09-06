package com.kodilla.patterns.strategy.social;

import org.junit.After;
import org.junit.Assert;
import org.junit.Test;

public class UserTestSuite {

    @After
    public void insertLine(){
        System.out.println();
    }

    @Test
    public void testDefaultSharingStrategies(){
        Millenials millenial = new Millenials("Jan Nowak");
        YGeneration yGen = new YGeneration("Piotr Kowalski");
        ZGeneration zGen = new ZGeneration("Andrzej Jaworski");

        millenial.getSocialPublisher().share(millenial.getUserName());
        yGen.getSocialPublisher().share(yGen.getUserName());
        zGen.getSocialPublisher().share(zGen.getUserName());

        Assert.assertEquals("FacebookPublisher",millenial.getSocialPublisher().getClass().getSimpleName());
        Assert.assertEquals("SnapchatPublisher",yGen.getSocialPublisher().getClass().getSimpleName());
        Assert.assertTrue(zGen.getSocialPublisher().getClass().getSimpleName().equals("TwitterPublisher"));
    }

    @Test
    public void IndividualSharingStrategy(){
        Millenials millenial = new Millenials("Jan Nowak");
        YGeneration yGen = new YGeneration("Piotr Kowalski");
        ZGeneration zGen = new ZGeneration("Andrzej Jaworski");

        millenial.setSocialPublisher(new SnapchatPublisher());
        yGen.setSocialPublisher(new TwitterPublisher());
        zGen.setSocialPublisher(new FacebookPublisher());

        millenial.getSocialPublisher().share(millenial.getUserName());
        yGen.getSocialPublisher().share(yGen.getUserName());
        zGen.getSocialPublisher().share(zGen.getUserName());

        Assert.assertEquals("SnapchatPublisher",millenial.getSocialPublisher().getClass().getSimpleName());
        Assert.assertEquals("TwitterPublisher",yGen.getSocialPublisher().getClass().getSimpleName());
        Assert.assertTrue(zGen.getSocialPublisher().getClass().getSimpleName().equals("FacebookPublisher"));
    }
}