package com.kodilla.stream.array;

import java.util.OptionalDouble;
import java.util.stream.IntStream;

public interface ArrayOperations {
    public static double getAverage(int[] integers) {
        IntStream.range(0,integers.length)
                .map(c -> integers[c])
                .forEach(c ->{int k = 0; k = k + 1; System.out.println(c);});

        OptionalDouble average = IntStream.range(0,integers.length)
                .map(c -> integers[c])
                .average();
        return average.getAsDouble();
    }
}
