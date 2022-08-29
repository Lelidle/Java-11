package ArrayListSolution;

public class MyListArray {
    
    private Human[] queue;
    private int count;

    /**
     * Constructor for the List, internally represented as an array
     * @param length defines the length of the list
     */
    public MyListArray(int length) {
        queue = new Human[length];
        count = 0;
    }

    /**
     * Helper getter method for testing
     * @return returns the current array that represents the list
     */
    public Human[] getQueue() {
        return queue;
    }

    /**
     * Helper getter method for testing
     * @return returns the current length of the filled part of the array
     */
    public int getCount() {
        return count;
    }

    /**
     * Helper method for the concatenate method to directly set the count as well.
     * A better implementation could be to write a method length that calculates 
     * the current length and use that method to set the new count. That way no
     * wrong count can be set!
     * @param count
     */
    public void setCount(int count) {
        this.count = count;
    }

    /**
     * appends a new human.
     * @param human only objects of class Human can be appended
     */
    public void push(Human humanToAdd) {
        if(count == queue.length) {
            enlargeArray();
        } 
        queue[count] = humanToAdd;
        count++;
    }

    /**
     * Helper method to enlarge the array by 5 at once. copies the old queue
     * into the new one. 
     */
    private void enlargeArray() {
        Human[] newQueue = new Human[queue.length + 5];
        for(int i = 0; i < queue.length; i++){
            newQueue[i] = queue[i];
        }
        queue = newQueue;
    }

    /**
     * removes the first element of the list, if present and returns it
     * @return a reference to the former first element of the list
     */
    public Human pop() {
        if(queue[0] == null) {
            return null;
        }
        Human toReturn = queue[0];
        for(int i = 0; i < count; i++){
            queue[i] = queue[i+1];
        }
        queue[queue.length-1] = null;
        count--;
        return toReturn;    
    }

    /**
     * removes the first element of the list, if present
     */
    public void popNoReference() {
        for(int i = 0; i < count; i++){
            queue[i] = queue[i+1];
        }
        queue[queue.length-1] = null;
        count--;
    }

    /**
     * Prints all Humans in the list, using the presentation function of Humans
     */
    public void printList() {
        for(int i = 0; i < queue.length; i++){
            if(queue[i] == null) {
                System.out.println("There is no list to print.");
                break;
            }
            queue[i].presentation();
        }
    }


    /**
     * Finds and returns the Human at the specified position
     * Returns null, when there is no element!
     * @param position the position in the array (starts at 1!)
     */
    public Human humanAtPosition(int position) {
        if(position >= 0 && position <= count) {
            return queue[position-1];
        } else {
            return null;
        }
    }


    /**
     * Searches a specified human in the queue and returns the position
     * @param searchValue an object of class Human that is being searched
     * @return returns -1, if the human is not in the list
     */
    public int searchHumanInQueue(Human human) {
        for(int i = 0; i < count; i++){
            if(queue[i].equals(human)){
                return i;
            }
        }
        return -1;
    }

    /**
     * Checks if a human is currently in the queue
     * @param human the human that is being looked for
     * @return the boolean that models the answer to the question
     */
    public boolean contains(Human human) {
        for(int i = 0; i < count; i++) {
            if(human.equals(queue[i])) return true;
        }
        return false;
    }

    /**
     * Alternative version of the contains function that uses searchHumanInQueue()
     * @param human the human that is being looked for
     * @return the boolean that models the answer to the question
     */
    public boolean alternativeContains(Human human) {
        if(searchHumanInQueue(human)>=0) return true;
        return false;
    }
    
    /**
     * Removes the human at the given position (position starts at 1!). Removes null, if the 
     * position is not available in the array.
     * @param position the position of the human to remove, starts at 1
     * @return returns a reference to the removed human
     */
    public Human removeAtPosition(int position) {
        if(position < 0 || position > count) {
            return null;
        }
        Human toReturn = queue[position - 1];
        for(int i = position; i < queue.length - 1; i++) {
            queue[i] = queue[i+1];
        }
        queue[queue.length-1] = null;
        return toReturn;
    }
    
    /**
     * Method to concatenate two lists. Only oncatenates if o is an object of
     * type MyList. Otherwise it returns the list without change
     * @param o Object has to be of type MyList to concatenate
     * @return returns the new concatenated list or the old one, if o is not of type MyList
     */
    public Object concatenate(MyListArray toConcat) {
        MyListArray newList = new MyListArray(this.count
            + toConcat.getCount());
        for(int i = 0; i < this.count;i++) {
            newList.getQueue()[i] = queue[i];
        }
        for(int i = 0; i < toConcat.getCount(); i++){
            newList.getQueue()[this.count + i] = toConcat.getQueue()[i];
        }
        newList.setCount(this.count+ toConcat.getCount());
        return newList;
    }
    /**
     * Inserts the given human and then calls insertionSort on the whole array to sort it again.
     * @param human the human to append.
     */
    public void appendSorted(Human human) {
        if(queue[0] == null){
            queue[0] = human;
            count++;
        } else {
            this.push(human);
            insertionSort();
        }
    }
    
    /**
     * Helper method that sorts the array.
     */
     private void insertionSort() {
        /*Divides the array in a sorted and unsorted part. It iterates over the
        unsorted part and puts the next element into the right spot in the
        sorted part thus enhancing it by one.
        */
        for(int i = 1; i < count; i++){
            //The reference to the element that shall be placed next
            Human tmp = queue[i];
            int j = i - 1; //Defines the part of the array that is sorted
            /*Moves every element that is greater up one spot until it 
            finds the right spot for the new element. isGreater() is necessary in the class Human, 
            as it is not a primitive type and cannot be compared with < or >.
             */
            while(j >= 0 && queue[j].isGreater(tmp)){
                queue[j+1] = queue[j];
                j--;
            }
            //puts the new element at the found spot
            queue[j+1] = tmp;
        }
    }

}
