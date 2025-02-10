abstract class FoodItem{
    private String itemName;
    private double price;
    private int quantity;
    FoodItem(String itemName,double price,int quantity){
        this.itemName=itemName;
        this.price=price;
        this.quantity=quantity;
    }
    public String getItemName(){
        return itemName;
    }
    public void setItemName(String itemName){
        this.itemName=itemName;
    }
    public double getPrice(){
        return price;
    }
    public void setPrice(double price){
        this.price=price;
    }
    public int getQuantity(){
        return quantity;
    }
    public void setQuantity(int quantity){
        this.quantity=quantity;
    }
    public abstract double calculateTotalPrice();
    public void getItemDetails(){
        System.out.println("Item is "+itemName);
        System.out.println("Price is "+price);
        System.out.println("Quantity is "+quantity);
    }
}
interface Discountable{
    double applyDiscount();
    String getDiscountDetails();
}
class VegItem extends FoodItem implements Discountable{
    VegItem(String itemName,double price,int quantity){
        super(itemName,price,quantity);
    }
    @Override
    public double calculateTotalPrice(){
        return getPrice()*getQuantity();
    }
    @Override
    public double applyDiscount(){
        return calculateTotalPrice()*0.1;
    }
    @Override
    public String getDiscountDetails(){
        return "Discount for VegItem is "+applyDiscount();
    }
    @Override
    public void getItemDetails(){
        super.getItemDetails();
        System.out.println(getDiscountDetails());
    }
}
class NonVegItem extends FoodItem implements Discountable{
    NonVegItem(String itemName,double price,int quantity){
        super(itemName,price,quantity);
    }
    @Override
    public double calculateTotalPrice(){
        return getPrice()*getQuantity()+50;
    }
    @Override
    public double applyDiscount(){
        return calculateTotalPrice()*0.05;
    }
    @Override
    public String getDiscountDetails(){
        return "Discount for NonVegItem is "+applyDiscount();
    }
    @Override
    public void getItemDetails(){
        super.getItemDetails();
        System.out.println(getDiscountDetails());
    }
}
public class FoodDelivery{
    public static void main(String[] args){
        FoodItem vegItem=new VegItem("Corn Pizza",260,2);
        FoodItem nonVegItem=new NonVegItem("Chicken Burger",150,3);
        FoodItem[] foodItems={vegItem,nonVegItem};
        double totalOrderPrice=0;
        for (FoodItem foodItem:foodItems){
            foodItem.getItemDetails();
            totalOrderPrice+=foodItem.calculateTotalPrice();
        }
        System.out.println("Total Order Price is "+totalOrderPrice+"\n");
    }
}
