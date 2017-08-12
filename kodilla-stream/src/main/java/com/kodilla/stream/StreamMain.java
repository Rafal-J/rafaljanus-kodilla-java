package com.kodilla.stream;

import com.kodilla.stream.beautifier.PoemBeautifier;
import com.kodilla.stream.iterate.NumbersGenerator;

import java.util.ArrayList;


public class StreamMain {
    public static void main(String[] args) {

        String tekst = "8 3 -5 42 -1 0 0 -9 4 7 4 -4";
        String number = "";
        ArrayList<Integer> numbers = new ArrayList<Integer>();

        for(int i = 0; i < tekst.length(); i++) {
            if(tekst.substring(i,i+1).equals(" ")){
                numbers.add(Integer.parseInt(number));
                number = "";
                continue;
            }

            number = number + tekst.charAt(i);
        }

        int max = numbers.get(0);
        int min = max;

        for(int i = 0; i < numbers.size(); i++){
            max = (numbers.get(i) > max) ? numbers.get(i) : max;
            min = (numbers.get(i) < min) ? numbers.get(i) : min;
        }

        System.out.println(max + " " + min);

        String result = max + " " + min;

        PoemBeautifier poemToBeutify = new PoemBeautifier();
        String poem1 = "Ala ma kota.";
        poemToBeutify.beautify("Ala ma kota.", (poem2) -> poem2 + "\nWlazł kotek na płotek" );
        poemToBeutify.beautify(poem1, (poem2) -> poem2.toUpperCase());
        poemToBeutify.beautify(poem1, (poem2) -> poem2.replace("Ala","Zosia"));
        poemToBeutify.beautify(poem1, (poem2) -> poem2.substring(0,3));

        System.out.println("Using Stream to generate even numbers from 1 to 20");
        NumbersGenerator.generateEven(25);

    }
}