package test;
import java.io.*;
import scc.*;

public class Test {
    private void test(int sampleNumber) {
        System.out.println("================================");
        SampleDatas samples = new SampleDatas();
        Graph<Integer> graph = samples.makeSample(sampleNumber);
        graph.show();

        // Set<Collection<Integer>> sccs = new SCC<Integer>().stronglyConnectedComponents(graph);
        // System.out.println(sccs);

        new Simplifier<Integer>().simplify(graph).show();
    }

    private void testNode(int sampleNumber) {
        System.out.println("================================");
        SampleDatas samples = new SampleDatas();
        Graph<Node> graph = samples.makeNodeSample(sampleNumber);
        graph.show();

        // Set<Collection<Node>> sccs = new SCC<Node>().stronglyConnectedComponents(graph);
        // System.out.println(sccs);

        new Simplifier<Node>().simplify(graph).show();
    }

    private void testLarge(int numOfVertexes, int maxNumOfAdjacentVertexes, String fileName) {
        System.out.println("================================");
        SampleDatas samples = new SampleDatas();
        Graph<Integer> graph = samples.makeSampleLarge(numOfVertexes, maxNumOfAdjacentVertexes);
        // graph.show();

        // Set<Collection<Integer>> sccs = new SCC<Integer>().stronglyConnectedComponentsCore(graph);
        // System.out.println(sccs);

        try {
            new Simplifier<Integer>().simplify(graph).show(new PrintStream(fileName));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    /**
     * time java -Xss10m -classpath .:../trove-3.0.3/3.0.3/lib/trove-3.0.3.jar test/Test
     * @param args
     */
    public static void main(String[] args) {
        Test t = new Test();
        t.test(1);
        t.test(2);
        t.test(3);

        t.testNode(1);
        t.testNode(2);
        t.testNode(3);

        t.testLarge(10, 3, "SimpleGraph1.txt");
        t.testLarge(100, 5, "SimpleGraph2.txt");
        t.testLarge(1000, 10, "SimpleGraph3.txt");
    }
}
