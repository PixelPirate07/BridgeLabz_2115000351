import java.util.*;
public class Shopping{
    private Map<String,Double> productPrices=new HashMap<>();
    private Map<String,Double> cartOrder=new LinkedHashMap<>();
    public void addProduct(String product,double price){
        productPrices.put(product,price);
        cartOrder.put(product,price);
    }
    public void displaySortedByPrice(){
        TreeMap<String,Double> sortedCart=new TreeMap<>(Comparator.comparingDouble(productPrices::get));
        sortedCart.putAll(productPrices);
        System.out.println("Cart Sorted by Price");
        for(Map.Entry<String,Double> entry:sortedCart.entrySet()){
            System.out.println(entry.getKey()+" :- "+entry.getValue());
        }
    }
    public void displayCartOrder(){
        System.out.println("Order of Items Added");
        for(Map.Entry<String,Double> entry:cartOrder.entrySet()){
            System.out.println(entry.getKey()+" :- "+entry.getValue());
        }
    }
    public static void main(String[] args){
        Shopping cart=new Shopping();
        cart.addProduct("Laptop",120000.50);
        cart.addProduct("Phone",80000.99);
        cart.addProduct("Headphones",1500.75);
        cart.addProduct("Mouse",250.9);
        cart.displaySortedByPrice();
        cart.displayCartOrder();
    }
}
