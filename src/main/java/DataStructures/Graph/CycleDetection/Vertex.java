package DataStructures.Graph.CycleDetection;

import java.util.ArrayList;
import java.util.List;

public class Vertex {
    String name;
    boolean visited;
    boolean beingVisited;
    List<Vertex> adjVertex;

    public Vertex(String name) {
        this.name = name;
        this.adjVertex = new ArrayList<>();
    }

    public boolean isVisited() {
        return visited;
    }

    public void setVisited(boolean visited) {
        this.visited = visited;
    }

    public boolean isBeingVisited() {
        return beingVisited;
    }

    public void setBeingVisited(boolean beingVisited) {
        this.beingVisited = beingVisited;
    }

    public List<Vertex> getAdjVertex() {
        return adjVertex;
    }

    public void addNeighbour(Vertex vertex) {
        this.adjVertex.add(vertex);
    }
}
