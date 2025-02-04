import java.util.*;
class Book{
    static String libraryName="Abc Library";
    String title;
    String author;
    int isbn;
    static void displayLibraryName(){
        System.out.println("Library is "+libraryName);
    }
    public Book(String title,String author,final int isbn){
        this.title=title;
        this.author=author;
        this.isbn=isbn;
    }
    public void View(){
        System.out.println("Title is "+title);
        System.out.println("Author is "+author);
        System.out.println("ISBN is "+isbn);
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter title");
        String title=sc.nextLine();
        System.out.println("Enter author");
        String author=sc.nextLine();
        System.out.println("Enter ISBN ");
        int isbn=sc.nextInt();
        sc.nextLine();
        System.out.println("Enter title 2");
        String title1=sc.nextLine();
        System.out.println("Enter author 2");
        String author1=sc.nextLine();
        System.out.println("Enter ISBN ");
        int isbn1=sc.nextInt();
        Book book1=new Book(title,author,isbn);
        Book book2=new Book(title1,author1,isbn1);
        if(book1 instanceof Book && book2 instanceof Book){
            book1.View();
            book2.View();
        }
    }
    
}