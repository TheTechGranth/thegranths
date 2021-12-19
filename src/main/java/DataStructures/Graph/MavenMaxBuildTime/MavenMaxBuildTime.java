package DataStructures.Graph.MavenMaxBuildTime;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class MavenMaxBuildTime {
    public static void main(String[] args) {

        Vertex vA = new Vertex("A");
        Vertex vB = new Vertex("B");
        Vertex vC = new Vertex("C");
        Vertex vD = new Vertex("D");
        Vertex vE = new Vertex("E");
        Vertex vF = new Vertex("F");

        Edge eAE = new Edge(vE,12);
        Edge eAB = new Edge(vB,4);
        Edge eAD = new Edge(vD,6);
        Edge eAC = new Edge(vC,5);
        Edge eCE = new Edge(vE,6);
        Edge eBD = new Edge(vD,3);
        Edge eDE = new Edge(vE,4);
        Edge eDF = new Edge(vF,1);
        Edge eEF = new Edge(vF,5);

        vA.addNeighbour(eAB);
        vA.addNeighbour(eAC);
        vA.addNeighbour(eAD);
        vA.addNeighbour(eAE);

        vB.addNeighbour(eBD);

        vD.addNeighbour(eDE);
        vD.addNeighbour(eDF);

        vC.addNeighbour(eCE);

        vE.addNeighbour(eEF);

        List<Vertex> graph = new ArrayList<>();
        graph.add(vA);
        graph.add(vB);
        graph.add(vC);
        graph.add(vD);
        graph.add(vE);
        graph.add(vF);

        MavenMaxBuildTime mmbt = new MavenMaxBuildTime();
        mmbt.getMaxTime(graph, vB, vF);

    }

    private void getMaxTime(List<Vertex> graph, Vertex sourceVertex, Vertex vF){
        TopologicalOrder topologicalOrder = new TopologicalOrder(graph);
        Stack<Vertex> stk = topologicalOrder.getStack();

        //while(!stk.isEmpty()) System.out.print( stk.pop() + "-->");
       while(stk.peek() != sourceVertex) stk.pop();
        sourceVertex.setMaxDistance(0);
       while(!stk.isEmpty()){
           Vertex u = stk.pop();
           for(Edge e : u.getNeighbour()){
               Vertex v = e.getTarget();
               if(u.getMaxDistance() + e.getWeight() > v.getMaxDistance()){
                   v.setMaxDistance(u.getMaxDistance() + e.getWeight());
               }
           }
       }
        System.out.println(" max build time is " + vF.getMaxDistance());
    }
}
