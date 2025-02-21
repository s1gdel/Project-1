public class SinglyLL<AnyType extends IDedObject> {
    private Node<AnyType> head;

    // Constructor to initialize an empty linked list
    public SinglyLL() {
        this.head = null;
    }

    // Method to make the linked list empty
    public void makeEmpty() {
        if (head != null) {
            head = null;  // Setting head to null
        } else {
            System.out.println("Linked list is already empty");
        }
    }

    // Method to find a record by ID
    public AnyType findID(int ID) {
        Node<AnyType> current = head;
        while (current != null) {
            if (current.getData() != null && current.getData().getID() == ID) {
                current.getData().printID();  // Printing the record if found
                return current.getData();
            }
            current = current.getNextNode();
        }
        System.out.println("No ID found");  // If ID is not found
        return null;
    }

    // Method to insert a record at the front of the list
    public boolean insertAtFront(AnyType x) {
        Node<AnyType> current = head;
        while (current != null) {
            if (current.getData().getID() == x.getID()) {
                System.out.println("Record already exists");  // Preventing duplicate records
                return false;
            }
            current = current.getNextNode();
        }

        Node<AnyType> newNode = new Node<AnyType>(x);
        newNode.setNextNode(head);
        head = newNode;  // Inserting at the front
        System.out.println("Successfully inserted at front");
        return true;
    }

    // Method to delete a record from the front
    public AnyType deleteFromFront() {
        if (head == null) {
            System.out.println("Empty List, nothing to delete");  // If list is empty
            return null;
        } else {
            Node<AnyType> headDisplay = head;
            AnyType nodeData = head.getData();
            headDisplay.getData().printID();  // Printing the deleted record
            head = head.getNextNode();  // Removing the first element
            System.out.println("First item deleted");
            return nodeData;
        }
    }

    // Method to delete a record by ID
    public AnyType delete(int ID) {
        Node<AnyType> prev = null;
        Node<AnyType> current = head;
        while (current != null) {
            if (current.getData() != null && current.getData().getID() == ID) {
                AnyType nodeData = current.getData();
                current.getData().printID();  // Printing the deleted record
                if (prev == null) {
                    head = current.getNextNode();  // Removing from the front
                } else {
                    prev.setNextNode(current.getNextNode());  // Removing from the middle/end
                }
                System.out.println("Deleted ID");
                return nodeData;
            } else {
                prev = current;
                current = current.getNextNode();
            }
        }
        System.out.println("No ID found");  // If ID is not found
        return null;
    }

    // Method to print all records in the list
    public void printAllRecords() {
        if (head == null) {
            System.out.println("Linked list is empty");  // If list is empty
        } else {
            Node<AnyType> current = head;
            while (current != null) {
                current.getData().printID();  // Printing each record
                System.out.println();
                current = current.getNextNode();
            }
        }
    }
}
