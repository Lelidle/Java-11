package Adapter;

public class Stack {
    
    private MyList list;
    
    public Stack() {
        list = new MyList();
    }

    
    /**
     * Appends a DataElement at the end of the queue.
     * @param data the data that shall be appended
     */
    public void push(DataElement data) {
        list.appendBack(data);
    }

    /**
     * Removes the last element in the list.
     * @return returns a reference to the removed element.
     */
    public DataElement pop() {
        return list.removeLast();
    }

    /**
     * prints the information of the elements in queue in queue order.
     */
    public void printQueue() {
        list.printList();
    }
}
