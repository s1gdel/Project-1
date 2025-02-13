
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice=0;

        System.out.println("Operations on list");
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
                //do something
            } else if (choice == 2) {
                //do something
            } else if (choice == 3) {
                // do something
            } else if (choice == 4) {
                // do something
            } else if (choice == 5) {
                // do something
            } else if (choice == 6) {
                // do something
            } else if (choice == 7) {
                // do something
            } else {
                System.out.println("Please enter valid chocie!");
            }

        }
        
        scanner.close();
        ;
    }
}