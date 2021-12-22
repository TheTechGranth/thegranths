package DataStructures.Graph.PrimsAlgo;

import java.util.*;

public class PrimAlgo {
    Set<Vertex> unvisited;
    List<Edge> mst = new ArrayList<>();
    PriorityQueue<Edge> pq = new PriorityQueue<>(Comparator.comparingDouble(Edge::getWeight));
    public PrimAlgo(List<Vertex> vertexList) {
        this.unvisited = new HashSet<>(vertexList);
    }

    public void minSpanTree(Vertex start){
        unvisited.remove(start);

        while(!unvisited.isEmpty()){
            for(Edge e : start.getAdjList()){
                if (unvisited.contains(e.getTarget())){
                    pq.add(e);
                }
            }

            Edge minEdge = pq.remove();
            if(!unvisited.contains(minEdge.getTarget())) continue;
            mst.add(minEdge);
            unvisited.remove(minEdge.getTarget());

            start = minEdge.getTarget();
        }
    }

    public void printMst(){
        mst.forEach(System.out::println);
    }
}
