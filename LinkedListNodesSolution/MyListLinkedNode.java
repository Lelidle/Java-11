package LinkedListNodesSolution;


public class MyListLinkedNode {
    
    private Node root;

    /**
     * Constructor method of the list, initializes the root as null
     */
    public MyListLinkedNode(){
        root = null;
    }

    /**
     * Helper method, returns a reference to the current root
     * @return returns a reference to the current root
     */
    public Node getRoot() {
        return root; 
    }

    /**
     * Appends a new node in back of the list
     * @param data the data to fill the Node
     */
    public void push(DataElement data){
        Node node = new Node(data);
        if(root == null) {
            root = node;
        } else {
            root.push(node);
        }
    }

    /**
     * Helper Method to print the list, uses the presentation method of 
     * a dataelement
     */
    public void printList() {
        if(root == null){
            System.out.println("No list here to print!");
        } else {
            root.printList();
        }
    }

    /**
     * removes the first node of the list and returns a reference to it
     * @return returns a reference to the former root
     */
    public DataElement pop(){
        if(root == null){
            System.out.println("No list, nothing to remove");
            return null;
        } else {
            DataElement toReturn = root.getData();
            root = root.getNext();
            return toReturn;
        }
    }

}
