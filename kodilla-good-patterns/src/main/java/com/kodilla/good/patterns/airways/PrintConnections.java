package com.kodilla.good.patterns.airways;

import java.util.ArrayList;
import java.util.List;

public class PrintConnections {
    public static void printingConnections(List<Connection> connections){
        if(connections == null || connections.size()==0) {
            System.out.println("Brak połączeń spełniających kryteria.");
            System.out.println();
            return;
        }
        connections.forEach(c -> System.out.println(c + " jest dostępne."));

        System.out.println();
    }

    public static void printingConnectionsWithOneHop(ArrayList<OneHopRoute> connectionsWihtOneHop){
        if(connectionsWihtOneHop == null || connectionsWihtOneHop.size()==0) {
            System.out.println("Brak połączeń z 1 przesiadką");
            return;
        }

        System.out.println("Z " + connectionsWihtOneHop.get(0).getFirstHop().getSource() + " do " + connectionsWihtOneHop.get(1).getSecondHop().getDestination()
         + " możliwe są następujące połączenia z 1 przesiadką:");


        for(int i = 0; i < connectionsWihtOneHop.size(); i++){
            System.out.println("1. " + connectionsWihtOneHop.get(i).getFirstHop().getSource()+ " -> " + connectionsWihtOneHop.get(i).getFirstHop().getDestination());
            System.out.println("2. " + connectionsWihtOneHop.get(i).getSecondHop().getSource()+ " -> " + connectionsWihtOneHop.get(i).getSecondHop().getDestination());
            System.out.println("-------------------------");
        }
    }
}