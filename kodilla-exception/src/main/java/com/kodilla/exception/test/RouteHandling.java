package com.kodilla.exception.test;

/**
 * Created by RJanus on 18.08.2017.
 */
public class RouteHandling {
    public static void  main(String args[]){
        Flight destination = new Flight ("Katowice");
        try{
            //Flight requestedConnection = new Flight("Warszawa");
            if(FlightSearchEngine.findFlight(destination)){
                System.out.println("Połącznie z " + destination.getAirportName() + " jest dostępne");
            }
            else{
                System.out.println("Połącznie z " + destination.getAirportName() + " jest niedostępne");
            }
        }catch(RouteNotFoundException e) {
            System.out.println("Wyjątek! Nie znaleziono poszukiwanej lokalizacji");
        }
    }
}
