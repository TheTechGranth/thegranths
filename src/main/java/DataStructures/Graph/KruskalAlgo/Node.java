package DataStructures.Graph.KruskalAlgo;

public class Node {
    int height;
    Node parent;

    public Node(int height, Node parent) {
        this.height = height;
        this.parent = parent;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public Node getParent() {
        return parent;
    }

    public void setParent(Node parent) {
        this.parent = parent;
    }
}
