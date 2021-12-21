package DataStructures.Graph.BellmanFord;

import java.util.ArrayList;
import java.util.List;

public class Vertex {
    String name;
    boolean visited;
    List<Edge> adjList;
    Vertex prevVertex;
    double minDistance;

    public Vertex(String name) {
        this.name = name;
        this.adjList = new ArrayList<>();
        this.minDistance = Double.MAX_VALUE;
    }

    public boolean isVisited() {
        return visited;
    }

    public void setVisited(boolean visited) {
        this.visited = visited;
    }

    public List<Edge> getAdjList() {
        return adjList;
    }

    public void addNeighbour(Edge edge) {
        this.adjList.add(edge);
    }

    public Vertex getPrevVertex() {
        return prevVertex;
    }

    public void setPrevVertex(Vertex prevVertex) {
        this.prevVertex = prevVertex;
    }

    public double getMinDistance() {
        return minDistance;
    }

    public void setMinDistance(double minDistance) {
        this.minDistance = minDistance;
    }

    @Override
    public String toString() {
        return name;
    }
}
