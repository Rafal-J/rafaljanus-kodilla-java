package com.kodilla.exception.test;

public class FirstChallenge {

    public double divide(int a, int b) throws ArithmeticException {
        try{
            return a / b;
        }catch(ArithmeticException e){
            System.out.println("Dzielenie przez zero!");
            return 0;
        }finally {
            System.out.println("Obliczenia zakończone.");
        }

    }

    /**
     * This main can throw an ArithmeticException!!!
     * @param args
     */
    public static void main(String[] args) {

        FirstChallenge firstChallenge = new FirstChallenge();

        double result = firstChallenge.divide(3, 0);

        System.out.println(result);
    }
}