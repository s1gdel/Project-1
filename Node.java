public class Node<AnyType> {
    private AnyType data;
    private Node<AnyType> nextNode;

    // Constructor to create a new node with data
    public Node(AnyType data) {
        this.data = data;
        this.nextNode = null;
    }

    // Getter for data
    public AnyType getData() {
        return data;
    }

    // Setter for data
    public void setData(AnyType data) {
        this.data = data;
    }

    // Getter for next node
    public Node<AnyType> getNextNode() {
        return nextNode;
    }

    // Setter for next node
    public void setNextNode(Node<AnyType> nextNode) {
        this.nextNode = nextNode;
    }
}
