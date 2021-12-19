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
        Vertex v1 = new Vertex("1");
        Vertex v2 = new Vertex("2");
        Vertex v3 = new Vertex("3");
        Vertex v4 = new Vertex("4");
        Vertex v5 = new Vertex("5");
        Vertex v6 = new Vertex("6");
        Vertex v7 = new Vertex("7");
        Vertex v8 = new Vertex("8");
        Vertex v9 = new Vertex("9");
        Vertex v10 = new Vertex("10");

        v1.addAdjacentVertex(v2);
        v1.addAdjacentVertex(v3);
        v1.addAdjacentVertex(v4);
        v2.addAdjacentVertex(v5);
        v2.addAdjacentVertex(v6);
        v3.addAdjacentVertex(v8);
        v4.addAdjacentVertex(v9);
        v5.addAdjacentVertex(v7);
        v6.addAdjacentVertex(v7);
        v7.addAdjacentVertex(v10);
        v8.addAdjacentVertex(v10);
        v9.addAdjacentVertex(v10);

        TopologicalSort topologicalSort = new TopologicalSort();
        topologicalSort.dfs(v1);
        while(!topologicalSort.stack.isEmpty()){
            System.out.println("vertex is : " + topologicalSort.stack.pop());
        }

    }
}
