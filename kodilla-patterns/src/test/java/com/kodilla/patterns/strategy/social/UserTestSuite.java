package com.kodilla.patterns.strategy.social;

import org.junit.After;
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
    }
}