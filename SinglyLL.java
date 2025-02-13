public class SinglyLL<AnyType> implements IDedObject {
    private Node<AnyType> head;
    private int size;
    private Product product;

    public SinglyLL() {
        this.head = null;
        this.size = 0;
        this.product = new Product();
    }


    void makeEmpty() {
        
    }

    AnyType findID(int ID) {
        
    }

    boolean insertAtFront(AnyType x) {
        
    }

    AnyType deleteFromFront() {
        
    }

    AnyType delete(int ID) {
        
    }

    void printAllRecords() {
        
    }


    @Override
    public int getID() {
        return product.getID();
    }
   @Override
    public void printID() {
        product.printID();
    }
  
}
