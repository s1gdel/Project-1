public class SinglyLL<AnyType extends IDedObject>  {
    private Node<AnyType> head;
 
    public SinglyLL() {
        this.head = null;
    }


    public void makeEmpty() {
        if(head !=null){
            head = null;
        }else{
            System.out.println("Linked list is already empty");
        }
    }

    public AnyType findID(int ID) {
       Node<AnyType> current = head;
       while(current != null){
        if(current.getData() != null && current.getData().getID() == ID){

            current.getData().printID();
            return current.getData();
        }
        current = current.getNextNode();
       }
       System.out.println("No ID found");
       return null;
    }

    public boolean insertAtFront(AnyType x) {

        Node <AnyType> current = head;
        while(current != null){
            if(current.getData().getID() == x.getID()){
                System.out.println("Record already exists");
                return false;
            }
            current = current.getNextNode();
        }

            Node <AnyType> newNode = new Node <AnyType>(x);
            newNode.setNextNode(head);
            head=newNode;
            System.out.println("Sucessfully inserted at front");
            return true;
        }

    public AnyType deleteFromFront() {
        if(head==null){
            return null;
        }else{
            Node <AnyType> headDisplay = head;
            AnyType nodeData = head.getData();
            headDisplay.getData().printID();;
            head=head.getNextNode();
            return nodeData;
        }
    }

    public AnyType delete(int ID) {
        Node<AnyType> prev=null;
        Node <AnyType> current = head;
        while(current !=null){
            if(current.getData() != null && current.getData().getID() == ID){
                AnyType nodeData = current.getData();
                current.getData().printID();
                if(prev == null){
                    head=current.getNextNode();
                }
                else{
                    prev.setNextNode(current.getNextNode());
                }
                return nodeData;
            }
            else{
              prev = current;
              current = current.getNextNode();
            }
        }
        return null;
    }

    public void printAllRecords() {
        if(head == null){
            System.out.println("Linked list is empty");
        }
        else{
            Node<AnyType> current = head;
            while(current != null){
                current.getData().printID();
                System.out.println();
                current = current.getNextNode();
            }
        }
    }

  
}
