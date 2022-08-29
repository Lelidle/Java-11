package Adapter;

public class SortedList {
    
    private MyList list;

    public SortedList() {
        list = new MyList();
    }

    /**
     * Appends a new element sorted to a list.
     * @param data the data that shall be appended.
     */
    public void append(DataElement data) {
        list.appendSorted(data);
    }

    /**
     * removes the element, if present in the list.
     * @param data the element that shall be removed.
     */
    public void remove(DataElement data) {
        list.removeElement(data);
    }

    /**
     * Removes the element at the given position.
     * @param position the position in the list which shall be removed.
     * @return returns a reference to the removed element.
     */
    public DataElement removeAtPosition(int position) {
        return list.removeAtPosition(position);
    }

    //...
}
