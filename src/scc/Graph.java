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
        if(this.edges.containsKey(vertex)){
            return this.edges.get(vertex);
        }else{
            return new ArrayList<T>();
        }
    }

    public void addEdge(T src, T dst){
        if(!this.edges.containsKey(src)){
            this.edges.put(src, new ArrayList<T>());
        }
        this.edges.get(src).add(dst);
    }

    public void show(){
        System.out.println("[");
        for(Map.Entry<T, Collection<T>> entry : this.edges.entrySet()){
            System.out.println("    " + entry.getKey() + " -> " + entry.getValue() + ",");
        }
        System.out.println("]");
    }
}
