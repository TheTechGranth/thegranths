package DataStructures.Graph.DijkstraAlgorithm;

import java.util.Comparator;
import java.util.PriorityQueue;

public class DijkstraAlgo {
    PriorityQueue<Vertex> pq = new PriorityQueue<>(Comparator.comparingDouble(Vertex::getMinDistance));
     void calculateShortPath(Vertex source){
        source.setMinDistance(0);
        pq.offer(source);

        while(!pq.isEmpty()){
            Vertex u = pq.poll();
            u.setVisited(true);

            for(Edge edge : u.getAdjVertex()){
                Vertex v = edge.getTargetVertex();

                if(u.getMinDistance() + edge.getWeight() < v.getMinDistance()){
                    v.setMinDistance(u.getMinDistance() + edge.getWeight());
                    v.setPreviousVertex(u);
                    pq.offer(v);
                }
            }
        }
    }

     void printShortestPath(Vertex target){
        String path="";
        while(target != null){
            path = target.getName() + "->" + path;
            target = target.getPreviousVertex();
        }
        System.out.println(path);
    }
}
