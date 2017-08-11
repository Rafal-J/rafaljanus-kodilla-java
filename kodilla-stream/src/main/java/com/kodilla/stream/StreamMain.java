package com.kodilla.stream;

import com.kodilla.stream.beautifier.PoemBeautifier;


public class StreamMain {
    public static void main(String[] args) {

        PoemBeautifier poemToBeutify = new PoemBeautifier();
        String poem1 = "Ala ma kota.";
        poemToBeutify.beautify("Ala ma kota.", (poem2) -> poem2 + "\nWlazł kotek na płotek" );
        poemToBeutify.beautify(poem1, (poem2) -> poem2.toUpperCase());
        poemToBeutify.beautify(poem1, (poem2) -> poem2.replace("Ala","Zosia"));
        poemToBeutify.beautify(poem1, (poem2) -> poem2.substring(0,3));
    }
}