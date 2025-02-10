abstract class LibraryItem{
    private int itemId;
    private String title;
    private String author;
    LibraryItem(int itemId,String title,String author){
        this.itemId=itemId;
        this.title=title;
        this.author=author;
    }
    abstract int getLoanDuration();
    public void getItemDetails(){
        System.out.println("Item id is "+itemId);
        System.out.println("Title is "+title);
        System.out.println("Author is "+author);
    }
    public int getItemid(){
        return itemId;
    }
    public void setItemid(int itemId){
        this.itemId=itemId;
    }
    public String getTitle(){
        return title;
    }
    public void setTitle(String title){
        this.title=title;
    }
    public String getAuthor(){
        return author;
    }
    public void setAuthor(String author){
        this.author=author;
    }
}
interface Reservable{
    void reserveItem();
    boolean checkAvailability();
}
class Book extends LibraryItem implements Reservable{
    private boolean isAvailable;
    Book(int itemId,String title,String author,boolean isAvailable){
        super(itemId,title,author);
        this.isAvailable=isAvailable;
    }
    @Override
    public int getLoanDuration(){
        return 21;
    }
    @Override
    public void reserveItem(){
        if(isAvailable){
            System.out.println("Book "+getTitle()+" has been reserved");
            isAvailable=false;
        } 
        else{
            System.out.println("Book "+getTitle()+" is not available for reservation");
        }
    }
    @Override
    public boolean checkAvailability(){
        return isAvailable;
    }
    @Override
    public void getItemDetails(){
        super.getItemDetails();
        System.out.println("Loan Duration is "+getLoanDuration());
    }
}
class Magazine extends LibraryItem implements Reservable{
    private boolean isAvailable;
    Magazine(int itemId,String title,String author,boolean isAvailable){
        super(itemId,title,author);
        this.isAvailable=isAvailable;
    }
    @Override
    public int getLoanDuration(){
        return 14;
    }
    @Override
    public void reserveItem(){
        if(isAvailable){
            System.out.println("Magazine "+getTitle()+" has been reserved");
            isAvailable=false;
        } 
        else{
            System.out.println("Magazine "+getTitle()+" is not available for reservation");
        }
    }
    @Override
    public boolean checkAvailability(){
        return isAvailable;
    }
    @Override
    public void getItemDetails(){
        super.getItemDetails();
        System.out.println("Loan Duration is "+getLoanDuration());
    }
}
class DVD extends LibraryItem implements Reservable{
    private boolean isAvailable;
    DVD(int itemId,String title,String author,boolean isAvailable){
        super(itemId,title,author);
        this.isAvailable=isAvailable;
    }
    @Override
    public int getLoanDuration(){
        return 7;
    }
    @Override
    public void reserveItem(){
        if(isAvailable){
            System.out.println("Magazine "+getTitle()+" has been reserved");
            isAvailable=false;
        } 
        else{
            System.out.println("Magazine "+getTitle()+" is not available for reservation");
        }
    }
    @Override
    public boolean checkAvailability(){
        return isAvailable;
    }
    @Override
    public void getItemDetails(){
        super.getItemDetails();
        System.out.println("Loan Duration is "+getLoanDuration());
    }
}
public class LibrarySystem{
    public static void main(String args[]){
        LibraryItem book=new Book(1,"That Night","Nidhi Upadhyay",true);
        LibraryItem magazine=new Book(2,"Chacha Chaudhary","Self",true);
        LibraryItem dvd=new Book(3,"Intersteller","Christopher Nolan",false);
        LibraryItem[] items={book,magazine,dvd};
        for(LibraryItem item:items){
            item.getItemDetails();
            if(item instanceof Reservable){
                Reservable reservableItem=(Reservable)item;
                System.out.println("Available for reservation is "+reservableItem.checkAvailability());
                reservableItem.reserveItem();
                System.out.println("Available for reservation after reservation is "+reservableItem.checkAvailability());
                System.out.println();
            }
        }
    }
}