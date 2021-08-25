package DataStructures.Graph.BFS;

import DataStructures.Graph.Vertex;

import java.util.LinkedList;
import java.util.Queue;

public class BreadthFirstSearch {
    Queue<Vertex> queue;

    public BreadthFirstSearch() {
        this.queue = new LinkedList<>();
    }

    public void bfs(Vertex rootVertex){
        queue.offer(rootVertex);
        rootVertex.setVisited(true);
        while(!queue.isEmpty()){
            Vertex v = queue.poll();
            System.out.println("Vertex is : " + v);
            for( Vertex adjVertex : v.getAdjacentVertex()){
                if (!adjVertex.isVisited()) {
                    adjVertex.setVisited(true);
                    queue.offer(adjVertex);
                }
            }
        }
    }

    public static void main(String[] args) {
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

        BreadthFirstSearch breadthFirstSearch = new BreadthFirstSearch();
        breadthFirstSearch.bfs(vA);
    }
}
