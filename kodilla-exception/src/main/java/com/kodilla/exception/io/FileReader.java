package com.kodilla.exception.io;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class FileReader {
    public void readfile() throws FileReaderException {
        ClassLoader classLoader = getClass().getClassLoader();
        File myFile = new File(classLoader.getResource("file/names.txt").getFile());

        try (Stream<String> linesFromMyFile = Files.lines(Paths.get(myFile.getPath()))){

            linesFromMyFile.forEach(c -> System.out.println(c));
        }
        catch (IOException e) {
           throw new FileReaderException();
        } finally{
            System.out.println("Ten napis pojawi się zawsze");
        }

    }
}
