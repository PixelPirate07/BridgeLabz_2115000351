import java.util.*;
class Book{
    private String title;
    private String author;
    private double price;
    private boolean isAvailable;
    public Book(String title,String author,double price,boolean isAvailable){
        this.title=title;
        this.author=author;
        this.price=price;
        this.isAvailable=isAvailable;
    }
    public void borrowBook(){
        if (isAvailable){
            isAvailable=false;
            System.out.println("Book borrowed successfully "+title);
        } else {
            System.out.println("The book is not available "+title);
        }
    }
    public void displayBookDetails() {
        System.out.println("Title is "+title);
        System.out.println("Author is "+author);
        System.out.println("Price is"+price);
        System.out.println("Book is "+(isAvailable?"Available":"Not Available"));
    }
}
public class LibraryBookSystem{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter title");
        String title=sc.nextLine();
        System.out.println("Enter author");
        String author=sc.nextLine();
        System.out.println("Enter price");
        double price=sc.nextDouble();
        System.out.println("Enter Availability in boolean");
        boolean isAvailable=sc.nextBoolean();
        Book obj=new Book(title,author,price,isAvailable);
        obj.displayBookDetails();
        obj.borrowBook();
        obj.displayBookDetails();
    }
}
