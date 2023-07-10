package BinarySearchTreeSolution;

public class EndNode extends Node {

    @Override
    public Node insert(String word, String translation) {
        return new DataNode(word, translation);
    }

    @Override
    public String translate(String word) {
        return "404";
    }

    @Override 
    public boolean contains(String word) {
        return false;
    }

    @Override 
    public void print(Order order) {
        return;
    }

    @Override 
    public void printIndent(Order order, String indent) {
        return;
    }

    @Override 
    public int maxDepth() {
        return 0;
    }

    @Override 
    public int depthOf(String word, int counter) {
        return 0;
    }

    @Override 
    public int numberOfNodes() {
        return 0;
    }

    @Override 
    public int sumOfDepths(int currentDepth) {
        return 0;
    }

    @Override 
    public int sumInRow(int depth) {
        return 0;
    }

    @Override 
    public Node delete(String word) {
        return this;
    }

    @Override
    public Node getMinRightSubtree() {
        return this;
    }

    @Override
    public Node getLeft() {
        return this;
    }

    @Override
    public Node getRight() {
        return this;
    }

    @Override
    public void setLeft(Node n) {}

    @Override
    public void setRight(Node n) {}

    @Override
    public String getWord() {
        return "";
    }

    @Override
    public void setWord(String word) {
        
    }
}
