package com.kodilla.exception.test;

import java.util.*;

public class FlightSearchEngine {
    public static boolean findFlight(Flight flight) throws RouteNotFoundException{
        HashMap<String, Boolean> connections = new HashMap<String, Boolean>();
        connections.put("Warszawa",true);
        connections.put("Kraków",true);
        connections.put("Radom",false);
        connections.put("Olsztyn",false);
        connections.put("Gdańsk",true);
        connections.put("Białystok",false);

        try {
            boolean isConnection = connections.get(flight.getAirportName());
            return isConnection;
        }catch(NullPointerException z){
            throw new RouteNotFoundException();
        }


    }
}
