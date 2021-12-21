package DataStructures.Graph.KruskalAlgo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class KruskalAlgo {
    List<Edge> minSpanTree(List<Edge> edgeList, List<Vertex> vertexList){
        Collections.sort(edgeList);
        DisjointSet disjointSet = new DisjointSet(vertexList);
        List<Edge> mst = new ArrayList<>();

        for(Edge e: edgeList){
            Vertex u = e.getStart();
            Vertex v = e.getTarget();

            if(disjointSet.find(u.getNode()) != disjointSet.find(v.getNode())){
                mst.add(e);
            }
            disjointSet.union(u.getNode(),v.getNode());
        }
        return mst;
    }
}
