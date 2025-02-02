import java.util.*;
class Product{
    private String productName;
    private double price;
    private static int total=0;
    public Product(String productName,double price){
        this.productName=productName;
        this.price=price;
        total++;
    }
    public void displayProductDetails() {
        System.out.println("Product Name is "+productName);
        System.out.println("Price is"+price);
    }
    public static void displayTotalProducts(){
        System.out.println("Total Products are "+total);
    }
}
public class ProductInventory{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of products ");
        int n=sc.nextInt();
        Product[] products=new Product[n];
        for(int i=0;i<n;i++){
            System.out.println("Enter name ");
            String name=sc.nextLine();
            System.out.println("Enter price ");
            double price=sc.nextDouble();
            sc.nextLine();
            products[i]=new Product(name,price);
        }
        System.out.println("Product Details are ");
        for(Product product:products){
            product.displayProductDetails();
        }
        Product.displayTotalProducts();
    }
}
