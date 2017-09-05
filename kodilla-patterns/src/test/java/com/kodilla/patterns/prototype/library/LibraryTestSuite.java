package com.kodilla.patterns.prototype.library;

import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

public class LibraryTestSuite {

    @Test
    public void libraryTest() {
        Book book1 = new Book("Perfekcyjny organizer", "Małgorzata Rozenek", LocalDate.of(2011, 1, 5));
        Book book2 = new Book("Perfekcyjny ogród. Poradnik", "Małgorzata Rozenek", LocalDate.of(2012, 2, 5));
        Book book3 = new Book("Perfekcyjne maniery", "Małgorzata Rozenek", LocalDate.of(2013, 3, 5));
        Book book4 = new Book("Jak dbać o siebie perfekcyjnie", "Małgorzata Rozenek", LocalDate.of(2014, 4, 5));

        Library library1 = new Library("Moja perfekcyjna biblioteczka 1");
        library1.getBooks().add(book1);
        library1.getBooks().add(book2);
        library1.getBooks().add(book3);
        library1.getBooks().add(book4);

        Library library2 = null;
        Library library3 = null;

        try {
            library2 = library1.shallowCopy();
            library2.name = "Moja perfekcyjna bibloteczka 2";
        }
        catch(CloneNotSupportedException o){
            o.printStackTrace();
        }

        try {
            library3 = library1.deepCopy();
            library3.name = "Moja perfekcyjna bibloteczka 3";
        }
        catch(CloneNotSupportedException o){
            o.printStackTrace();
        }

        library2.getBooks().remove(book2);

        Assert.assertTrue(library1.getBooks().size() == 3);
        Assert.assertTrue(library2.getBooks().size() == 3);
        Assert.assertTrue(library3.getBooks().size() == 4);

        Assert.assertTrue(library1.getBooks().contains(book3));
        Assert.assertTrue(library2.getBooks().contains(book3));
        Assert.assertTrue(library3.getBooks().contains(book3));

        List<String> listOfBooks = library1.getBooks().stream()
                .map(c -> c.getTitle())
                .collect(Collectors.toList());

        Assert.assertFalse(listOfBooks.contains("Perfekcyjny ogród. Poradnik"));

        listOfBooks.clear();

        listOfBooks = library2.getBooks().stream()
                .map(c -> c.getTitle())
                .collect(Collectors.toList());

        Assert.assertFalse(listOfBooks.contains("Perfekcyjny ogród. Poradnik"));

        listOfBooks.clear();

        listOfBooks = library3.getBooks().stream()
                .map(c -> c.getTitle())
                .collect(Collectors.toList());

        Assert.assertTrue(listOfBooks.contains("Perfekcyjny ogród. Poradnik"));

    }
}