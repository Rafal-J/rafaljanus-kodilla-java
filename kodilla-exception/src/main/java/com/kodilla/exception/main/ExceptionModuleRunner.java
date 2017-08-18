package com.kodilla.exception.main;

import com.kodilla.exception.io.FileReader;
import com.kodilla.exception.io.FileReaderException;
import com.kodilla.exception.io.FileReaderWithoutHandling;

import java.io.IOException;

public class ExceptionModuleRunner {
    public static void main (String args[]) throws IOException {
        FileReader fileReader = new FileReader();
        try {
            fileReader.readfile();
        }catch (FileReaderException k){
            System.out.println("Problem z odczytaniem pliku");
        }
    }
}
