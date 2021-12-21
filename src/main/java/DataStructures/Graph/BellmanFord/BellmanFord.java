package DataStructures.Graph.BellmanFord;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BellmanFord {
    List<Vertex> vertexList;
    List<Edge> edgeList;

    public BellmanFord(List<Vertex> vertexList, List<Edge> edgeList) {
        this.vertexList = vertexList;
        this.edgeList = edgeList;
    }

    void calculateMinDistance(Vertex source){
        source.setMinDistance(0);
        for (int i=0;i<vertexList.size()-1;i++){
            for(Edge edge : edgeList ){
                Vertex u = edge.getSource();
                Vertex v = edge.getDestination();
                if(u.getMinDistance() == Double.MAX_VALUE) continue;
                if(u.getMinDistance() + edge.getWeight() < v.getMinDistance()){
                    v.setMinDistance(u.getMinDistance() + edge.getWeight());
                    v.setPrevVertex(u);
                }
            }
        }

        for(Edge e: edgeList){
            if (e.getSource().getMinDistance() != Integer.MAX_VALUE){
                if (hasCycle(e)) System.out.println("has negative cycle in graph");
            }
        }
    }

    private boolean hasCycle(Edge e) {
        return (e.getSource().getMinDistance() + e.getWeight()) < e.getDestination().getMinDistance();
    }

    public List<Vertex> getShortPath(Vertex target){
        List<Vertex> out = new ArrayList<>();
        while(target != null){
            out.add(target);
            target = target.getPrevVertex();
        }
        Collections.reverse(out);
        return out;
    }
}
