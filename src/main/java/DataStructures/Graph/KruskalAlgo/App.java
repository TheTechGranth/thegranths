package DataStructures.Graph.KruskalAlgo;

import java.util.ArrayList;
import java.util.List;

public class App {

    public static void main(String[] args) {
        // add edge 0-1
        List<Vertex> vertexList = new ArrayList<>();
        Vertex v1 = new Vertex("1");
        Vertex v2 = new Vertex("2");
        Vertex v3 = new Vertex("3");
        Vertex v4 = new Vertex("4");
        vertexList.add(v1);
        vertexList.add(v2);
        vertexList.add(v3);
        vertexList.add(v4);

        List<Edge> edgeList = new ArrayList<>();
        Edge e1 = new Edge(v1,v2,10);
        Edge e2 = new Edge(v1,v3,6);
        Edge e3 = new Edge(v1,v4,5);
        Edge e4 = new Edge(v2,v4,15);
        Edge e5 = new Edge(v3,v4,4);
        edgeList.add(e1);
        edgeList.add(e2);
        edgeList.add(e3);
        edgeList.add(e4);
        edgeList.add(e5);

        KruskalAlgo kruskalAlgo = new KruskalAlgo();
        List<Edge> e = kruskalAlgo.minSpanTree(edgeList,vertexList);
        e.forEach(System.out::println);
    }
}
