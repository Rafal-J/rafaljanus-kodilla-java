package com.kodilla.patterns2.adapter.bookclassifier.libraryb;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Statistics implements  BookStatistics {
    @Override
    public int averagePublicationYear(Map<BookSignature, Book> books) {
        if (books.size() == 0) return 0;

        List<Integer> yearsOfPublication = books.entrySet().stream()
                .map(c -> c.getValue().getYearOfPublication())
                .collect(Collectors.toList());

        return IntStream.range(0,yearsOfPublication.size())
                .map(c -> yearsOfPublication.get(c))
                .sum() / yearsOfPublication.size();
    }

    @Override
    public int medianPublicationYear(Map<BookSignature, Book> books) {
        if(books.size() == 0) return 0;
        int[] years = new int[books.size()];
        int n = 0;
        for(Map.Entry<BookSignature, Book> entry: books.entrySet()) {
            years[n] = entry.getValue().getYearOfPublication();
            n++;
        }
        Arrays.sort(years);
        if(years.length % 2 == 0) {
            return years[(int)(years.length / 2 + 0.5)];
        } else {
            return years[years.length / 2];
        }
    }
}