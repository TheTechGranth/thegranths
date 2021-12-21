package DataStructures.Graph.BellmanFord;

import java.util.ArrayList;
import java.util.List;

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
        List<Vertex> vertexList = new ArrayList<>();
        vertexList.add(v1);
        vertexList.add(v2);
        vertexList.add(v3);
        vertexList.add(v4);vertexList.add(v5);
        vertexList.add(v6);
        vertexList.add(v7);
        vertexList.add(v8);
        vertexList.add(v9);vertexList.add(v10);
        Edge e1 = new Edge(v1,v2,1);
        Edge e2 = new Edge(v1,v3,1);
        Edge e3 = new Edge(v1,v4,1);
        Edge e4 = new Edge(v2,v5,-12);
        Edge e5 = new Edge(v2,v6,4);
        Edge e6 = new Edge(v3,v8,1);
        Edge e7 = new Edge(v4,v9,1);
        Edge e8 = new Edge(v5,v7,3);
        Edge e9 = new Edge(v6,v7,5);
        Edge e10 = new Edge(v7,v10,1);
        Edge e11 = new Edge(v8,v10,-12);
        Edge e12 = new Edge(v9,v10,10);
        v1.addNeighbour(e1);
        v1.addNeighbour(e2);
        v1.addNeighbour(e3);
        v2.addNeighbour(e4);
        v2.addNeighbour(e5);
        v3.addNeighbour(e6);
        v4.addNeighbour(e7);
        v5.addNeighbour(e8);
        v6.addNeighbour(e9);
        v7.addNeighbour(e10);
        v8.addNeighbour(e11);
        v9.addNeighbour(e12);

        List<Edge> edgeList = new ArrayList<>();
        edgeList.add(e1);edgeList.add(e2);edgeList.add(e3);edgeList.add(e4);edgeList.add(e5);
        edgeList.add(e6);edgeList.add(e7);edgeList.add(e8);edgeList.add(e9);edgeList.add(e10);
        edgeList.add(e11);edgeList.add(e12);
        BellmanFord algo =new BellmanFord(vertexList,edgeList);
        algo.calculateMinDistance(v1);
        System.out.println(algo.getShortPath(v10) + " with weight " + v10.getMinDistance());
    }
}