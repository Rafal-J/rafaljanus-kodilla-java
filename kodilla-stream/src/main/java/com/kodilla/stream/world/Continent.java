package com.kodilla.stream.world;

import java.util.ArrayList;
import java.util.List;

public final class Continent {
    private final String nameOfContinent;
    private final List<Country> listOfCountries = new ArrayList<>();

    public Continent(String nameOfContinent) {
        this.nameOfContinent = nameOfContinent;
    }

    public void addCountry(Country country){
    listOfCountries.add(country);
    }

    public List<Country> getListOfCountries() {
        return listOfCountries;
    }

    public String getNameOfContinent() {
        return nameOfContinent;
    }
}

