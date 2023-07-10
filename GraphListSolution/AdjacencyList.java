package GraphListSolution;

public class AdjacencyList {
    
    private ListNode root;

    public AdjacencyList() {
        root = null;
    }

    public void append(Node end, double weight) {
        if(root != null) {
            ListNode tmp = new ListNode(end, weight);
            tmp.setNext(root);
            root = tmp;
        } else {
            root = new ListNode(end, weight);
        }
        
    }

    public boolean existsEdge(int end) {
        if(root != null) {
            return root.existsEdge(end);
        }
        return false;
    }

    public void removeEdge(int end) {
        if(root != null) {
            if(root.getEnd().getNumber() == end) {
                root = root.getNext();
            } else {
                root.removeEdge(end);
            }
        } else {
            System.out.println("This node has no edges to delete");
        }
    }

    public void print() {
        if(root != null) {
            root.print();
        }
    }
}


class ListNode {
    private Node end;
    private double weight; 
    private ListNode next;

    public ListNode(Node end, double weight) {
        this.end = end;
        this.weight = weight;
        this.next = null;
    }

    public void setNext(ListNode next) {
        this.next = next;
    }

    public ListNode getNext() {
        return next;
    }

    public Node getEnd() {
        return end;
    }

    public boolean existsEdge(int end) {
        if(this.end.getNumber() == end) {
            return true;
        } 
        if(next == null) {
            return false;
        }
        return next.existsEdge(end);
    }

    public void removeEdge(int end) {
        if(next == null) {
            System.out.println("There is no edge to remove here");
        }
        if(next.getEnd().getNumber() == end) {
            next = next.getNext();
        }
    }

    public void print() {
        System.out.println("Neighbour: " + end.getNumber() + " with weight " + weight);
        if(next != null) {
            next.print();
        }
    }
}
