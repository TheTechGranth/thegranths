package DataStructures.Graph.MavenMaxBuildTime;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Vertex {
    private String name;
    private boolean visited;
    private int maxDistance;
    private Vertex predecessor;
    private List<Edge> adjacencyList;

    public Vertex(String name) {
        this.name = name;
        this.maxDistance =Integer.MIN_VALUE;
        this.adjacencyList = new ArrayList<>();
    }

    public boolean isVisited() {
        return visited;
    }

    public void setVisited(boolean visited) {
        this.visited = visited;
    }

    public int getMaxDistance() {
        return maxDistance;
    }

    public void setMaxDistance(int maxDistance) {
        this.maxDistance = maxDistance;
    }

    public Vertex getPredecessor() {
        return predecessor;
    }

    public void setPredecessor(Vertex predecessor) {
        this.predecessor = predecessor;
    }

    public List<Edge> getNeighbour() {
        return adjacencyList;
    }

    public void addNeighbour(Edge edge) {
        this.adjacencyList.add(edge);
    }

    @Override
    public String toString() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Vertex vertex = (Vertex) o;
        return name.equals(vertex.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
