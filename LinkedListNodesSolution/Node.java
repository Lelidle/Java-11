package LinkedListNodesSolution;

public class Node {
    
    private Node next;
    private DataElement data;
    
    /**
     * constructor that initializes the next node as null and sets data
     * @param data the DataElement that is stored in this node
     */
    public Node(DataElement data){
        next = null;
        this.data = data;
    }

    /**
     * Sets the next Node
     * @param node a reference to the Node that shall be the next one
     */
    public void setNext(Node node){
        next = node;
    }
    /**
     * Getter for the reference to the next node of this
     * @return returns a reference to the next node
     */
    public Node getNext(){
        return next;
    }

    /**
     * Recursive method to append a new Element to the back
     * @param data the dataelement for the new node
     * @return returns itself
     */
    public void push(Node node){
        if(next == null){
            next = node;
        } else {
            next.push(node);
        }
    }

    /**
     * A method to get a reference of the data in this node
     * @return the data of this Node
     */
    public DataElement getData() {
        return data;
    }

    /**
     * Recursive method to print the list in order
     */
    public void printList(){
        data.presentation();
        if (next != null) next.printList();
    }
}