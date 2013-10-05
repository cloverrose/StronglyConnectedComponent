package test;
import java.util.*;
import scc.*;

public class Test {
    private void test(int sampleNumber) {
        System.out.println("================================");
        SampleDatas samples = new SampleDatas();
        Graph<Integer> graph = samples.makeSample(sampleNumber);

        SCC<Integer> m = new SCC<Integer>();
        Set<Set<Integer>> sccs = m.stronglyConnectedComponents(graph);
        System.out.println(sccs);
    }

    private void testNode(int sampleNumber) {
        System.out.println("================================");
        SampleDatas samples = new SampleDatas();
        Graph<Node> graph = samples.makeNodeSample(sampleNumber);

        SCC<Node> m = new SCC<Node>();
        Set<Set<Node>> sccs = m.stronglyConnectedComponents(graph);
        System.out.println(sccs);
    }

    private void testNodeLarge(int numOfVertexes, int maxNumOfAdjacentVertexes) {
        System.out.println("================================");
        SampleDatas samples = new SampleDatas();
        Graph<Node> graph = samples.makeNodeSampleLarge(numOfVertexes, maxNumOfAdjacentVertexes);
        graph.show();

        SCC<Node> m = new SCC<Node>();
        Set<Set<Node>> sccs = m.stronglyConnectedComponents(graph);
        System.out.println(sccs);
    }

    public static void main(String[] args) {
        Test t = new Test();
        t.test(1);
        t.test(2);
        t.test(3);

        t.testNode(1);
        t.testNode(2);
        t.testNode(3);

        t.testNodeLarge(10, 3);
        t.testNodeLarge(100, 5);
        t.testNodeLarge(1000, 10);
    }
}
