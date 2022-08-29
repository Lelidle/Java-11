package CompositumSolution;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MyListCompTest {

    MyListComp testList;

    public MyListCompTest(){
        testList = new MyListComp();
        testList.push(new Human("Albus", 18));
        testList.push(new Human("Berti", 62));
        testList.push(new Human("Christa", 55));
        testList.push(new Human("Dora", 7));
        testList.push(new Human("Ethel", 15));
    }

    @Test
    void testPush() {
        MyListComp pushTest = new MyListComp();
        pushTest.push(new Human("Alex", 25));
        pushTest.push(new Human("Albi", 27));
        Human firstHuman = (Human) pushTest.getRoot().getData();
        Human secondHuman = (Human) pushTest.getRoot().getNext().getData();
        Assertions.assertEquals("Alex", firstHuman.getData());
        Assertions.assertEquals("Albi", secondHuman.getData());
    }

    @Test
    void testPop() {
        Assertions.assertEquals("Albus", ((Human)testList.pop()).getData());
        Assertions.assertEquals("Berti", ((Human)testList.pop()).getData());
        Assertions.assertEquals(3, testList.length());
        testList.pop();
        testList.pop();
        testList.pop();
        Assertions.assertEquals(null, testList.pop());
    }

    @Test
    void testPrintList() {
        System.out.println("=== Printing Test ===");
        testList.printList();
        System.out.println("5 Humans have to be described above for the test to be valid");
    }   

    @Test
    void testLength() {
        Assertions.assertEquals(5, testList.length());
        MyListComp secondList = new MyListComp();
        Assertions.assertEquals(0, secondList.length());
    }


    @Test
    void testItemAtPosition() {
        Assertions.assertEquals("Christa", ((Human) testList.itemAtPosition(3)).getData());
        Assertions.assertEquals(null, testList.itemAtPosition(17));
        Assertions.assertEquals(null, testList.itemAtPosition(-5));
        Assertions.assertEquals(5, testList.length());
    }

    @Test
    void testSearchItemPosition() {
        Assertions.assertEquals(-1, testList.searchItemInQueue(new Human("Albus", 7)));
        Assertions.assertEquals(1, testList.searchItemInQueue(new Human("Albus", 18)));
        Assertions.assertEquals(5, testList.searchItemInQueue(new Human("Ethel", 15)));
        Assertions.assertEquals(5, testList.length());
    }

    @Test
    void testContains() {
        Assertions.assertEquals(true, testList.contains(new Human("Albus", 18)));
        Assertions.assertEquals(false, testList.contains(new Human("Ambros", 25)));
    }

    @Test
    void testRemoveAtPosition() {
        Assertions.assertEquals("Albus", ((Human) testList.removeAtPosition(1)).getData());
        Assertions.assertEquals("Christa", ((Human) testList.removeAtPosition(2)).getData());
        Assertions.assertEquals(3, testList.length());
    }

    @Test 
    void testRemoveElement() {
        testList.removeElement(new Human("Albus", 18));
        Assertions.assertEquals(4, testList.length());
        Assertions.assertEquals("Berti", testList.pop().getData());
    }

    @Test
    void testConcatenate() {
        MyListComp toConcat = new MyListComp();
        toConcat.push(new Human("Alex", 15));
        toConcat.push(new Human("Boris", 18));
        testList.concatenate(toConcat);
        Assertions.assertEquals(7, testList.length());
    }


    @Test 
    void testFindEnd(){
        Assertions.assertEquals("Ethel", ((Human) testList.findEnd().getData()).getData());
    }

    @Test
    void testAppendSorted() {
       MyListComp appendTest = new MyListComp();
       appendTest.appendSorted(new Human("Albi", 27));
       appendTest.appendSorted(new Human("Alex", 15));
       appendTest.appendSorted(new Human("Alex", 25));
       appendTest.appendSorted(new Human("Boris", 18));
       Assertions.assertEquals("Alex", ((Human) appendTest.pop()).getData());
       appendTest.pop();
       appendTest.pop();
       Assertions.assertEquals("Albi", ((Human) appendTest.pop()).getData());
    }
}
