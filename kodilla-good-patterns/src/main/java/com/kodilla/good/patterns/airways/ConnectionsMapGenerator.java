package com.kodilla.good.patterns.airways;

import java.util.HashSet;

public class ConnectionsMapGenerator {

    public static HashSet<Connection> generatingConnectionsMap (){
        HashSet<Connection> connectionsMap = new HashSet<Connection>();

        connectionsMap.add(new Connection("Warszawa", "Kraków"));
        connectionsMap.add(new Connection("Warszawa", "Gdańsk"));
        connectionsMap.add(new Connection("Warszawa", "Rzeszów"));
        connectionsMap.add(new Connection("Warszawa", "Szczecin"));

        connectionsMap.add(new Connection("Kraków", "Warszawa"));
        connectionsMap.add(new Connection("Kraków", "Gdańsk"));
        connectionsMap.add(new Connection("Kraków", "Szczecin"));

        connectionsMap.add(new Connection("Gdańsk", "Warszawa"));
        connectionsMap.add(new Connection("Gdańsk", "Kraków"));

        connectionsMap.add(new Connection("Szczecin", "Warszawa"));
        connectionsMap.add(new Connection("Szczecin", "Kraków"));

        connectionsMap.add(new Connection("Rzeszów", "Warszawa"));
        connectionsMap.add(new Connection("Rzeszów", "Gdańsk"));

        return connectionsMap;
    }
}