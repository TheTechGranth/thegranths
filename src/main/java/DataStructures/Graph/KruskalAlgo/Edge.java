package DataStructures.Graph.KruskalAlgo;

public class Edge implements Comparable<Edge> {
    Vertex start;
    Vertex target;
    double weight;

    public Edge(Vertex start, Vertex target, double weight) {
        this.start = start;
        this.target = target;
        this.weight = weight;
    }

    public Vertex getStart() {
        return start;
    }

    public void setStart(Vertex start) {
        this.start = start;
    }

    public Vertex getTarget() {
        return target;
    }

    public void setTarget(Vertex target) {
        this.target = target;
    }

    public double getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return start.getName() + "-->" + target.getName() + "=" + this.weight;
    }

    @Override
    public int compareTo(Edge edge) {
        return Double.compare(this.weight,edge.getWeight());
    }
}
