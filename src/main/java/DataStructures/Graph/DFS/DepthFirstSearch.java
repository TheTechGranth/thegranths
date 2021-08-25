package DataStructures.Graph.DFS;

import DataStructures.Graph.Vertex;

public class DepthFirstSearch {

    public void dfs(Vertex rootVertex){
        rootVertex.setVisited(true);
        System.out.println("Vertex is :" + rootVertex);
        for(Vertex adjVer : rootVertex.getAdjacentVertex()){
            if(!adjVer.isVisited()){
                adjVer.setVisited(true);
                dfs(adjVer);
            }
        }
    }

    public static void main(String[] args) {
        DepthFirstSearch depthFirstSearch = new DepthFirstSearch();
        Vertex vA = new Vertex("A");
        Vertex vB = new Vertex("B");
        Vertex vC = new Vertex("C");
        Vertex vD = new Vertex("D");
        Vertex vE = new Vertex("E");

        vA.addAdjacentVertex(vB);
        vA.addAdjacentVertex(vC);

        vB.addAdjacentVertex(vD);

        vC.addAdjacentVertex(vD);

        vD.addAdjacentVertex(vE);

        depthFirstSearch.dfs(vA);
    }
}
