import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice = 0;

        // Displaying available operations on the list
        System.out.println("Operations on list");
        SinglyLL<IDedObject> ll = new SinglyLL<>();
        
        // Loop for menu-driven program
        while (choice != 7) {
            // Displaying menu options
            System.out.println("1. Make Empty");
            System.out.println("2. Find ID");
            System.out.println("3. Insert At Front");
            System.out.println("4. Delete From Front");
            System.out.println("5. Delete ID");
            System.out.println("6. Print All Records");
            System.out.println("7. Done");
            System.out.println("-----------------------");

            choice = scanner.nextInt();

            // Handling each choice based on user input
            if (choice == 1) {
                System.out.println("Your choice: " + choice);
                ll.makeEmpty();  // Making the list empty
            } else if (choice == 2) {
                System.out.println("Your choice: " + choice);
                System.out.println("Enter Product ID");
                int id = scanner.nextInt();
                System.out.println("ID No: " + id);
                ll.findID(id);  // Searching for product by ID
            } else if (choice == 3) {
                System.out.println("Your choice: " + choice);
                int id;
                String productName, supplierName;

                System.out.println("Enter Product Id");
                id = scanner.nextInt();
                scanner.nextLine();  // To consume newline
                System.out.println("Enter Product Name");
                productName = scanner.nextLine();
                System.out.println("Enter Supplier Name");
                supplierName = scanner.nextLine();

                Product product = new Product(id, productName, supplierName);

                ll.insertAtFront(product);  // Inserting product at the front of the list
            } else if (choice == 4) {
                System.out.println("Your choice: " + choice);
                ll.deleteFromFront();  // Deleting the product from the front
            } else if (choice == 5) {
                int idDelete;
                System.out.println("Your choice: " + choice);
                System.out.println("ID No to delete: ");
                idDelete = scanner.nextInt();

                ll.delete(idDelete);  // Deleting product by ID
            } else if (choice == 6) {
                System.out.println("Your choice: " + choice);
                ll.printAllRecords();  // Printing all records
            } else if (choice == 7) {
                System.out.println("Your choice: " + choice);
                System.out.println("Done");
                System.exit(choice);  // Exiting the program
            } else {
                System.out.println("Your choice: " + choice);
                System.out.println("Please enter a valid choice!");  // Invalid choice handling
            }
        }

        scanner.close();  // Closing the scanner
    }
}
