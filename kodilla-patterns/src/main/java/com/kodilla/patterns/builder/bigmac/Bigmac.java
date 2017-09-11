package com.kodilla.patterns.builder.bigmac;

import java.util.ArrayList;
import java.util.List;

public class Bigmac {
    private final String roll;
    private final int burgers;
    private final String sauce;
    private final List<String> ingredients;

    public static class BigmacBuilder {
        private String roll;
        private int burgers;
        private String sauce;
        private List<String> ingredients = new ArrayList<String>();

        public BigmacBuilder roll(String roll) {
            for(BigmacRoll testRoll: BigmacRoll.values()) {
                if(testRoll.toString().equals(roll)) {
                    this.roll = roll;
                    return this;
                }
            }
            throw new IllegalStateException("Ten rodzaj bułki jest niedostępny");
        }

        public BigmacBuilder burgers(int burgers) {
            if(burgers > 0 && burgers%1 == 0) {
                this.burgers = burgers;
                return this;
            }
            else {
                throw new IllegalStateException("Liczba zamówionych kotletów musi być liczbą naturalnę większą od zera");
            }
        }

        public BigmacBuilder sauce(String sauce) {
            for(BigmacSauces testSauce: BigmacSauces.values()) {
                if(testSauce.toString().equals(sauce)) {
                    this.sauce = sauce;
                    return this;
                }
            }
            throw new IllegalStateException("Ten sos jest niedostępny");
        }

        public BigmacBuilder ingredient(String ingredient) {
            for(BigmacIngredients testIngredient: BigmacIngredients.values()) {
                if(testIngredient.toString().equals(ingredient)) {
                    this.ingredients.add(ingredient);
                    return this;
                }
            }
            throw new IllegalStateException("Ten składnik jest niedostępny");
        }

        public Bigmac build() {
            return new Bigmac(roll, burgers, sauce, ingredients);
        }
    }

    private Bigmac(String roll, int burgers, String sauce, List<String> ingredients) {
        this.roll = roll;
        this.burgers = burgers;
        this.sauce = sauce;
        this.ingredients = ingredients;
    }

    public String getRoll() {
        return roll;
    }

    public int getBurgers() {
        return burgers;
    }

    public String getSauce() {
        return sauce;
    }

    public List<String> getIngredients() {
        return ingredients;
    }

    @Override
    public String toString() {
        return "Bigmac{" +
                "roll='" + roll + '\'' +
                ", burgers=" + burgers +
                ", sauce='" + sauce + '\'' +
                ", ingredients=" + ingredients +
                '}';
    }
}