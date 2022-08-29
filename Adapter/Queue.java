package Adapter;

public class Queue {
    
    private MyList list;

    public Queue() {    
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
     * Removes the first element in the list.
     * @return returns a reference to the removed element.
     */
    public DataElement pop() {
        return list.removeFirst();
    }

    /**
     * prints the information of the elements in queue in queue order.
     */
    public void printQueue() {
        list.printList();
    }
}
