package GraphListSolution;

public class Main {
    
    public static void main(String[] args) {
        Graph g = new Graph(5);
        g.addEdge(0,1);
        g.addEdge(1,2,5.2);
        g.addEdge(0,2, 3.1);
        g.addEdgeBoth(3,4);
        g.addEdgeBoth(2,3, 1.1);
        System.out.println(g.existsEdge(2, 3));
        g.printGraph();
    }
}
