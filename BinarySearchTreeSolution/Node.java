package BinarySearchTreeSolution;

public abstract  class Node {

    public abstract Node insert(String word, String translation);
    public abstract String translate(String word);
    public abstract boolean contains(String word);
    public abstract void print(Order order);
    public abstract void printIndent(Order order, String indent);
    public abstract int maxDepth();
    public abstract int depthOf(String word, int counter);
    public abstract int numberOfNodes();
    public abstract int sumOfDepths(int currentDepth);
    public abstract int sumInRow(int depth);
    public abstract Node delete(String word);
    public abstract Node getMinRightSubtree();

    public abstract Node getLeft();
    public abstract Node getRight();
    public abstract void setLeft(Node n);
    public abstract void setRight(Node n);
    public abstract String getWord();
    public abstract void setWord(String word);
}
