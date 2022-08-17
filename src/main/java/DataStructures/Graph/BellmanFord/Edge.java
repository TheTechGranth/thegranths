package DataStructures.Graph.BellmanFord;

public class Edge {
    int weight;
    Vertex source;
    Vertex destination;

    public Edge(Vertex source, Vertex destination,int weight) {
        this.weight = weight;
        this.source = source;
        this.destination = destination;
    }

    public int getWeight() {
        return weight;
    }

    public Vertex getSource() {
        return source;
    }

    public Vertex getDestination() {
        return destination;
    }
}
