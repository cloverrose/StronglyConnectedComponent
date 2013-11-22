package test;
import scc.*;
import java.util.*;

public class SampleDatas {
     public static Graph<Integer> makeSample(int numOfVertexes, int maxNumOfAdjacentVertexes) {
        Graph<Integer> graph = new Graph<Integer>(numOfVertexes);
        Random rnd = new Random();
        for(int src=0;src<numOfVertexes;src++){
            for(int j=0;j<rnd.nextInt(maxNumOfAdjacentVertexes + 1);j++){
                graph.addEdge(src, rnd.nextInt(numOfVertexes));
            }
        }
        return graph;
    }
}
