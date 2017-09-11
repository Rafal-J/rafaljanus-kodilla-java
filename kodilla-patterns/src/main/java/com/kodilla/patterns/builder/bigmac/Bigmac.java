package com.kodilla.patterns.builder.bigmac;

import java.util.ArrayList;
import java.util.List;

public class Bigmac {
    private BigmacRoll roll;
    private final int burgers;
    private BigmacSauces sauce;
    private List<BigmacIngredients> ingredients;

    public static class BigmacBuilder {
        private BigmacRoll roll;
        private int burgers;
        private BigmacSauces sauce;
        private List<BigmacIngredients> ingredients = new ArrayList<>();

        public BigmacBuilder roll(BigmacRoll roll) {
            this.roll = roll;
            return this;
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

        public BigmacBuilder sauce(BigmacSauces sauce) {
            this.sauce = sauce;
            return this;
        }

        public BigmacBuilder ingredient(BigmacIngredients ingredient) {
            this.ingredients.add(ingredient);
            return this;
        }

        public Bigmac build() {
            return new Bigmac(roll, burgers, sauce, ingredients);
        }
    }

    private Bigmac(BigmacRoll roll, int burgers, BigmacSauces sauce, List<BigmacIngredients> ingredients) {
        this.roll = roll;
        this.burgers = burgers;
        this.sauce = sauce;
        this.ingredients = ingredients;
    }

    public BigmacRoll getRoll() {
        return roll;
    }

    public int getBurgers() {
        return burgers;
    }

    public BigmacSauces getSauce() {
        return sauce;
    }

    public List<BigmacIngredients> getIngredients() {
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