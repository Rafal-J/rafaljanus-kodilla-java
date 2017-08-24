package com.kodilla.good.patterns.airways;

import java.util.HashSet;

public class ConnectionsMapGenerator {

    HashSet<Connection> connectionsMap = new HashSet<Connection>();

    public ConnectionsMapGenerator (){
        this.connectionsMap.add(new Connection("Warszawa", "Kraków"));
        this.connectionsMap.add(new Connection("Warszawa", "Gdańsk"));
        this.connectionsMap.add(new Connection("Warszawa", "Rzeszów"));
        this.connectionsMap.add(new Connection("Warszawa", "Szczecin"));

        this.connectionsMap.add(new Connection("Kraków", "Warszawa"));
        this.connectionsMap.add(new Connection("Kraków", "Gdańsk"));
        this.connectionsMap.add(new Connection("Kraków", "Szczecin"));

        this.connectionsMap.add(new Connection("Gdańsk", "Warszawa"));
        this.connectionsMap.add(new Connection("Gdańsk", "Kraków"));

        this.connectionsMap.add(new Connection("Szczecin", "Warszawa"));
        this.connectionsMap.add(new Connection("Szczecin", "Kraków"));

        this.connectionsMap.add(new Connection("Rzeszów", "Warszawa"));
        this.connectionsMap.add(new Connection("Rzeszów", "Gdańsk"));
    }

    public HashSet<Connection> getConnectionsMap() {
        return connectionsMap;
    }
}