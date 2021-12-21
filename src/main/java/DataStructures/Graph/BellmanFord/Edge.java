package DataStructures.Graph.BellmanFord;

public class Edge {
    double weight;
    Vertex source;
    Vertex destination;

    public Edge(Vertex source, Vertex destination,double weight) {
        this.weight = weight;
        this.source = source;
        this.destination = destination;
    }

    public double getWeight() {
        return weight;
    }

    public Vertex getSource() {
        return source;
    }

    public Vertex getDestination() {
        return destination;
    }
}
