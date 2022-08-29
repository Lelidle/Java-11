package Adapter;
/**
 * Abstract class that defines the behaviour of a node.
 */

public interface Node {
    public Node appendBack(DataElement data);
    public void printList();
    public int length();
    public DataElement itemAtPosition(int position, int counter);
    public int searchItemInQueue(DataElement data, int counter);
    public boolean contains(DataElement data);
    public DataElement removeAtPosition(int position, int counter);
    public Node removeElement(DataElement toRemove);
    public Node appendSorted(DataElement data);
    public Node findEnd(Node node);

    public DataElement getData();
    public void setNext(Node node);
    public Node getNext();
}
