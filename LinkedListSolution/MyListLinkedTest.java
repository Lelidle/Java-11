package LinkedListSolution;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MyListLinkedTest {

    private MyListLinked testList;

    public MyListLinkedTest(){
        testList = new MyListLinked();
        testList.push(new Human("Dave",19));
        testList.push(new Human("Martha", 51));
        testList.push(new Human("Tim", 45));
        testList.push(new Human("Adalbert", 65));
    }

    @Test
    void testLength() {
        Assertions.assertEquals(4, testList.length());
        Assertions.assertEquals(0, new MyListLinked().length());
    }

    @Test
    void testPush() {
        MyListLinked pushTest = new MyListLinked();
        pushTest.push(new Human("Manuel", 18));
        pushTest.push(new Human("Sauron", 3000));
        Assertions.assertEquals("Manuel", pushTest.getRoot().getName());
        Assertions.assertEquals("Sauron", pushTest.getRoot().getNext().getName());
    }

    @Test
    void testPop() {
        Human h = new Human("Dave", 19);
        Assertions.assertEquals(h, testList.pop());
        testList.pop();
        testList.pop();
        testList.pop();
        Assertions.assertEquals(null, testList.pop());
    }

    @Test
    void testMoveToBack() {
        testList.moveToBack();
        Assertions.assertEquals("Martha", testList.pop().getName());
        testList.pop();
        testList.pop();
        Assertions.assertEquals("Dave", testList.pop().getName());
    }
    
    @Test 
    void testMoveBack() {
        testList.moveBack(2);
        testList.printList();
        Assertions.assertEquals("Martha", testList.pop().getName());
        Assertions.assertEquals("Dave", testList.pop().getName());
        testList.moveBack(7);
        Assertions.assertEquals("Tim", testList.pop().getName());
    }

    @Test
    void testPrintList() {
        System.out.println("=== Printing Test ===");
        testList.printList();
        System.out.println("=== Four humans have to be described above to pass. ===");
    }

    @Test
    void testAlternativePrintList() {
        System.out.println("=== Alternative Printing Test ===");
        System.out.println(testList.alternativePrintList());
        System.out.println("=== Four humans have to be described above to pass. ===");
    }

    @Test
    void testSearchHumanAtPosition() {
        Assertions.assertEquals(3, testList.searchHumanInQueue(new Human("Adalbert", 65)));
        Assertions.assertEquals(-1, testList.searchHumanInQueue(new Human("Victor", 18)));
    }

    @Test
    void testContains() {
        Assertions.assertEquals(true, testList.contains(new Human("Tim", 45)));
        Assertions.assertEquals(false, testList.contains(new Human("Tim", 44)));
        MyListLinked secondList = new MyListLinked();
        Assertions.assertEquals(false, secondList.contains(new Human("Tim", 17)));
    }

    @Test
    void testRemoveAt() {
        Assertions.assertEquals("Tim", testList.removeAt(3).getName());
        Assertions.assertEquals("Dave", testList.pop().getName());
        Assertions.assertEquals("Martha", testList.pop().getName());
        Assertions.assertEquals("Adalbert", testList.pop().getName());
        testList.push(new Human("Someone", 43));
        Assertions.assertEquals(null, testList.removeAt(7));
        Assertions.assertEquals(null, testList.removeAt(-1));
        testList.printList();
        Assertions.assertEquals("Someone", testList.removeAt(1).getName());
    }


    @Test
    void testConcatenate(){
        MyListLinked toConcat = new MyListLinked();
        toConcat.push(new Human("Morris", 15));
        toConcat.push(new Human("Jonathan", 25));
        testList = (MyListLinked) testList.concatenate(toConcat);
        Assertions.assertEquals(6, testList.length());
        Assertions.assertEquals("Jonathan", testList.findEnd().getName());
    }
}
