package com.kodilla.good.patterns.airways;

import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;

public class ConnectionsFrom {
    public static List<Connection> findConnectionsFrom(HashSet<Connection> connectionsMap, String source){
        List<Connection> connectionsFrom = connectionsMap.stream()
                .filter(c -> c.getSource().equals(source))
                .collect(Collectors.toList());
        return connectionsFrom;
    }
}
