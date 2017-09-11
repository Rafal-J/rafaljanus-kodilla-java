package com.kodilla.kurs.enm;

public class Application {
    public static void main(String[] args) {
        for(Letter letter: Letter.values()) {
            System.out.println(letter);
        }
    }
}
