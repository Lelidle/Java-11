package BinarySearchTreeSolution;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BinaryTreeTest {
    
    private BinarySearchTree t;

    public BinaryTreeTest() {
        t = new BinarySearchTree();
        t.insert("milk", "Milch");
        t.insert("fish", "Fisch");
        t.insert("grape", "Weintraube");
        t.insert("apple", "Apfel");
        t.insert("soup", "Suppe");
        t.insert("zoo", "zoo");
        t.insert("rail", "Schiene");
        t.insert("dog", "Hund");
        t.insert("rest", "ruhen");
    }

    @Test 
    public void insertTest() {
        BinarySearchTree t = new BinarySearchTree();
        t.insert("milk", "Milch");
        t.insert("fish", "Fisch");
        t.insert("grape", "Weintraube");
        t.insert("apple", "Apfel");
        t.insert("dog", "Hund");
        t.insert("soup", "Suppe");
        t.insert("zoo", "zoo");
        t.insert("rail", "Schiene");
        t.insert("rest", "ruhen");
        Assertions.assertEquals("milk", t.getRoot().getWord());
        Assertions.assertEquals("dog", t.getRoot().getLeft().getLeft().getRight().getWord());
        Assertions.assertEquals("rest", t.getRoot().getRight().getLeft().getRight().getWord());
        Assertions.assertEquals("soup", t.getRoot().getRight().getWord());
        Assertions.assertEquals("apple", t.getRoot().getLeft().getLeft().getWord());
    }

    @Test 
    public void translateTest() {
        Assertions.assertEquals("ruhen", t.translate("rest"));
        Assertions.assertEquals("Milch", t.translate("milk"));
        Assertions.assertEquals("Hund", t.translate("dog"));
        Assertions.assertEquals("404", t.translate("brab"));
    }

    @Test 
    public void containsTest() {
        Assertions.assertEquals(true, t.contains("zoo"));
        Assertions.assertEquals(false, t.contains("Blubb"));
    }

    @Test
    public void printTest() {
        System.out.println("Pre-Order: Next line should show: milk fish apple dog grape soup rail rest zoo");
        t.print(Order.PRE);
        System.out.println();
        System.out.println("In-Order: Next line should show: apple dog fish grape milk rail rest soup zoo");
        t.print(Order.IN);
        System.out.println();
        System.out.println("Post-Order: Next line should show: dog apple grape fish rest rail zoo soup milk");
        t.print(Order.POST);
        System.out.println();
    }

    @Test
    public void printIndentTest() {
        t.printIndent(Order.PRE);
        System.out.println();
        t.printIndent(Order.IN);
        System.out.println();
        t.printIndent(Order.POST);
        System.out.println();
    }

    @Test
    public void maxDepthTest() {
        Assertions.assertEquals(4, t.maxDepth());
        Assertions.assertEquals(0, new BinarySearchTree().maxDepth());
        BinarySearchTree test = new BinarySearchTree();
        test.insert("test", "test");
        Assertions.assertEquals(1, test.maxDepth());
    } 

    @Test 
    public void depthOfTest() {
        Assertions.assertEquals(1, t.depthOf("milk"));
        Assertions.assertEquals(2, t.depthOf("soup"));
        Assertions.assertEquals(3, t.depthOf("apple"));
        Assertions.assertEquals(4, t.depthOf("dog"));
    }

    @Test 
    public void numberOfNodesTest() {
        Assertions.assertEquals(9, t.numberOfNodes());
    }

    @Test 
    public void sumOfDepthsTest () {
        Assertions.assertEquals(25, t.sumOfDepths());
    }

    @Test 
    public void averageDepthTest() {
        Assertions.assertEquals((double)25/9, t.averageDepth());
    }

    @Test 
    public void sumInRowTest() {
        Assertions.assertEquals(1, t.sumInRow(1));
        Assertions.assertEquals(2, t.sumInRow(2));
        Assertions.assertEquals(4, t.sumInRow(3));
        Assertions.assertEquals(2, t.sumInRow(4));
    }

    @Test 
    public void almostOptimalTest() {
        Assertions.assertEquals(true, t.almostOptimal());
        BinarySearchTree test = new BinarySearchTree();
        test.insert("dla", "d");
        test.insert("cd", "c");
        test.insert("bd", "b");
        Assertions.assertEquals(false, test.almostOptimal());
    }

    @Test 
    public void deleteTest() {
        t.insert("zzz", "zzz");
        t.delete("soup");
        t.printIndent(Order.PRE);
        System.out.println();
        //System.out.println(t.getRoot().getRight().getMinRightSubtree().getWord());
        t.delete("fish");
        t.delete("dog");
        t.delete("grape");
        t.delete("milk");
        System.out.println(t.getRoot().getWord());
        //t.printIndent(Order.PRE);
    }
}
