package LinkedListNodesSolution;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MyListLinkedNodeTest {

    private MyListLinkedNode testList;
    
    public MyListLinkedNodeTest(){
        testList = new MyListLinkedNode();
        testList.push(new Human("Helmut Schmidt" , 25));
        testList.push(new Human("Max Mustermann", 27));
        testList.push(new Human("Gesine Schwan", 35));
        testList.push(new Human("Helmut Kohl", 64));
        testList.push(new Human("Bill Gates", 57));
    }
    
    @Test
    void testPush() {
        MyListLinkedNode appendTest = new MyListLinkedNode();
        appendTest.push(new Human("Bob",25));
        Assertions.assertNotEquals(null, appendTest.getRoot());
    }

    @Test
    void testPop() {
        Assertions.assertEquals("Helmut Schmidt", testList.pop().getData());
    }

    @Test
    void testPrintList() {
        System.out.println("=== Printing Test ===");
        testList.printList();
        System.out.println("There should be five humans described above");
    }
}
