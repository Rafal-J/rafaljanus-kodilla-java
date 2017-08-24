package com.kodilla.good.patterns.airways;

import java.util.List;
import java.util.stream.Collectors;

public class ConnectionsTo {
    public static List<Connection> findConnectionsTo(ConnectionsMapGenerator connectionsMap, String destination){
        List<Connection> connectionsFrom = connectionsMap.getConnectionsMap().stream()
                .filter(c -> c.getDestination().equals(destination))
                .collect(Collectors.toList());
        return connectionsFrom;
    }
}
