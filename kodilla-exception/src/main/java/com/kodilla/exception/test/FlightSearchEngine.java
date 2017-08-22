package com.kodilla.exception.test;

import java.util.*;

public class FlightSearchEngine {
    public static boolean findFlight(Flight flight) throws RouteNotFoundException{
        HashMap<String, Boolean> connections = new HashMap<String, Boolean>();
        connections.put("Warszawa",null);
        connections.put("Kraków",true);
        connections.put("Radom",false);
        connections.put("Olsztyn",false);
        connections.put("Gdańsk",true);
        connections.put("Białystok",false);



            Boolean isConnection = connections.get(flight.getAirportName());
            if (isConnection == null) {
                throw new RouteNotFoundException();
            }
            return isConnection;

    }
}
