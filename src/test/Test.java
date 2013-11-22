package test;
import java.util.*;
import scc.*;

public class Test {
    private void test(int numOfVertexes, int maxNumOfAdjacentVertexes) {
        Graph<Integer> graph = SampleDatas.makeSample(numOfVertexes, maxNumOfAdjacentVertexes);
        System.out.println("BEFORE:");
        System.out.println(graph.toString());

        Graph<Set<Integer>> simpleGraph = new Simplifier<Integer>().simplify(graph);
        System.out.println("\n\nAFTER:");
        System.out.println(simpleGraph);
    }

    /**
     * time java -Xss10m -classpath .:/usr/local/lib/trove-3.0.3.jar test/Test 100 5
     * @param args
     */
    public static void main(String[] args) {
    	int numOfVertexes = 500;
    	int maxNumOfAdjacentVertexes = 100;
    	if(args.length == 2){
    		numOfVertexes = Integer.parseInt(args[0]);
    		maxNumOfAdjacentVertexes = Integer.parseInt(args[1]);
    	}
    	Test t = new Test();
        t.test(numOfVertexes, maxNumOfAdjacentVertexes);
    }
}
