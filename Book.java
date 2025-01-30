import java.util.*;
class Book{
    String title;
    String author;
    double price;
    public Book(String title,String author,double price){
        this.title=title;
        this.author=author;
        this.price=price;
    }
    public void displaydetails(){
        System.out.println("Title is "+title);
        System.out.println("Author is "+author);
        System.out.println("Price is "+price);
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter title ");
        String title=sc.nextLine();
        System.out.println("Enter author ");
        String author=sc.nextLine();
        System.out.println("Enter price ");
        double price=sc.nextDouble();
        Book obj=new Book(title,author,price);
        obj.displaydetails();
    }
}
