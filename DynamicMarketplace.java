import java.util.*;
class Product<T>{
    private String name;
    private double price;
    private T category;
    Product(String name,int price,T category){
        this.name=name;
        this.price=price;
        this.category=category;
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
    public T getCategory(){
        return category;
    }
    public String toString(){
        return name+" ("+category+") - " +price;
    }
}
class DiscountUtils{
    public static <T extends Product<?>> void applyDiscount(T product,double percentage){
        double newPrice=product.getPrice()-(product.getPrice()*percentage/100);
        product.setPrice(newPrice);
        System.out.println("Discount applied  "+product);
    }
}
public class DynamicMarketplace{
    public static void main(String args[]){
         Product<String> book=new Product<>("The Lost World",550,"Book Category");
        Product<String> clothing=new Product<>("T-Shirt",2000,"Clothing Category");
        Product<String> gadget=new Product<>("Smartphone",50000,"Gadget Category");
        DiscountUtils.applyDiscount(book,10);
        DiscountUtils.applyDiscount(clothing,10);
        DiscountUtils.applyDiscount(gadget,15);
    }
}