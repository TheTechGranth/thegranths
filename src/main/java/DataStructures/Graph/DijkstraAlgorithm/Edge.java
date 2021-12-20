package DataStructures.Graph.DijkstraAlgorithm;

public class Edge {
    double weight;
    Vertex targetVertex;

    public Edge(Vertex targetVertex, double weight) {
        this.weight = weight;
        this.targetVertex = targetVertex;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public Vertex getTargetVertex() {
        return targetVertex;
    }

    public void setTargetVertex(Vertex targetVertex) {
        this.targetVertex = targetVertex;
    }
}
