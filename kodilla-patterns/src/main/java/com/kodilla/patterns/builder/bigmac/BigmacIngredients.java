package com.kodilla.patterns.builder.bigmac;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BigmacIngredients {
    public static List<String> ingredients = new ArrayList<>(Arrays.asList("sałata", "cebula", "bekon", "ogórek", "papryczki chilli", "pieczarki", "krewetki", "ser"));
    public static List<String> sauce = new ArrayList<>(Arrays.asList("standard", "1000 wysp", "barbecue"));
    public static List<String> roll = new ArrayList<>(Arrays.asList("z sezamem", "bez sezamu"));

    public static List<String> getIngredients() {
        return ingredients;
    }

    public static List<String> getSauce() {
        return sauce;
    }

    public static List<String> getRoll() {
        return roll;
    }
}
