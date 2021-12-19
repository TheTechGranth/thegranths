package DataStructures.Graph.MavenMaxBuildTime;

import java.util.List;
import java.util.Stack;

public class TopologicalOrder {
    private Stack<Vertex> stack;

    public TopologicalOrder(List<Vertex> graph) {
        this.stack = new Stack<>();

        for(int i=0;i<graph.size();i++){
            if(!graph.get(i).isVisited()){
                dfs(graph.get(i));
            }
        }
    }

    private void dfs(Vertex vertex){
        vertex.setVisited(true);

        for(Edge e: vertex.getNeighbour()){
            if(!e.getTarget().isVisited()){
                dfs(e.getTarget());
            }
        }
        stack.add(vertex);
    }

    public Stack<Vertex> getStack(){
        return this.stack;
    }
}
