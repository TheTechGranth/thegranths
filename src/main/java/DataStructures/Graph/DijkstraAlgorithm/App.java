package DataStructures.Graph.DijkstraAlgorithm;

public class App {
    public static void main(String[] args) {
        Vertex v1 = new Vertex("1");
        Vertex v2 = new Vertex("2");
        Vertex v3 = new Vertex("3");
        Vertex v4 = new Vertex("4");
        Vertex v5 = new Vertex("5");
        Vertex v6 = new Vertex("6");
        Vertex v7 = new Vertex("7");
        Vertex v8 = new Vertex("8");
        Vertex v9 = new Vertex("9");
        Vertex v10 = new Vertex("10");

        v1.addNeighbour(new Edge(v2,1));
        v1.addNeighbour(new Edge(v3,1));
        v1.addNeighbour(new Edge(v4,1));
        v2.addNeighbour(new Edge(v5,12));
        v2.addNeighbour(new Edge(v6,4));
        v3.addNeighbour(new Edge(v8,1));
        v4.addNeighbour(new Edge(v9,1));
        v5.addNeighbour(new Edge(v7,3));
        v6.addNeighbour(new Edge(v7,5));
        v7.addNeighbour(new Edge(v10,1));
        v8.addNeighbour(new Edge(v10,12));
        v9.addNeighbour(new Edge(v10,10));

        DijkstraAlgo algo =new DijkstraAlgo();
        algo.calculateShortPath(v1);
        algo.printShortestPath(v10);
    }
}
