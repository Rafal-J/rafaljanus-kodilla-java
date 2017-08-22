package com.kodilla.good.patterns.challanges;

import java.util.*;

public class MovieStore {

    public static ArrayList<List<String>> getMovies() {

        ArrayList<List<String>> moviesTitlesWithTranslations = new ArrayList<>();
        moviesTitlesWithTranslations.add(new ArrayList<String>(Arrays.asList("Żelazny Człowiek","Iron Man")));
        moviesTitlesWithTranslations.add(new ArrayList<String>(Arrays.asList("Mściciele","Avengers")));
        moviesTitlesWithTranslations.add(new ArrayList<String>(Arrays.asList("Błyskawica","Flash")));

        return moviesTitlesWithTranslations;
    }
}