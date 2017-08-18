package com.kodilla.exception.test;

public class ExceptionHandling {
    public static void main(String args[]) {
        SecondChallenge secondChallenge = new SecondChallenge();
        try {
            String result = secondChallenge.probablyIWillThrowException(1, 2);
            System.out.println(result);
        } catch (Exception d) {
            System.out.println("Wystąpił błąd!");
        } finally {
            System.out.println("Koniec programu!");
            //System.out.println(result);
        }
    }
}
