package CompositumSolution;
/**
 * Abstract class that defines the behaviour of a node.
 */

public abstract class Node {
    public abstract Node push(DataElement data);
    public abstract void printList();
    public abstract int length();
    public abstract DataElement itemAtPosition(int position, int counter);
    public abstract int searchItemInQueue(DataElement data, int counter);
    public abstract boolean contains(DataElement data);
    public abstract DataElement removeAtPosition(int position, int counter);
    public abstract Node removeElement(DataElement toRemove);
    public abstract Node appendSorted(DataElement data);
    public abstract Node findEnd(Node node);

    public abstract DataElement getData();
    public abstract void setNext(Node node);
    public abstract Node getNext();
}
