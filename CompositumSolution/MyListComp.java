package CompositumSolution;

public class MyListComp {

    private Node root;
    /**
     * Constructor method of the list, sets the root to a new EndNode
     */
    public MyListComp(){
        root = new EndNode();
    }

    /**
    * Appends a new node at the end of the list
    * @param data the data that shall be appended
    */
    public void push(DataElement data) {
        if(root instanceof EndNode){
            root = new DataNode(root, data);
        } else {
            root.push(data);
        }
    }

    /**
     * removes the first node of the list and returns a reference to it
     * @return returns a reference to the former root
     */
    public DataElement pop() {
        if(root instanceof EndNode){
            System.out.println("No list, nothing to remove");
            return null;
        } else {
            DataElement toReturn = root.getData();
            root = root.getNext();
            return toReturn;
        }
    }

    /**
     * Helper Method to print the list, uses the presentation method of 
     * a dataelement
     */
    public void printList() {
        if(root instanceof EndNode){
            System.out.println("No list here to print!");
        } else {
            root.printList();
        }
    }

    /**
     * Recursive method to determine the current length of the list
     * @return returns the current length of the list
     */
    public int length() {
        return root.length();
    }

    /**
     * Recurisve method to return the reference to an item at a given position.
     * If the element is not present, null is returned
     * @param position the position of the element
     * @return returns a reference to the dataelement at the given position
     */
    public DataElement itemAtPosition(int position){
        int counter = 1;
        DataElement found = root.itemAtPosition(position, counter);
        return found;
    }

    /**
     * Recursive method to search the position of an item.
     * Only returns the first occurence, if the item is not present in the list,
     * -1 is returned
     * @param data the data that is being searched
     * @return returns the position in the list (starting at 1)
     */
    public int searchItemInQueue(DataElement data) {
        int counter = 1;
        int position = root.searchItemInQueue(data,counter);
        return position;
    }

    /**
     * Recursive method to check if a dataelement is present in the list.
     * @param data the data that is being searched
     * @return returns true, if the item is present in the list
     */
    public boolean contains(DataElement data) {
        if(this.searchItemInQueue(data) != -1) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * Recursive method to remove an item at a given position. 
     * @param position the position of the element
     * @return returns a reference to the element at the given position,
     * returns null, when the position is greater than the length of the list
     */
    public DataElement removeAtPosition(int position) {
        if(position <= 0) {
            return null;
        }
        if(position == 1) {
            return this.pop();
        } else {
            int counter = 1;
            return root.removeAtPosition(position, counter);
        }
    }

    /**
     * Removes a given Dataelement, if it is present in the list.
     * @param toRemove the Dataelement that shall be removed.
     */
    public void removeElement(DataElement toRemove) {
        root = root.removeElement(toRemove);
    }

    /**
     * A method to concatenate two lists of Type MyListComp.
     * @param o: another list
     * @return returns the concatenated list or an unchanged list, if the 
     * parameter was not of type MyListComp
     */
    public Object concatenate(Object o) {
        if(!(o instanceof MyListComp)){
            return this;
        } 
        MyListComp toConcat = (MyListComp) o;
        Node end = this.findEnd();
        end.setNext(toConcat.getRoot());
        return this;
    }
    
    /**
     * Finds the last data node in the list and returns it
     * @return returns a reference to the last data node, returns null,
     * if the list is empty.
     */
    public Node findEnd(){
        if(!(root instanceof EndNode)) {
            return root.findEnd(root);
        } else {
            return null;
        }
    }
    
    /**
     * Appends a new node sorted
     * @param data the data that shall be appended
     */
    public void appendSorted(DataElement data){
        root = root.appendSorted(data);
    }

    /**
     * Helper method, returns a reference to the current root
     * @return returns a reference to the current root
     */
    public Node getRoot(){
        return root;
    }

    /**
     * Appends a new node in front as the new root.
     * @param data the data to fill the Node
     */
    public void setRoot(DataElement data) {
        if(root == null) {
            root = new DataNode(root, data);
        } else {
            Node newRoot = new DataNode(root, data);
            newRoot.setNext(root);
            root = newRoot;
        }
    }
}
