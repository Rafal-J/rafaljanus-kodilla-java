package com.kodilla.exception.io;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class FileReaderWithoutHandling {
    public void readfile() throws IOException {
        ClassLoader classLoader = getClass().getClassLoader();
        File myFile = new File(classLoader.getResource("file/names.txt").getFile());

        Stream<String> linesFromMyFile = Files.lines(Paths.get(myFile.getPath()));
        linesFromMyFile.forEach(c -> System.out.println(c));
    }
}
