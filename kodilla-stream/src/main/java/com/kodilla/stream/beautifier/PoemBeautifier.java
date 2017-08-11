package com.kodilla.stream.beautifier;

/**
 * Created by RJanus on 11.08.2017.
 */
public class PoemBeautifier {
    public void beautify(String poem,PoemDecorator poemToDecorate){
        String result = poemToDecorate.decorate(poem);
        System.out.println("Upiększony poemat: " + result);
    }
}
