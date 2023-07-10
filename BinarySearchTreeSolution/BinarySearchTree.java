package BinarySearchTreeSolution;

public class BinarySearchTree {
    
    private Node root; 

    public BinarySearchTree() {
        root = new EndNode();
    }

    public Node getRoot() {
        return root;
    }
    
    public void insert(String word, String translation) {
        root = root.insert(word, translation);
    }

    public String translate(String word) {
        return root.translate(word);
    }

    public boolean contains(String word) {
        return root.contains(word);
    }

    public void print(Order order) {
        root.print(order);
    }

    public void printIndent(Order order) {
        root.printIndent(order, "");
    }

    public int maxDepth() {
        return root.maxDepth();
    }

    public int depthOf(String word) {
        return root.depthOf(word, 1);
    }

    public double averageDepth() {
       double n = (double) numberOfNodes();
       if(n > 0) {
            return sumOfDepths()/n;
       }
       return 0;
    }

    public int numberOfNodes() {
        return root.numberOfNodes();
    }

    public int sumOfDepths() {
        return root.sumOfDepths(1);
    }

    public boolean almostOptimal() {
        int d = maxDepth();
        if(d == 1) {
            return true;
        }
        double targetNumber = Math.pow(2, d - 2);
        double actualNumber = (double) sumInRow(d - 1);
        if(targetNumber == actualNumber) {
            return true;
        } else {
            return false;
        }
    }

    public int sumInRow(int depth) {
        return root.sumInRow(depth);
    }


    public void delete(String word) {
        if(word.equals(root.getWord())) {
            Node oldRoot = root;
            if(!(root.getRight() instanceof EndNode)) {
                root = root.getLeft();
            } else {
                root = root.getRight().getMinRightSubtree();
            }
            root.setLeft(oldRoot.getLeft());
            root.setRight(oldRoot.getRight());
        } else {
            root.delete(word);
        }
    }
}
