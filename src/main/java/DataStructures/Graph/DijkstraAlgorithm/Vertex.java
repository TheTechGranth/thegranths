package DataStructures.Graph.DijkstraAlgorithm;

import java.util.ArrayList;
import java.util.List;

public class Vertex {
    String name;
    List<Edge> adjVertex;
    Vertex previousVertex;
    boolean visited;
    double minDistance;

    public Vertex(String name) {
        this.name = name;
        this.adjVertex = new ArrayList<>();
        this.minDistance = Integer.MAX_VALUE;
    }

    public String getName() {
        return name;
    }

    public double getMinDistance() {
        return minDistance;
    }

    public void setMinDistance(double minDistance) {
        this.minDistance = minDistance;
    }

    public List<Edge> getAdjVertex() {
        return adjVertex;
    }

    public void addNeighbour(Edge vertex) {
        this.adjVertex.add(vertex);
    }

    public Vertex getPreviousVertex() {
        return previousVertex;
    }

    public void setPreviousVertex(Vertex previousVertex) {
        this.previousVertex = previousVertex;
    }

    public boolean isVisited() {
        return visited;
    }

    public void setVisited(boolean visited) {
        this.visited = visited;
    }

    @Override
    public String toString() {
        return name;
    }
}
