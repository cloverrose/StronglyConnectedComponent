package test;
import scc.*;

public class SampleDatas {
    public Graph<Integer> makeSample(int sumpleNumber){
        if(sumpleNumber == 1){
            return this.makeSample1();
        }else if(sumpleNumber == 2){
            return this.makeSample2();
        }else if(sumpleNumber == 3){
            return this.makeSample3();
        }else{
            return null;
        }
    }

    private Graph<Integer> makeSample1() {
        Graph<Integer> graph = new Graph<Integer>();
        graph.addEdge(0, 1);
        graph.addEdge(0, 3);
        graph.addEdge(1, 2);
        graph.addEdge(1, 3);
        graph.addEdge(2, 1);
        graph.addEdge(3, 4);
        graph.addEdge(4, 3);
        return graph;
    }

    private Graph<Integer> makeSample2() {
        Graph<Integer> graph = new Graph<Integer>();
        graph.addEdge(0, 2);
        graph.addEdge(1, 0);
        graph.addEdge(2, 0);
        graph.addEdge(2, 1);
        return graph;
    }

    private Graph<Integer> makeSample3() {
        Graph<Integer> graph = new Graph<Integer>();
        graph.addEdge(0, 1);
        graph.addEdge(1, 2);
        graph.addEdge(2, 0);
        return graph;
    }
}
