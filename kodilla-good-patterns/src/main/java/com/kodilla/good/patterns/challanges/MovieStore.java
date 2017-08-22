package com.kodilla.good.patterns.challanges;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MovieStore {

    public ArrayList<List<String>> getMovies() {

        List<String> ironManTranslations = new ArrayList<>();
        ironManTranslations.add("Żelazny Człowiek");
        ironManTranslations.add("Iron Man");

        List<String> avengersTranslations = new ArrayList<>();
        avengersTranslations.add("Mściciele");
        avengersTranslations.add("Avengers");

        List<String> flashTranslations = new ArrayList<>();
        flashTranslations.add("Błyskawica");
        flashTranslations.add("Flash");

        ArrayList<List<String>> moviesTitlesWithTranslations = new ArrayList<>();
        moviesTitlesWithTranslations.add(ironManTranslations);
        moviesTitlesWithTranslations.add(avengersTranslations);
        moviesTitlesWithTranslations.add(flashTranslations);

        return moviesTitlesWithTranslations;
    }
}