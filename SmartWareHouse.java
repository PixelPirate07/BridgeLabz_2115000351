import java.util.*;
abstract class WarehouseItem{
    private String name;
    WarehouseItem(String name){
        this.name=name;
    }
    public String getName(){
        return name;
    }
    public String toString(){
        return getClass().getSimpleName()+" : "+name;
    }
}
class Electronics extends WarehouseItem{
    public Electronics(String name){
        super(name);
    }
}
class Groceries extends WarehouseItem{
    public Groceries(String name){
        super(name);
    }
}
class Furniture extends WarehouseItem{
    public Furniture(String name){
        super(name);
    }
}
class Item<T> extends WarehouseItem{
    public Item(String name){
        super(name);
    }
}
class Storage<T extends WarehouseItem>{
    private List<T> items=new ArrayList<>();
    public void addItem(T item){
        items.add(item);
    }
    public List<T> getItems(){
        return items;
    }
}
class WarehouseUtils{
    public static void displayItems(List<? extends WarehouseItem> items){
        for(WarehouseItem item:items){
            System.out.println(item);
        }
    }
}
public class SmartWareHouse{
    public static void main(String args[]){
        Storage<Item<Electronics>> electronicstore=new Storage<>();
        electronicstore.addItem(new Item<>("Laptop"));
        electronicstore.addItem(new Item<>("Smartphone"));
        Storage<Item<Groceries>> groceriestore=new Storage<>();
        groceriestore.addItem(new Item<>("Tomato"));
        groceriestore.addItem(new Item<>("Potato"));
        Storage<Item<Furniture>> furniturestore=new Storage<>();
        furniturestore.addItem(new Item<>("Chair"));
        furniturestore.addItem(new Item<>("Table"));
        System.out.println("Electronics Storage:");
        WarehouseUtils.displayItems(electronicstore.getItems());
        System.out.println("\nGroceries Storage:");
        WarehouseUtils.displayItems(groceriestore.getItems());
        System.out.println("\nFurniture Storage:");
        WarehouseUtils.displayItems(furniturestore.getItems());
    }
}