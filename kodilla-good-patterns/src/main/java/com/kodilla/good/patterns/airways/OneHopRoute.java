package com.kodilla.good.patterns.airways;

public class OneHopRoute {
    private Connection firstHop;
    private Connection secondHop;

    public OneHopRoute(Connection firstHop, Connection secondHop) {
        this.firstHop = firstHop;
        this.secondHop = secondHop;
    }

    public Connection getFirstHop() {
        return firstHop;
    }

    public Connection getSecondHop() {
        return secondHop;
    }
}
