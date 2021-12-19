package DataStructures.Graph.CycleDetection;

import java.util.ArrayList;
import java.util.List;

public class CycleDetection {
    public void checkCycle(List<Vertex> graph){
        boolean cycleExists = false;
        for(Vertex vertex : graph){
            if(!vertex.isVisited()){
                if(!dfs(vertex)) cycleExists = true;
            }
        }
        if(cycleExists) System.out.println(" Cycle present in graph");
        else System.out.println("NO cycle");
    }

    private boolean dfs(Vertex vertex) {
        vertex.setBeingVisited(true);
        for(Vertex v: vertex.getAdjVertex()){
            if(v.isBeingVisited()){
                return false;
            }
            if (!v.isVisited())
                if(!dfs(v)) return false;
        }
        vertex.setBeingVisited(false);
        vertex.setVisited(true);
        return true;
    }

    public static void main(String[] args) {
        CycleDetection cycleDetection = new CycleDetection();
        Vertex vA = new Vertex("A");
        Vertex vB = new Vertex("B");
        Vertex vC = new Vertex("C");
        Vertex vD = new Vertex("D");
        Vertex vE = new Vertex("E");
        Vertex vF = new Vertex("F");

        vA.addNeighbour(vB);
        vA.addNeighbour(vE);
        vB.addNeighbour(vC);
        vB.addNeighbour(vD);
        vF.addNeighbour(vA);
        vE.addNeighbour(vF);

        List<Vertex> graph = new ArrayList<>();
        graph.add(vA);
        graph.add(vB);
        graph.add(vC);
        graph.add(vD);
        graph.add(vE);
        graph.add(vF);

        cycleDetection.checkCycle(graph);
    }
}
