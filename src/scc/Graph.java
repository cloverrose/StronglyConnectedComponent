package scc;
import java.util.*;
import java.io.PrintStream;
import gnu.trove.set.hash.THashSet;

public class Graph<T> {
     /**
     * fromVertex -> [toVertex1, ..., toVertexN]
     */
    private ArrayList<Set<Integer>> edges;
    private ArrayList<T> relations;

    public Graph(){
        this.edges = new ArrayList<Set<Integer>>();
        this.relations = new ArrayList<T>();
    }

    public Graph(int size){
        this.edges = new ArrayList<Set<Integer>>(size);
        this.relations = new ArrayList<T>(size);
    }

    public Collection<T> getVertexes(){
        return this.relations;
    }
    
    public int toIndex(T vertex){
        return this.relations.indexOf(vertex);
    }
    
    public T fromIndex(int index){
        return this.relations.get(index);
    }

    public Collection<Integer> getAdjacentVertexIndices(Integer vertex){
        return this.edges.get(vertex);
    }
    
    public Collection<T> getAdjacentVertexes(T vertex){
        Collection<Integer> dstIndices = this.edges.get(this.toIndex(vertex));
        Collection<T> ret = new ArrayList<T>(dstIndices.size());
        for(int dstIndex : dstIndices){
            ret.add(this.fromIndex(dstIndex));
        }
        return ret;
    }

    public void addEdge(T src, T dst){
        if(!this.relations.contains(src)){
            this.relations.add(src);
            this.edges.add(new THashSet<Integer>());
        }
        if(!this.relations.contains(dst)){
            this.relations.add(dst);
            this.edges.add(new THashSet<Integer>());
        }
        this.edges.get(this.relations.indexOf(src)).add(this.relations.indexOf(dst));
    }

    public void show(){
        this.show(System.out);
    }

    public void show(PrintStream out){
        out.println("[");
        for(int srcIndex=0; srcIndex<this.edges.size(); srcIndex++){
            T src = this.relations.get(srcIndex);
            Collection<T> dsts = new ArrayList<T>(this.edges.get(srcIndex).size());
            for(int dstIndex : this.edges.get(srcIndex)){
                T dst = this.relations.get(dstIndex);
                dsts.add(dst);
            }
            out.println("    " + src + " -> " + dsts + ",");
        }
        out.println("]");
    }
}
