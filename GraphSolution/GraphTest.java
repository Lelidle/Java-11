package GraphSolution;

import org.junit.jupiter.api.Test;

public class GraphTest {

    Graph g;

    public GraphTest() {
        g = new Graph(8);
    }
    @Test
    void testAddEdge() {
        g.addEdge(1, 2);
        g.addEdge(2,3);
        g.addEdge(3,4);
        g.addEdge(4,3);
        g.addEdge(2,0);
        g.addEdge(2,5);
        g.addEdge(5,7);
        g.addEdge(4,6);
    }

    @Test
    void testAddEdge2() {
        g.addEdge(2, 3, 5);
        g.addEdge(3, 4, 5.5);
        g.addEdgeBoth(0,1, 2.2);
    }

    @Test
    void testPrintMatrix() {
        testAddEdge2();
        g.printMatrix();
    }

    @Test
    void testDepthSearch() {
        testAddEdge();
        g.depthSearchStart(1);
    }

    @Test 
    void testBroadSearch() {
        testAddEdge();
        g.broadSearchStart(1);
    }
}
