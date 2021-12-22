package DataStructures.Graph.PrimsAlgo;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        List<Vertex> vertexList = new ArrayList<>();
        Vertex v1 = new Vertex("0");
        Vertex v2 = new Vertex("1");
        Vertex v3 = new Vertex("2");
        Vertex v4 = new Vertex("3");
        Vertex v5 = new Vertex("4");
        vertexList.add(v1);
        vertexList.add(v2);
        vertexList.add(v3);
        vertexList.add(v4);
        vertexList.add(v5);

        Edge e1 = new Edge(v1,v2,2);
        Edge e2 = new Edge(v2,v1,2);

        Edge e3 = new Edge(v1,v4,6);
        Edge e4 = new Edge(v4,v1,6);

        Edge e5 = new Edge(v2,v3,3);
        Edge e6 = new Edge(v3,v2,3);

        Edge e7 = new Edge(v2,v4,8);
        Edge e8 = new Edge(v4,v2,8);

        Edge e9 = new Edge(v2,v5,5);
        Edge e10 = new Edge(v5,v2,5);

        Edge e11 = new Edge(v3,v5,7);
        Edge e12 = new Edge(v5,v3,7);

        Edge e13 = new Edge(v4,v5,9);
        Edge e14 = new Edge(v5,v4,9);

        v1.addNeighbour(e1);
        v2.addNeighbour(e2);
        v1.addNeighbour(e3);
        v4.addNeighbour(e4);
        v2.addNeighbour(e5);
        v3.addNeighbour(e6);
        v2.addNeighbour(e7);
        v4.addNeighbour(e8);
        v2.addNeighbour(e9);
        v5.addNeighbour(e10);
        v3.addNeighbour(e11);
        v5.addNeighbour(e12);
        v4.addNeighbour(e13);
        v5.addNeighbour(e14);

        PrimAlgo primAlgo = new PrimAlgo(vertexList);
        primAlgo.minSpanTree(v1);
        primAlgo.printMst();

    }
}
