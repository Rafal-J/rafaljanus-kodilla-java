package com.kodilla.good.patterns.airways;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class OneHopConnections {

    public static ArrayList<OneHopRoute> findOneHopConnections(HashSet<Connection> connectionsMap, Connection connection){
        List<Connection> connectionsFrom = ConnectionsFrom.findConnectionsFrom(connectionsMap, connection.getSource());

        List<Connection> connectionsTo = ConnectionsTo.findConnectionsTo(connectionsMap, connection.getDestination());

        ArrayList<OneHopRoute> connectionsWithOneHop = new ArrayList<>();

        for(Connection c1: connectionsFrom){
            for(Connection c2: connectionsTo){
                if(c1.getDestination().equals(c2.getSource())){
                    connectionsWithOneHop.add(new OneHopRoute(c1,c2));
                }
            }
        }

        return connectionsWithOneHop;

    }
}
