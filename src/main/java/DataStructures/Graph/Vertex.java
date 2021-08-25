package DataStructures.Graph;

import java.util.ArrayList;
import java.util.List;

public class Vertex {
    @Override
    public String toString() {
        return name;
    }

    private String name;
    private boolean visited;
    private List<Vertex> adjacentVertex;

    public Vertex(String name) {
        this.name = name;
        this.adjacentVertex = new ArrayList<>();
    }

    public boolean isVisited() {
        return visited;
    }

    public void setVisited(boolean visited) {
        this.visited = visited;
    }

    public List<Vertex> getAdjacentVertex() {
        return adjacentVertex;
    }

    public void addAdjacentVertex(Vertex vertex) {
        this.adjacentVertex.add(vertex);
    }
}
