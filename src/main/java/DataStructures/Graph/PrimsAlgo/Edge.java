package DataStructures.Graph.PrimsAlgo;

public class Edge {
    private Vertex start;
    private Vertex target;
    private double weight;

    public Edge(Vertex start, Vertex target, double weight) {
        this.start = start;
        this.target = target;
        this.weight = weight;
    }

    public Vertex getStart() {
        return start;
    }

    public Vertex getTarget() {
        return target;
    }

    public double getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return start.getName() + "-->" + target.getName() + "=" + this.weight;
    }
}
