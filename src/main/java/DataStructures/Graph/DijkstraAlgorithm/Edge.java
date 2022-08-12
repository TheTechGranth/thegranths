package DataStructures.Graph.DijkstraAlgorithm;

public class Edge {
    int weight;
    Vertex targetVertex;

    public Edge(Vertex targetVertex, int weight) {
        this.weight = weight;
        this.targetVertex = targetVertex;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public Vertex getTargetVertex() {
        return targetVertex;
    }

    public void setTargetVertex(Vertex targetVertex) {
        this.targetVertex = targetVertex;
    }
}
