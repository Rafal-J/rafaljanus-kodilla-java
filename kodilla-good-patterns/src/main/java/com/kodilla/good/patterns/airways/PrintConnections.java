package com.kodilla.good.patterns.airways;

import java.util.ArrayList;
import java.util.List;

public class PrintConnections {
    public static void printingConnections(List<Connection> connections){
        if(connections.size()==0 || connections == null) {
            System.out.println("Brak połączeń spełniających kryteria.");
            System.out.println();
            return;
        }
        connections.stream()
                .forEach(c -> System.out.println(c + " jest dostępne."));

        System.out.println();
    }

    public static void printingConnectionsWithOneHop(ArrayList<ArrayList<Connection>> connectionsWihtOneHop){
        if(connectionsWihtOneHop.size()==0 || connectionsWihtOneHop == null) {
            System.out.println("Brak połączeń z 1 przesiadką");
            return;
        }

        System.out.println("Z " + connectionsWihtOneHop.get(0).get(0).getSource() + " do " + connectionsWihtOneHop.get(0).get(1).getDestination()
         + " możliwe są następujące połączenia z 1 przesiadką:");


        for(int i = 0; i < connectionsWihtOneHop.size(); i++){
            System.out.println("1. " + connectionsWihtOneHop.get(i).get(0).getSource()+ " -> " + connectionsWihtOneHop.get(i).get(0).getDestination());
            System.out.println("2. " + connectionsWihtOneHop.get(i).get(1).getSource()+ " -> " + connectionsWihtOneHop.get(i).get(1).getDestination());
            System.out.println("-------------------------");
        }

    }
}
