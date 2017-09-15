package com.kodilla.codewars.stringToNumber;

public class StringToNumber {
    public static int stringToNumber(String str) {
        int plusMinus = 1;
        int finalNumber = 0;

        for(int x = 0; x < str.length(); x++) {
            if(str.substring(x, x+1).equals("-")) {
                plusMinus = -1;
            }
            else {
                finalNumber = finalNumber * 10 + str.charAt(x) - 48;
            }
        }

        return finalNumber * plusMinus;

    }
}
