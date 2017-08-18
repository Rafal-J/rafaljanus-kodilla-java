package com.kodilla.exception.test;

public class ExceptionHandling {
    public static void main(String args[]) {
        SecondChallenge secondChallenge = new SecondChallenge();
        String result = "";
        try {
            result = secondChallenge.probablyIWillThrowException(1, 1.5);
            } catch (Exception d) {
            System.out.println("Wystąpił błąd!");
        } finally {
            System.out.println(result);
        }
    }
}
