package com.kodilla.good.patterns.airways;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Application {
    public static void main (String[] args){
        HashSet<Connection> connectionsMap = ConnectionsMapGenerator.generatingConnectionsMap();

        List<Connection> connectionsFrom = ConnectionsFrom.findConnectionsFrom(connectionsMap, "Kraków");
        PrintConnections.printingConnections(connectionsFrom);

        List<Connection> connectionsTo = ConnectionsTo.findConnectionsTo(connectionsMap, "Zabrze");
        PrintConnections.printingConnections(connectionsTo);

        Connection requestedConnection = new Connection("Rzeszów", "Kraków");
        ArrayList<OneHopRoute> connectionsWithOneHop = OneHopConnections.findOneHopConnections(connectionsMap, requestedConnection);
        PrintConnections.printingConnectionsWithOneHop(connectionsWithOneHop);
    }
}
