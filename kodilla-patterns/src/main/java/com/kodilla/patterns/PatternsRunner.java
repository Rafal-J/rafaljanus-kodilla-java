package com.kodilla.patterns;

import com.kodilla.patterns.singleton.SettingsFileEngine;

public class PatternsRunner {
    public static void main(String[] args){
        System.out.println("Welcome to the module 11 - Patterns");

        SettingsFileEngine test = SettingsFileEngine.getInstance();
        SettingsFileEngine test2 = SettingsFileEngine.getInstance();

        System.out.println(test + " " + test2);

        test.open("przepisy.doc");

        System.out.println(test.getFileName());
    }
}