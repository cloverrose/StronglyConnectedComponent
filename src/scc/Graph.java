package scc;
import java.util.*;

public class Graph<T> {
     /**
     * fromVertex -> [toVertex1, ..., toVertexN]
     */
    private Map<T, Collection<T>> edges;

    public Graph(){
        this.edges = new HashMap<T, Collection<T>>();
    }

    public Collection<T> getVertexes(){
        return this.edges.keySet();
    }

    public Collection<T> getAdjacentVertexes(T vertex){
        return this.edges.get(vertex);
    }

    public void addEdge(T src, T dst){
        if(!this.edges.containsKey(src)){
            this.edges.put(src, new ArrayList<T>());
        }
        this.edges.get(src).add(dst);
    }
}
