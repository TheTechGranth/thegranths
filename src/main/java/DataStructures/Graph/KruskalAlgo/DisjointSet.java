package DataStructures.Graph.KruskalAlgo;

import java.util.List;

public class DisjointSet {
    List<Vertex> vertexList;

    public DisjointSet(List<Vertex> vertexList) {
        this.vertexList = vertexList;
        makeSets(vertexList);
    }

    void makeSets(List<Vertex> vertexList) {
        for(Vertex vertex: vertexList) {
            Node node = new Node(0,null);
            vertex.setNode(node);
        }
    }

    Node find (Node node){
        Node actual = node;

        while(actual.getParent() != null){
            actual = actual.getParent();
        }

        Node root = actual;
        actual = node;

        while(actual != root){
            Node temp = actual.getParent();
            actual.setParent(root);
            actual=temp;
        }

        return actual;
    }

    void union (Node node1, Node node2){

        Node root1 = find(node1);
        Node root2 = find(node2);

        if (root1 == root2) return;
        if (root1.getHeight() < root2.getHeight()){
            root1.setParent(root2);
        }else if(root1.getHeight() > root2.getHeight())
            root2.setParent(root1);
        else{
            root2.setParent(root1);
            root1.setHeight(root1.getHeight() + 1);
        }
    }

}
