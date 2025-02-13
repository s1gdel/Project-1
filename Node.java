public class Node<AnyType> {

    private AnyType data;
    private Node<AnyType> nextNode;
    
    public Node(AnyType data) {
        this.data = data;
        this.nextNode = null;
    }
    
    public AnyType getData() {
        return data;
    }

    public void setData(AnyType data) {
        this.data = data;
    }

    public Node<AnyType> getNextNode() {
        return nextNode;
    }

    public void setNextNode(Node<AnyType> nextNode) {
        this.nextNode = nextNode;
    }
}
