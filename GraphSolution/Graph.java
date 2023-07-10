package GraphSolution;

import java.util.LinkedList;

public class Graph {

    private double[][] matrix;
    private Node[] nodes;
    private boolean[] visited;
    private LinkedList<Integer> queue;

    public Graph(double[][] matrix, Node[] nodes) {
        this.nodes = nodes;
        this.matrix = matrix;
        this.visited = new boolean[nodes.length];
    }

    public Graph(int nodeNumber) {
        nodes = new Node[nodeNumber];
        for (int i = 0; i < nodeNumber; i++) {
            nodes[i] = new Node(i);
        }
        matrix = new double[nodeNumber][nodeNumber];
        visited = new boolean[nodeNumber];
    }

    public void depthSearchStart(int nodeNumber) {
        // Das Array muss jedes Mal neu initialisiert werden, damit alle Eintr ̈age
        // false sind.
        // Alternativ k ̈onnte man am Ende der Rekursion das Array zur ̈ucksetzen.
        visited = new boolean[nodes.length];
        depthSearch(nodeNumber, "");
    }

    private void depthSearch(int nodeNumber, String indent) {
        // Der aktuelle Knoten wird abgearbeitet
        visited[nodeNumber] = true;
        // Zum Testen: Ausgabe einer Einr ̈uckung (wird bei jedem Aufruf erweitert)
        // und anschließend der Nummer des besuchten Knotens
        System.out.println(indent + nodeNumber);
        for (int i = 0; i < nodes.length; i++) {
            // F ̈ur jeden Knoten werden alle anderen Knoten angesehen, falls es eine Kante
            // gibt
            // und der Knoten nicht besucht ist, wird die Rekursion dort forgesetzt.
            if (matrix[nodeNumber][i] != 0 && !visited[i]) {
                depthSearch(i, indent + " ");
            }
        }
    }

    public void broadSearchStart(int nodeNumber) {
        visited = new boolean[nodes.length];
        // Es muss jedes Mal eine neue Warteschlange erzeugt werden!
        queue = new LinkedList<Integer>();
        // Da nicht mehr am Anfang der Methode hinzugef̈ugt wird muss hier der
        // Anfangsknoten
        // extra gesetzt werden
        visited[nodeNumber] = true;
        broadSearch(nodeNumber);
    }

    public void broadSearch(int nodeNumber) {
        // Zum Testen: Ausgabe des aktuellen Knoten und einer kurzen Notiz
        System.out.println(nodeNumber + " visited!");
        for (int i = 0; i < nodes.length; i++) {
            // F ur jeden Knoten wird ̈uberpr ̈uft, ob er ein Nachbarknoten ist und
            // ob er noch nicht besucht ist
            if (matrix[nodeNumber][i] != 0 && !visited[i]) {
                // Falls beides der Fall ist wird der Knoten zur Warteschlange hinzugefugt
                queue.addLast(i);

                // Der hinzugefügte Knoten wird bereits als besucht markiert
                visited[nodeNumber] = true;
            }
        }
        // Es wird ̈uberpuft, ob die Warteschlange leer ist, falls nein
        // wird das vorderste Element entfernt und die Breitensuche auf ihm aufgerufen
        if (!queue.isEmpty()) broadSearch(queue.pop());
    }

    public boolean checkInput(int start, int end) {
        if (start < 0 || end < 0 || start > nodes.length || end > nodes.length) {
            System.out.println("There cannot be an edge here!");
            return false;
        }
        return true;
    }

    public void addEdge(int start, int end) {
        if (checkInput(start, end))
            matrix[start][end] = 1;
    }

    public void addEdge(int start, int end, double weight) {
        if (checkInput(start, end))
            matrix[start][end] = weight;
    }

    public void addEdgeBoth(int start, int end) {
        if (checkInput(start, end)) {
            matrix[start][end] = 1;
            matrix[end][start] = 1;
        }
    }

    public void addEdgeBoth(int start, int end, double weight) {
        if (checkInput(start, end)) {
            matrix[start][end] = weight;
            matrix[end][start] = weight;
        }
    }

    public boolean existsEdge(int start, int end) {
        if (!checkInput(start, end))
            return false;
        if (matrix[start][end] != 0) {
            return true;
        }
        return false;
    }

    public void removeEdge(int start, int end) {
        if (checkInput(start, end))
            matrix[start][end] = 0;
    }

    public void removeEdgeBoth(int start, int end) {
        if (checkInput(start, end)) {
            matrix[start][end] = 0;
            matrix[end][start] = 0;
        }
    }

    public void printMatrix() {
        System.out.print("\t");
        for (int i = 0; i < nodes.length; i++) {
            System.out.print("k" + i + "\t");
        }
        for (int i = 0; i < nodes.length; i++) {
            System.out.println();
            System.out.print("k" + i + "\t");
            for (int j = 0; j < nodes.length; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
        }
    }

}