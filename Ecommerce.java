abstract class Product{
    private int productId;
    private String name;
    private double price;
    Product(int productId,String name,double price){
        this.productId=productId;
        this.name=name;
        this.price=price;
    }
    abstract double calculateDiscount();
    public int getProductId(){
        return productId;
    }
    public void setProductId(int productId){
        this.productId=productId;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
    public double getPrice(){
        return price;
    }
    public void setPrice(double price){
        this.price=price;
    }
    public double calculateFinalPrice(Taxable taxableProduct){
        double discount=calculateDiscount();
        double tax=taxableProduct.calculateTax();
        return price+tax-discount;
    }
    public void displayDetails() {
        System.out.println("Product ID is "+productId);
        System.out.println("Product Name is "+name);
        System.out.println("Price is "+price);
    }
}
interface Taxable{
    double calculateTax();
    String getTaxDetails();
}
class Electronics extends Product implements Taxable{
    private String brand;
    Electronics(int productId,String name,double price,String brand){
        super(productId,name,price);
        this.brand=brand;
    }
    @Override
    public double calculateDiscount(){
        return getPrice()*0.10;
    }
    @Override
    public double calculateTax(){
        return getPrice()*0.15;
    }
    @Override
    public String getTaxDetails() {
        return "Tax is "+calculateTax();
    }
    @Override
    public void displayDetails(){
        super.displayDetails();
        System.out.println("Brand is "+brand);
        System.out.println(getTaxDetails());
    }
} 
class Clothing extends Product implements Taxable{
    private String size;
    Clothing(int productId,String name,double price,String size){
        super(productId,name,price);
        this.size=size;
    }
    @Override
    public double calculateDiscount(){
        return getPrice()*0.15;
    }
    @Override
    public double calculateTax(){
        return getPrice()*0.10;
    }
    @Override
    public String getTaxDetails() {
        return "Tax is "+calculateTax();
    }
    @Override
    public void displayDetails(){
        super.displayDetails();
        System.out.println("Size is "+size);
        System.out.println(getTaxDetails());
    }
}
class Groceries extends Product implements Taxable{
    private String category;
    Groceries(int productId,String name,double price,String category){
        super(productId,name,price);
        this.category=category;
    }
    @Override
    public double calculateDiscount(){
        return getPrice()*0.5;
    }
    @Override
    public double calculateTax(){
        return getPrice()*0.5;
    }
    @Override
    public String getTaxDetails() {
        return "Tax is "+calculateTax();
    }
    @Override
    public void displayDetails(){
        super.displayDetails();
        System.out.println("category is "+category);
        System.out.println(getTaxDetails());
    }
}
public class Ecommerce{
    public static void main(String args[]){
        Product electronics=new Electronics(1,"Laptop",65000,"Dell");
        Product clothing=new Clothing(2,"Tshirt",1000,"L");
        Product groceries=new Groceries(3,"Ladyfinger",20,"Vegetable");
        Product[] products={electronics,clothing,groceries};
        for(Product product:products){
            product.displayDetails();
            double finalprice=product.calculateFinalPrice((Taxable)product);
            System.out.println("Final price is "+finalprice+"\n");
        }
    }
}