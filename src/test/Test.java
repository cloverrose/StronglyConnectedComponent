package test;
import java.util.*;
import scc.*;

public class Test {
    private void test(int sampleNumber) {
        SampleDatas samples = new SampleDatas();
        Graph<Integer> graph = samples.makeSample(sampleNumber);

        SCC<Integer> m = new SCC<Integer>();
        Set<Set<Integer>> sccs = m.stronglyConnectedComponents(graph);
        System.out.println(sccs);
    }

    private void testNode(int sampleNumber) {
        SampleDatas samples = new SampleDatas();
        Graph<Node> graph = samples.makeNodeSample(sampleNumber);

        SCC<Node> m = new SCC<Node>();
        Set<Set<Node>> sccs = m.stronglyConnectedComponents(graph);
        System.out.println(sccs);
    }

    public static void main(String[] args) {
        Test t = new Test();
        System.out.println("========");
        t.test(1);
        System.out.println("========");
        t.test(2);
        System.out.println("========");
        t.test(3);

        System.out.println("========");
        t.testNode(1);
        System.out.println("========");
        t.testNode(2);
        System.out.println("========");
        t.testNode(3);
    }
}
