class Item{
    String itemName;
    int itemId;
    int quantity;
    double price;
    Item next;
    public Item(String itemName,int itemId,int quantity,double price){
        this.itemName=itemName;
        this.itemId=itemId;
        this.quantity=quantity;
        this.price=price;
        this.next=null;
    }
}
class Inventory{
    Item head;
    public Inventory(){
        head=null;
    }
    public void addItemAtBeginning(String itemName,int itemId,int quantity,double price){
        Item newItem=new Item(itemName,itemId,quantity,price);
        newItem.next=head;
        head=newItem;
    }
    public void addItemAtEnd(String itemName,int itemId,int quantity,double price){
        Item newItem = new Item(itemName,itemId,quantity,price);
        if(head==null){
            head=newItem;
            return;
        }
        Item temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=newItem;
    }
    public void addItemAtPosition(String itemName,int itemId,int quantity,double price,int position){
        Item newItem=new Item(itemName,itemId,quantity,price);
        if(position==1){
            newItem.next=head;
            head=newItem;
            return;
        }
        Item temp=head;
        int count=1;
        while(temp!=null && count<position-1){
            temp=temp.next;
            count++;
        }
        if(temp==null){
            System.out.println("Position out of range");
            return;
        }
        newItem.next=temp.next;
        temp.next=newItem;
    }
    public void removeItemById(int itemId){
        if(head==null){
            System.out.println("Inventory is empty.");
            return;
        }
        if(head.itemId==itemId){
            head=head.next;
            return;
        }
        Item temp=head;
        while(temp.next!=null && temp.next.itemId!=itemId){
            temp=temp.next;
        }
        if(temp.next==null){
            System.out.println("Item not found.");
        } else {
            temp.next=temp.next.next;
        }
    }
    public void updateItemQuantity(int itemId,int newQuantity){
        Item temp=head;
        while(temp!=null){
            if(temp.itemId==itemId){
                temp.quantity=newQuantity;
                return;
            }
            temp=temp.next;
        }
        System.out.println("Item not found");
    }
    public Item searchItemById(int itemId){
        Item temp=head;
        while(temp!=null){
            if(temp.itemId==itemId){
                return temp;
            }
            temp=temp.next;
        }
        return null;
    }
    public Item searchItemByName(String itemName){
        Item temp=head;
        while(temp!=null){
            if(temp.itemName.equals(itemName)){
                return temp;
            }
            temp=temp.next;
        }
        return null;
    }
    public double calculateTotalValue(){
        double total=0;
        Item temp=head;
        while(temp!=null){
            total+=temp.price*temp.quantity;
            temp=temp.next;
        }
        return total;
    }
    public void sortByName(){
        if(head==null || head.next==null){
            return;
        }    
        Item current=head;
        Item index=null;
        String tempName;
        int tempId;
        int tempQuantity;
        double tempPrice;
        while(current!=null){
            index=current.next;
            while(index!=null){
                if(current.itemName.compareTo(index.itemName) > 0){
                    tempName=current.itemName;
                    current.itemName=index.itemName;
                    index.itemName=tempName;
                    tempId=current.itemId;
                    current.itemId=index.itemId;
                    index.itemId=tempId;
                    tempQuantity=current.quantity;
                    current.quantity=index.quantity;
                    index.quantity=tempQuantity;
                    tempPrice=current.price;
                    current.price=index.price;
                    index.price=tempPrice;
                }
                index=index.next;
            }
            current=current.next;
        }
    }
    public void sortByPrice(){
        if(head == null || head.next == null) return;
        Item current = head;
        Item index = null;
        String tempName;
        int tempId;
        int tempQuantity;
        double tempPrice;
        while(current != null){
            index = current.next;
            while(index != null){
                if(current.price > index.price){
                    tempName=current.itemName;
                    current.itemName=index.itemName;
                    index.itemName=tempName;
                    tempId=current.itemId;
                    current.itemId=index.itemId;
                    index.itemId=tempId;
                    tempQuantity=current.quantity;
                    current.quantity=index.quantity;
                    index.quantity=tempQuantity;
                    tempPrice=current.price;
                    current.price=index.price;
                    index.price=tempPrice;
                }
                index=index.next;
            }
            current=current.next;
        }
    }
    public void displayInventory(){
        if(head==null){
            System.out.println("Inventory is empty");
            return;
        }
        Item temp=head;
        while(temp!=null){
            System.out.println("Item Name is "+temp.itemName+", Item ID is "+temp.itemId+", Quantity is"+temp.quantity+", Price is "+temp.price);
            temp=temp.next;
        }
    }
}
public class InventoryManagement{
    public static void main(String[] args){
        Inventory inventory = new Inventory();
        inventory.addItemAtEnd("Laptop", 101, 10, 80000);
        inventory.addItemAtEnd("Smartphone", 102, 15, 50000);
        inventory.addItemAtEnd("Tablet", 103, 5, 30000);
        inventory.addItemAtBeginning("Smartwatch", 104, 20, 15000);
        inventory.addItemAtPosition("Headphones", 105, 25, 10000, 2);
        System.out.println("Inventory after adding items:");
        inventory.displayInventory();
        inventory.removeItemById(103);
        System.out.println("\nInventory after removing item with ID 103:");
        inventory.displayInventory();
        inventory.updateItemQuantity(101, 12);
        System.out.println("\nInventory after updating quantity of item with ID 101:");
        inventory.displayInventory();
        System.out.println("\nSearching for item with ID 102:");
        Item foundItem = inventory.searchItemById(102);
        if(foundItem != null){
            System.out.println("Item Found: " + foundItem.itemName + ", " + foundItem.itemId + ", " + foundItem.quantity + ", " + foundItem.price);
        }    
        System.out.println("\nTotal value of inventory: " + inventory.calculateTotalValue());
        inventory.sortByName();
        System.out.println("\nInventory sorted by item name:");
        inventory.displayInventory();
        inventory.sortByPrice();
        System.out.println("\nInventory sorted by price:");
        inventory.displayInventory();
    }
}
