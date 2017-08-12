package com.kodilla.stream.iterate;

import java.util.stream.*;

public final class NumbersGenerator {
    public static void generateEven(int max) {
        Stream.iterate(1, k -> k + 1)
                .limit(max)
                .filter(k -> k % 2 == 0)
                .forEach(System.out::println);
    }
}
