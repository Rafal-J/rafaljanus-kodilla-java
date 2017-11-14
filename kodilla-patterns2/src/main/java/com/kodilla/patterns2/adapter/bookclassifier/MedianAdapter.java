package com.kodilla.patterns2.adapter.bookclassifier;

import com.kodilla.patterns2.adapter.bookclassifier.librarya.Book;
import com.kodilla.patterns2.adapter.bookclassifier.librarya.Classifier;
import com.kodilla.patterns2.adapter.bookclassifier.libraryb.BookSignature;
import com.kodilla.patterns2.adapter.bookclassifier.librarya.Book;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MedianAdapter extends MedianAdaptee implements Classifier  {

    public int publicationYearMedian(Set<Book> bookSet) {
        Map<BookSignature, com.kodilla.patterns2.adapter.bookclassifier.libraryb.Book> books = reformatting(bookSet);
        return medianPublicationYear(books);
    }

    public int publicationYearAverage(Set<Book> bookSet) {
        Map<BookSignature, com.kodilla.patterns2.adapter.bookclassifier.libraryb.Book> books = reformatting(bookSet);
        return averagePublicationYear(books);
    }

    public Map<BookSignature, com.kodilla.patterns2.adapter.bookclassifier.libraryb.Book> reformatting(Set<Book> bookSet) {
        Map<BookSignature, com.kodilla.patterns2.adapter.bookclassifier.libraryb.Book> bBooks = new HashMap<>();
        com.kodilla.patterns2.adapter.bookclassifier.libraryb.Book bBook;
        BookSignature signature = null;
        for(Book aBook : bookSet) {
            bBook = new com.kodilla.patterns2.adapter.bookclassifier.libraryb.Book(aBook.getAuthor(), aBook.getTitle(), aBook.getPublicationYear());
            signature = new BookSignature(aBook.getSignature());
            bBooks.put(signature, bBook);
        }
        return  bBooks;
    }
}
