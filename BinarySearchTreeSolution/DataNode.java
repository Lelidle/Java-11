package BinarySearchTreeSolution;

public class DataNode extends Node {

    private Node left;
    private Node right;
    private String word;
    private String translation;

    public DataNode(String word, String translation) {
        this.translation = translation;
        this.word = word;
        right = new EndNode();
        left = new EndNode();
    }

    @Override
    public Node insert(String word, String translation) {
        if(this.word.equals(word)) {
            System.out.println("The word is already present in the dictionary!");
            return this;
        }
        if(this.word.compareToIgnoreCase(word) < 0)  {
            right = right.insert(word, translation);
        } else {
            left = left.insert(word,translation);
        }
        return this;
    }

    @Override
    public String translate(String word) {
        if(this.word.equals(word)) {
            return translation;
        } else if(this.word.compareToIgnoreCase(word) < 0) {
            return right.translate(word);
        } else {
            return left.translate(word);
        }
    }

    @Override
    public boolean contains(String word) {
        if(this.word.equals(word)) {
           return true;
        }
        if(this.word.compareToIgnoreCase(word) < 0)  {
            return right.contains(word);
        } else {
            return left.contains(word);
        }
    }

    @Override 
    public void print(Order order) {
        if(order == Order.PRE) System.out.print(word + " ");
        left.print(order);
        if(order == Order.IN) System.out.print(word + " ");
        right.print(order);
        if(order == Order.POST) System.out.print(word + " ");
    }

    @Override 
    public void printIndent(Order order, String indent) {
        if(order == Order.PRE) System.out.println(indent + word);
        left.printIndent(order, indent + "  ");
        if(order == Order.IN) System.out.println(indent + word);
        right.printIndent(order, indent + "  ");
        if(order == Order.POST) System.out.println(indent + word);
    }

    @Override 
    public int maxDepth() {
        return Math.max(left.maxDepth() + 1, right.maxDepth() + 1);
    }

    @Override 
    public int depthOf(String word, int counter) {
        if(this.word.equals(word)) {
            return counter;
        } else if(this.word.compareToIgnoreCase(word) < 0) {
            return right.depthOf(word, counter + 1);
        } else {
            return left.depthOf(word, counter + 1);
        }
    }

    @Override 
    public int numberOfNodes() {
        return left.numberOfNodes() + right.numberOfNodes() + 1;
    }

    @Override 
    public int sumOfDepths(int currentDepth) {
        System.out.println(currentDepth);
        return currentDepth + left.sumOfDepths(currentDepth + 1) + right.sumOfDepths(currentDepth + 1);
    }

    @Override 
    public int sumInRow(int depth) {
        if(depth == 1) return 1;
        return left.sumInRow(depth - 1) + right.sumInRow(depth - 1);
    } 
/*
    @Override 
    public Node delete(String word) {
        if(this.word.compareToIgnoreCase(word) < 0) {
            if(right.getWord().equals(word)) {
                Node oldRight = right;
                right = right.getMaxRightSubtree();
                right.setLeft(oldRight.getLeft());
                right.setRight(oldRight.getRight());
                return right;
            } else {
                return right.delete(word);
            }
        } else {
            if(left.getWord().equals(word)) {
                Node oldLeft = left;
                left = left.getMaxRightSubtree();
                left.setLeft(oldLeft.getLeft());
                left.setRight(oldLeft.getRight());
                return left;
            } else {
                return left.delete(word);
            }
        }
    }
*/

    @Override 
    public Node delete(String word) {
        if (this.word.compareToIgnoreCase(word) == 0) {
            if (left instanceof EndNode && right instanceof EndNode) {
                return new EndNode();
            } else if (left instanceof EndNode) {
                return right;
            } else if (right instanceof EndNode) {
                return left;
            } else {
                Node minRight = right.getMinRightSubtree();
                this.word = minRight.getWord();
                right = right.delete(this.word);
                return this;
            }
        } else if (this.word.compareToIgnoreCase(word) < 0) {
            right = right.delete(word);
            return this;
        } else {
            left = left.delete(word);
            return this;
        }
    }

    @Override 
    public Node getMinRightSubtree() {
        if (left instanceof EndNode) {
            if(right instanceof EndNode) {
                return this;
            } else {
                return right;
            }
        } else {
            return left.getMinRightSubtree();
        }
    }


    @Override
    public Node getLeft() {
        return left;
    }

    @Override
    public Node getRight() {
        return right;
    }

    @Override
    public void setLeft(Node n) {
        left = n;
    }

    @Override
    public void setRight(Node n) {
        right = n;
    }

    @Override
    public String getWord() {
        return word;
    }

    @Override 
    public void setWord(String word) {
        this.word = word;
    }
    
}
