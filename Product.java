public class Product implements IDedObject {
    private int productID;
    private String productName;
    private String supplierName;

    // Constructor for creating a product
    public Product(int productID, String productName, String supplierName) {
        this.productID = productID;
        this.productName = productName;
        this.supplierName = supplierName;
    }

    // Default constructor
    public Product() {
    }

    // Setter for product ID
    public void setID(int productID) {
        this.productID = productID;
    }

    // Getter for product ID
    @Override
    public int getID() {
        return productID;
    }

    // Method to print product ID and details
    @Override
    public void printID() {
        System.out.println("Product ID: " + productID);
        System.out.println("Product Name: " + productName);
        System.out.println("Supplier Name: " + supplierName);
    }
}
