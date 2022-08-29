package LinkedListSolution;
;

public class MyListLinked {

    private Human root;

    /**
     * Constructor for the list, only sets the root to null
     */
    public MyListLinked(){
        root = null;
    }

    /**
     * Calculates the length of the current list
     * @return returns the length of the list
     */
    public int length(){
        if(root != null) {
            return root.length();
        } else {
            return 0;
        }
    }

    /**
     * Sets a new human or calls append on the root human
     * @param human the reference to the human that shall be appended
     */
    public void push(Human human) {
        if(root == null) {
            root = human;
        } else {
            root.push(human);
        }
    }

    /**
     * Removes the root and returns it, if present
     * @return returns a reference to the former first element
     */
    public Human pop() {
        if(root == null) {
            System.out.println("The list is empty!");
            return null;
        } else {
            Human toReturn = root;
            root = root.getNext();
            toReturn.setNext(null);
            return toReturn;
        }
    }

    /**
     * Removes the root and appends it again in the back. 
     */
    public void moveToBack(){
        this.push(this.pop());
    }


    /**
     * Moves the root back to the given position. The position can be
     * 2 up to the length of the current list. Otherwise nothing will happen.
     * @param position the position in the queue the Human shall be moved to.
     */
    public void moveBack(int position) {
        if(position > this.length() || position <= 1) {
            return;
        }
        Human tmp = pop();
        root.moveBack(tmp, position, 1);
    }

    /**
     * Prints all the list information by running through all Humans
     */
    public void printList() {
        if(root == null){
            System.out.println("No list here to print!");
        } else {
            root.printList();
        }
    }

    /**
     * Like the method printList, but stores the information in a String that is being returned. 
     * @return returns a String that contains all the information regarding the Humans in the list.
     */
    public String alternativePrintList() {
        if(root == null){
            System.out.println("No list here to print!");
            return "";
        } else {
            return root.alternativePrintList();
        }
    }

    /**
     * Searches the position of the given human in the list
     * @param human the human that is being searched
     * @return returns the position in the list, starts at 0
     */
    public int searchHumanInQueue(Human human) {
        int counter = 0;
        int searched = root.searchHumanInQueue(human,counter);
        return searched;
    }

    /**
     * Checks if a human is in the list 
     * @param human the human that is being searched
     * @return returns true, if the human is in the list, false otherwise
     */
    public boolean contains(Human human) {
        if(root != null) {
            return root.contains(human);
        } else {
            return false;
        }

    }

    /**
     * method for testing
     * @return returns a reference to the current root
     */
    public Human getRoot(){
        return root;
    }

    /**
     * Removes the human at the given position if present and returns it.
     * @param position the position that shall be removed
     * @return returns a reference to the removed human and null, if it is not in the list.
     */
    public Human removeAt(int position) {
        if(position == 1) {
            return pop();
        }
        if(root != null) {
            int counter = 1;
            return root.removeAt(position, counter);
        } else {
            return null;
        }
    }
    
    /**
     * Helper Method to find the end of the list
     * @return returns a reference to the last element of the list.
     */
    public Human findEnd(){
        if(root != null) {
            return root.findEnd();
        } else {
            return null;
        }
    }

    /**
     * Method to concatenate two lists. 
     * @param MyListLinked second list that shall be appended to the first.
     * @return returns the new concatenated list or the old one, if o is not of type MyList
     */
    public Object concatenate(MyListLinked toConcat) {
        if(root == null) {
            return toConcat;
        }
        Human end = this.findEnd();
        end.setNext(toConcat.getRoot());
        return this;
    }
    
}
