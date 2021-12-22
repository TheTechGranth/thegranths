package DataStructures.Graph.PrimsAlgo;

import java.util.ArrayList;
import java.util.List;

public class Vertex {
    private String name;
    private List<Edge> adjList;

    public Vertex(String name) {
        this.name = name;
        this.adjList = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public List<Edge> getAdjList() {
        return adjList;
    }

    public void addNeighbour(Edge edge){
        this.adjList.add(edge);
    }

    @Override
    public String toString() {
        return name;
    }
}
