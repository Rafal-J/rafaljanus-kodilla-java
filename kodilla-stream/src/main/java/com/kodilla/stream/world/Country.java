package com.kodilla.stream.world;

import java.math.BigDecimal;

public final class Country {
    private final String nameOfCountry;
    private final BigDecimal numberOfPeople;

    public Country(String nameOfCountry, BigDecimal numberOfPeople) {
        this.nameOfCountry = nameOfCountry;
        this.numberOfPeople = numberOfPeople;
    }

    public BigDecimal getNumberOfPeople() {
        return numberOfPeople;
    }
}
