package com.kodilla.exception.main;

import com.kodilla.exception.io.FileReader;

/**
 * Created by RJanus on 17.08.2017.
 */
public class ExceptionModuleRunner {
    public static void main (String args[]){
        FileReader fileReader = new FileReader();
        fileReader.readfile();
    }
}
