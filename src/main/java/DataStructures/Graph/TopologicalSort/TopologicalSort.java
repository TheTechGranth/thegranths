package DataStructures.Graph.TopologicalSort;

import DataStructures.Graph.Vertex;

import java.util.Stack;

public class TopologicalSort {
    Stack<Vertex> stack = new Stack<>();

    public void dfs (Vertex rootVertex){
        rootVertex.setVisited(true);
        for(Vertex adjV : rootVertex.getAdjacentVertex()){
            if(!adjV.isVisited()){
                dfs(adjV);
            }
        }
        stack.push(rootVertex);
    }

    public static void main(String[] args) {
        Vertex vA = new Vertex("A");
        Vertex vB = new Vertex("B");
        Vertex vC = new Vertex("C");
        Vertex vD = new Vertex("D");
        Vertex vE = new Vertex("E");

        vA.addAdjacentVertex(vB);
        vA.addAdjacentVertex(vC);

        vB.addAdjacentVertex(vE);

        vC.addAdjacentVertex(vD);
        vC.addAdjacentVertex(vB);

        vD.addAdjacentVertex(vB);

        TopologicalSort topologicalSort = new TopologicalSort();
        topologicalSort.dfs(vA);
        topologicalSort.stack.forEach( v -> System.out.println(" Vertex is :" + v ));

    }
}
