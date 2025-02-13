public class Product implements IDedObject {
    private int productID;
    private String productName;
    private String supplierName;

    public Product(int productID, String productName, String supplierName) {
        this.productID = productID;
        this.productName = productName;
        this.supplierName = supplierName;
    }

    public Product() {
        
    }

    public void setID(int productID) {
        this.productID = productID;
    }

    public int getID() {
        return productID;
    }

    public void printID() {
        System.out.println(productID);
    }

}
