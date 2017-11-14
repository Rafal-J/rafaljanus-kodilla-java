package com.kodilla.patterns2.adapter.company.oldhrsystem;

public class Workers {
    private String[][] workers = {
            {"12345678901", "Jan", "Kowal"},
            {"09876543210", "Iwona", "Nowak"},
            {"23456789012", "Janina", "Różowa"},
            {"34567890123", "Wacław", "Biały"},
            {"45678901234", "Klara", "Lasocka"}};
    private double[] salaries = {
            4500.00,
            3700.00,
            4350.00,
            9000.00,
            6200.00};

    public String getWorker(int n) {
        if (n > salaries.length) {
            return "";
        }
        return workers[n][0] + ", " + workers[n][1] + ", " + workers[n][2] + ", " + salaries[n];
    }

    public String[][] getWorkers() {
        return workers;
    }

    public double[] getSalaries() {
        return salaries;
    }
}