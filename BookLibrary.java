import java.util.*;
class Book{
    public String ISBN;
    protected String title;
    private String author;
    public Book(String ISBN,String title,String author){
        this.ISBN=ISBN;
        this.title=title;
        this.author=author;
    }
    public void setAuthor(String author){
        this.author=author;
    }
    public String getAuthor(){
        return author;
    }
    public void displayBookDetails(){
        System.out.println("ISBN is "+ISBN);
        System.out.println("Title is "+title);
        System.out.println("Author is "+author);
    }
}
class EBook extends Book{
    public EBook(String ISBN,String title,String author){
        super(ISBN,title,author);
    }
    public void displayEBookDetails(){
        System.out.println("EBook Details are");
        System.out.println("ISBN is "+ISBN);
        System.out.println("Title is "+title);
        System.out.println("Author is "+getAuthor());
    }
}
public class BookLibrary{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter ISBN for the Book ");
        String ISBN = sc.nextLine();
        System.out.print("Enter title  ");
        String title=sc.nextLine();
        System.out.print("Enter author ");
        String author=sc.nextLine();
        Book obj=new Book(ISBN,title,author);
        obj.displayBookDetails();
        System.out.print("\nEnter new author name for the Book ");
        String newAuthor=sc.nextLine();
        obj.setAuthor(newAuthor);
        System.out.println("\nUpdated Book Details after modifying author");
        obj.displayBookDetails();
        System.out.print("\nEnter ISBN  ");
        String eBookISBN=sc.nextLine();
        System.out.print("Enter title ");
        String eBookTitle=sc.nextLine();
        System.out.print("Enter author ");
        String eBookAuthor=sc.nextLine();
        EBook obj1=new EBook(eBookISBN,eBookTitle,eBookAuthor);
        obj1.displayEBookDetails();
    }
}
