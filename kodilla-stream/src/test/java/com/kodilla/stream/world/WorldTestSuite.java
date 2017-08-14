package com.kodilla.stream.world;

import com.kodilla.stream.sand.Europe;
import org.junit.Assert;
import org.junit.Test;
import java.math.BigDecimal;

public class WorldTestSuite {

    @Test
    public void TestgetNumberOfPeople() {
        BigDecimal inEurope = new BigDecimal("25000000");
        BigDecimal inAsia = new BigDecimal("100000000");
        BigDecimal inAfrica = new BigDecimal("50000000");
        BigDecimal inAmerica = new BigDecimal("50000000");


        Country poland = new Country("Poland", inEurope);
        Country germany = new Country("Germany", inEurope);
        Country france = new Country("France", inEurope);
        Country hungary = new Country("Hungary", inEurope);

        Country china = new Country("China", inAsia);
        Country korea = new Country("Korea", inAsia);
        Country japan = new Country("Japan", inAsia);

        Country tanzania = new Country("Tanzania", inAfrica);
        Country kenia = new Country("Kenia", inAfrica);
        Country egypt = new Country("Egypt", inAfrica);

        Country usa = new Country("USA", inAmerica);
        Country canada = new Country("Canada", inAmerica);

        Continent europe = new Continent("Europe");
        europe.addCountry(poland);
        europe.addCountry(germany);
        europe.addCountry(france);
        europe.addCountry(hungary);

        Continent asia = new Continent("Asia");
        asia.addCountry(china);
        asia.addCountry(korea);
        asia.addCountry(japan);

        Continent africa = new Continent("Africa");
        africa.addCountry(tanzania);
        africa.addCountry(kenia);
        africa.addCountry(egypt);

        Continent america = new Continent("America");
        america.addCountry(usa);
        america.addCountry(canada);

        World ourWorld = new World();
        ourWorld.addContinent(europe);
        ourWorld.addContinent(asia);
        ourWorld.addContinent(africa);
        ourWorld.addContinent(america);

        Assert.assertEquals(4,ourWorld.getListOfContinents().size());
        Assert.assertEquals(new BigDecimal("650000000"),ourWorld.getNumberOfPeople());

        Assert.assertEquals(new BigDecimal("300000000"),ourWorld.getNumberOfPeopleFromContinent("Asia"));

    }
}