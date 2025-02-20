
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice=0;

        System.out.println("Operations on list");
        SinglyLL<IDedObject> ll = new SinglyLL<>();
        while (choice != 7) {
            System.out.println("1. Make Empty");
            System.out.println("2. Find ID");
            System.out.println("3. Insert At Front");
            System.out.println("4. Delete From Front");
            System.out.println("5. Delete ID");
            System.out.println("6. Print All Records");
            System.out.println("7. Done");

            choice = scanner.nextInt();

        
            if (choice == 1) {
                System.out.println("Your choice: "+choice);
                ll.makeEmpty();
            } else if (choice == 2) {
                System.out.println("Your choice: "+choice);
                System.out.println("Enter Product ID");
                int id;
                id = scanner.nextInt();
                System.out.println("ID No: " + id);
                ll.findID(id);
            } else if (choice == 3) {
                System.out.println("Your choice: "+choice);
                int id;
                String productName,supplierName;

                System.out.println("Enter Id");
                id = scanner.nextInt();
                scanner.nextLine();
                System.out.println("Enter Product Name");
                productName = scanner.nextLine();
                System.out.println("Enter Supplier Name");
                supplierName = scanner.nextLine();

                Product product = new Product(id, productName, supplierName);

                ll.insertAtFront(product);
                
            } else if (choice == 4) {
                System.out.println("Your choice: "+choice);
                ll.deleteFromFront();
               
            } else if (choice == 5) {
                int idDelete;
                System.out.println("Your choice: "+choice);
                System.out.println("ID No to delete: ");
                idDelete=scanner.nextInt();

                ll.delete(idDelete);

            } else if (choice == 6) {
                System.out.println("Your choice: "+choice);
                ll.printAllRecords();
            } else if (choice == 7) {
                System.out.println("Your choice: "+choice);
                System.out.println("Done");
                System.exit(choice);
            } else {
                System.out.println("Your choice: "+choice);
                System.out.println("Please enter valid chocie!");
            }

        }
        
        scanner.close();
        ;
    }
}