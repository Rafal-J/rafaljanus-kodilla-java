package com.kodilla.good.patterns.challanges;

import java.util.List;

public class MovieHandling {
    public static void main(String[] args) {

    MovieStore.getMovies().stream()
            .flatMap(c -> c.stream())
            .map(c -> c + "!")
            .forEach(System.out::print);
    }
}