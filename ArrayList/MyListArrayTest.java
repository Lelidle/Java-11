package ArrayList;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MyListArrayTest {
/*
    MyListArray testList;

    public MyListArrayTest(){
        testList = new MyListArray(5);
        testList.push(new Human("Mike", 15));
        testList.push(new Human("Sarah", 27));
        testList.push(new Human("Manuel", 18));
        testList.push(new Human("Sina", 25));
    }

    @Test
    void testPush() {
        MyListArray pushTest = new MyListArray(2);
        pushTest.push(new Human("Mike", 15));
        pushTest.push(new Human("Sarah", 27));
        Assertions.assertEquals("Mike", pushTest.getQueue()[0].getName());
        Assertions.assertEquals("Sarah", pushTest.getQueue()[1].getName());
        pushTest.push(new Human("Balu", 43));
        Assertions.assertEquals(3, pushTest.getCount());
    }

    @Test
    void testPop() {
        Human h = testList.pop();
        Assertions.assertEquals("Mike", h.getName());
        Assertions.assertEquals("Sarah",testList.getQueue()[0].getName());
        testList.pop();
        testList.pop();
        testList.pop();
        Assertions.assertEquals(null, testList.pop());
    }

    @Test
    void testPrintList() {
        System.out.println("===This is a printtest===");
        testList.printList();
        System.out.println("=== Passed if there are four humans described above ===");
    }

    @Test
    void testhumanAtPosition() {
        Human h = testList.getQueue()[2];
        Assertions.assertEquals(null, testList.humanAtPosition(5));
        Assertions.assertEquals(h, testList.humanAtPosition(3));
        Assertions.assertEquals(null, testList.humanAtPosition(15));
        Assertions.assertEquals(null, testList.humanAtPosition(-5));
    }

    @Test
    void testSearchHumanInQueue() {
        Assertions.assertEquals(1, testList.searchHumanInQueue(new Human("Sarah", 27)));
        Assertions.assertEquals(-1, testList.searchHumanInQueue(new Human("Bernd", 72)));
    }

    @Test
    void testContains() {
        Assertions.assertEquals(true, testList.contains(new Human("Sarah",27)));
        Assertions.assertEquals(false, testList.contains(new Human("Blade", 104)));
    }

    @Test 
    void testAlternativeCOntains() {
        Assertions.assertEquals(true, testList.alternativeContains(new Human("Sarah",27)));
        Assertions.assertEquals(false, testList.alternativeContains(new Human("Blade", 104)));   
    }

    @Test
    void testGetCount() {
        Assertions.assertEquals(4, testList.getCount());
    }

    @Test
    void testRemoveAtPosition(){
        Human h = testList.removeAtPosition(2);
        Assertions.assertEquals("Sarah", h.getName());
        Assertions.assertEquals(null, testList.humanAtPosition(4));
        Assertions.assertEquals(null, testList.humanAtPosition(-3));
    }

    @Test 
    void testConcatenate(){
        MyListArray toConcat = new MyListArray(2);
        toConcat.push(new Human("Alice", 18));
        toConcat.push(new Human("Bob", 25));
        testList = (MyListArray) testList.concatenate(toConcat);
        Assertions.assertEquals(6, testList.getCount());
    }

    @Test
    void testAppendSorted(){
        MyListArray sortedTest = new MyListArray(1);
        sortedTest.appendSorted(new Human("Alice", 25));
        System.out.println();
        sortedTest.appendSorted(new Human("Bob", 34));
        System.out.println();
        sortedTest.appendSorted(new Human("Fred", 18));
        Assertions.assertEquals("Fred", sortedTest.pop().getName());
        Assertions.assertEquals("Alice", sortedTest.pop().getName());
        Assertions.assertEquals("Bob", sortedTest.pop().getName());
        Assertions.assertEquals(null, sortedTest.pop());
    }
*/
}
