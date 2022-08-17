package DataStructures.Graph.BellmanFord;

import java.util.ArrayList;
import java.util.List;

public class Vertex {
    String name;
    boolean visited;
    List<Edge> adjList;
    Vertex prevVertex;
    int minDistance;

    public Vertex(String name) {
        this.name = name;
        this.adjList = new ArrayList<>();
        this.minDistance = Integer.MAX_VALUE;
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

    public int getMinDistance() {
        return minDistance;
    }

    public void setMinDistance(int minDistance) {
        this.minDistance = minDistance;
    }

    @Override
    public String toString() {
        return name;
    }
}
