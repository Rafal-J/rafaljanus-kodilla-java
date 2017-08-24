package com.kodilla.good.patterns.airways;

import java.util.List;
import java.util.stream.Collectors;

public class ConnectionsFrom {
    public static List<Connection> findConnectionsFrom(ConnectionsMapGenerator connectionsMap, String source){
        List<Connection> connectionsFrom = connectionsMap.getConnectionsMap().stream()
                .filter(c -> c.getSource().equals(source))
                .collect(Collectors.toList());
        return connectionsFrom;
    }
}
