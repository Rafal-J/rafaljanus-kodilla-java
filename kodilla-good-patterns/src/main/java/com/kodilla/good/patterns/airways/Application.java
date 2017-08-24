package com.kodilla.good.patterns.airways;

import java.util.ArrayList;
import java.util.List;

public class Application {
    public static void main (String[] args){
        ConnectionsMapGenerator connectionsMap = new ConnectionsMapGenerator();

        List<Connection> connectionsFrom = ConnectionsFrom.findConnectionsFrom(connectionsMap, "Kraków");
        PrintConnections.printingConnections(connectionsFrom);

        List<Connection> connectionsTo = ConnectionsTo.findConnectionsTo(connectionsMap, "Zabrze");
        PrintConnections.printingConnections(connectionsTo);

        Connection requestedConnection = new Connection("Rzeszów", "Kraków");
        ArrayList<ArrayList<Connection>> connectionsWithOneHop = OneHopConnections.findOneHopConnections(connectionsMap, requestedConnection);
        PrintConnections.printingConnectionsWithOneHop(connectionsWithOneHop);
    }
}
