package com.kodilla.patterns2.adapter.bookclassifier;

import com.kodilla.patterns2.adapter.bookclassifier.librarya.Book;
import org.junit.Assert;
import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.*;

public class MedianAdapterTest {
    @Test
    public void publicationYearMedianTest() {
        //when
        Set<Book> books = new HashSet<Book>() {
        };
        books.add(new Book("Adam Mickiewicz", "Pan Taduesz", 1800, "AMPT"));
        books.add(new Book("Adam Mickiewicz", "Pan Taduesz", 1810, "AMPT"));
        books.add(new Book("Adam Mickiewicz", "Pan Taduesz", 1820, "AMPT"));
        books.add(new Book("Adam Mickiewicz", "Pan Taduesz", 1830, "AMPT"));
        books.add(new Book("Adam Mickiewicz", "Pan Taduesz", 1840, "AMPT"));
        books.add(new Book("Adam Mickiewicz", "Pan Taduesz", 1850, "AMPT"));
        books.add(new Book("Adam Mickiewicz", "Pan Taduesz", 1860, "AMPT"));
        books.add(new Book("Adam Mickiewicz", "Pan Taduesz", 1870, "AMPT"));
        books.add(new Book("Adam Mickiewicz", "Pan Taduesz", 1880, "AMPT"));
        books.add(new Book("Adam Mickiewicz", "Pan Taduesz", 1890, "AMPT"));
        books.add(new Book("Adam Mickiewicz", "Pan Taduesz", 2000, "AMPT"));

        MedianAdapter adapter = new MedianAdapter();

        //when
        int median = adapter.publicationYearMedian(books);
        int avg = adapter.publicationYearAverage(books);

        //then
        Assert.assertEquals(1850, median);
        Assert.assertEquals(1859, avg);
    }
}