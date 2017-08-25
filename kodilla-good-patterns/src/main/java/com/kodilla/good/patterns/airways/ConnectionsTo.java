package com.kodilla.good.patterns.airways;

import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;

public class ConnectionsTo {
    public static List<Connection> findConnectionsTo(HashSet<Connection> connectionsMap, String destination){
        List<Connection> connectionsFrom = connectionsMap.stream()
                .filter(c -> c.getDestination().equals(destination))
                .collect(Collectors.toList());
        return connectionsFrom;
    }
}
