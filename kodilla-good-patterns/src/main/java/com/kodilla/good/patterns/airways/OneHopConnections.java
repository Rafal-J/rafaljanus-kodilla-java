package com.kodilla.good.patterns.airways;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class OneHopConnections {

    public static ArrayList<ArrayList<Connection>> findOneHopConnections(HashSet<Connection> connectionsMap, Connection connection){
        List<Connection> connectionsFrom = ConnectionsFrom.findConnectionsFrom(connectionsMap, connection.getSource());

        List<Connection> connectionsTo = ConnectionsTo.findConnectionsTo(connectionsMap, connection.getDestination());

        ArrayList<ArrayList<Connection>> connectionsWithOneHop = new ArrayList<ArrayList<Connection>>();
        List<Connection> tempList1 = new ArrayList<>();

        for(Connection c1: connectionsFrom){
            for(Connection c2: connectionsTo){
                if(c1.getDestination().equals(c2.getSource())){
                    tempList1.add(c1);
                    tempList1.add(c2);
                    connectionsWithOneHop.add(new ArrayList<>(tempList1));
                    tempList1.clear();
                }
            }
        }

        return connectionsWithOneHop;

    }
}
