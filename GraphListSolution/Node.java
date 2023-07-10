package GraphListSolution;

public class Node {
    private int number;
    private AdjacencyList adjL;

    public Node(int number) {
        this.number = number;
        adjL = new AdjacencyList();
    }

    public void addEdge(Node end, double weight) {
        adjL.append(end, weight);
    }

    public boolean existsEdge(int end) {
        return adjL.existsEdge(end);
    }

    public void removeEdge(int end) {
        adjL.removeEdge(end);
    }

    public int getNumber() {
        return number;
    }

    public void print() {
        System.out.println("This is node number " + number + " and here are my neighbours: ");
        adjL.print();
    }
}
