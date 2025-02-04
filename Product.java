import java.util.*;
class Product{
    static double discount=0;
    int productID;
    String productName;
    double price;
    int quantity;
    public Product(String productName,final int productID,double price,int quantity) {
        this.productName=productName;
        this.productID=productID;
        this.price=price;
        this.quantity=quantity;
    }
    static void updateDiscount(double newDiscount){
        discount=newDiscount;
    }
    public void viewDetails(){
        System.out.println("Product Name "+productName);
        System.out.println("Product ID "+productID);
        System.out.println("Price "+price);
        System.out.println("Quantity "+quantity);
        System.out.println("Discount "+discount);
    }
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Product Name");
        String name=sc.nextLine();
        System.out.println("Enter Product ID");
        int id=sc.nextInt();
        System.out.println("Enter Price");
        double price=sc.nextDouble();
        System.out.println("Enter Quantity");
        int quantity=sc.nextInt();
        sc.nextLine();
        System.out.println("Enter Product Name 2");
        String name1=sc.nextLine();
        System.out.println("Enter Product ID 2");
        int id1=sc.nextInt();
        System.out.println("Enter Price 2");
        double price1=sc.nextDouble();
        System.out.println("Enter Quantity 2");
        int quantity1=sc.nextInt();
        Product prod1=new Product(name,id,price,quantity);
        Product prod2=new Product(name1,id1,price1,quantity1);
        System.out.println("Enter new discount");
        double newDiscount=sc.nextDouble();
        updateDiscount(newDiscount);
        if (prod1 instanceof Product && prod2 instanceof Product){
            prod1.viewDetails();
            prod2.viewDetails();
        }
    }
}
