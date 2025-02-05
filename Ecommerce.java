import java.util.*;
class Product{
    private String name;
    private double price;
    public Product(String name,double price){
        this.name=name;
        this.price=price;
    }
    public String getName(){
        return name;
    }
    public double getPrice(){
        return price;
    }
    public void displayProductInfo(){
        System.out.println("Product is "+name+", Price is "+price);
    }
}
class Order{
    private int orderId;
    private List<Product> products;
    public Order(int orderId){
        this.orderId=orderId;
        this.products=new ArrayList<>();
    }
    public int getOrderId(){
        return orderId;
    }
    public void addProduct(Product product){
        products.add(product);
    }
    public void displayOrderInfo(){
        System.out.println("Order ID "+orderId);
        if (products.isEmpty()) {
            System.out.println("No products in this order");
        } 
        else{
            System.out.println("Products in the order");
            for(Product product:products){
                product.displayProductInfo();
            }
        }
    }
}
class Customer{
    private String name;
    private List<Order> orders;
    public Customer(String name){
        this.name=name;
        this.orders=new ArrayList<>();
    }
    public String getName(){
        return name;
    }
    public void placeOrder(Order order){
        orders.add(order);
    }
    public void displayCustomerInfo(){
        System.out.println("Customer "+name);
        if(orders.isEmpty()){
            System.out.println("No orders placed");
        }
        else{
            System.out.println("Orders placed");
            for(Order order:orders){
                order.displayOrderInfo();
                System.out.println();
            }
        }
    }
}
public class Ecommerce{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number of customers ");
        int numCustomers=sc.nextInt();
        sc.nextLine();
        List<Customer> customers=new ArrayList<>();
        for(int i=0;i<numCustomers;i++){
            System.out.print("Enter customer name ");
            String customerName=sc.nextLine();
            Customer customer=new Customer(customerName);
            System.out.print("Enter number of orders for "+customerName);
            int numOrders = sc.nextInt();
            sc.nextLine();
            for(int j=0;j<numOrders;j++){
                System.out.print("Enter order ID ");
                int orderId=sc.nextInt();
                sc.nextLine();
                Order order=new Order(orderId);
                System.out.print("Enter number of products in order "+orderId);
                int numProducts=sc.nextInt();
                sc.nextLine();
                for(int k=0;k<numProducts; k++){
                    System.out.print("Enter product name ");
                    String productName=sc.nextLine();
                    System.out.print("Enter product price ");
                    double productPrice=sc.nextDouble();
                    sc.nextLine();
                    Product product=new Product(productName,productPrice);
                    order.addProduct(product);
                }
                customer.placeOrder(order);
            }
            customers.add(customer);
        }
        System.out.println("\nE-commerce Platform Summary");
        for(Customer customer:customers){
            customer.displayCustomerInfo();
            System.out.println();
        }
    }
}
