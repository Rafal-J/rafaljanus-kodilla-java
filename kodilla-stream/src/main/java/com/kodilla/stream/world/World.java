package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class World {
    private final List<Continent> listOfContinents = new ArrayList<>();

    public void addContinent(Continent continent){
        listOfContinents.add(continent);
    }

    public BigDecimal getNumberOfPeople(){
        return listOfContinents.stream()
                .flatMap(continent -> continent.getListOfCountries().stream())
                .map(s -> s.getNumberOfPeople())
                .reduce(BigDecimal.ZERO,(a,b) -> a = a.add(b));
    }

    public BigDecimal getNumberOfPeopleFromContinent(String nameOfContinent){
        return listOfContinents.stream()
                .filter(s -> s.getNameOfContinent()==nameOfContinent)
                .flatMap(continent -> continent.getListOfCountries().stream())
                .map(s -> s.getNumberOfPeople())
                .reduce(BigDecimal.ZERO,(a,b) -> a = a.add(b));
    }

    public List<Continent> getListOfContinents() {
        return listOfContinents;
    }
}

