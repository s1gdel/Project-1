public class SinglyLL<AnyType> implements IDedObject {
    private Node<AnyType> head;
    private Product product;

    public SinglyLL() {
        this.head = null;
        this.product = new Product();
    }


    public void makeEmpty() {
    
    }

    public AnyType findID(int ID) {
        
    }

    public boolean insertAtFront(AnyType x) {

        if(head == null){
            //this is the first node
        }
        else{
            //this is not the first node
        }
        
    }

    public AnyType deleteFromFront() {
        
    }

    public AnyType delete(int ID) {
        
    }

    public void printAllRecords() {
        if(head == null){
            System.out.println("Linked list is empty");
        }
        else{
            Node<AnyType> current = head;
            while(current != null){
                System.out.print(current.getData() + "->");
                current = current.getNextNode();
            }
            System.out.print("NULL");
        }
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
