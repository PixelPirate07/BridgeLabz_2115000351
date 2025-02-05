import java.util.*;
class Book{
    private String title;
    private String author;
    public Book(String title,String author){
        this.title=title;
        this.author=author;
    }
    public void displayBookInfo(){
        System.out.println("Title "+title+", Author "+author);
    }
}
class Library{
    private String name;
    private List<Book> books;
    public Library(String name){
        this.name=name;
        this.books=new ArrayList<>();
    }
    public void addBook(Book book){
        books.add(book);
    }
    public void displayBooks(){
        System.out.println("Library is "+name);
        if (books.isEmpty()){
            System.out.println("No books");
        } 
        else{
            for(Book book : books){
                book.displayBookInfo();
            }
        }
    }
}
public class LibraryandBooks{
    public static void main(String[] args){
        Library library = new Library("ABC Library");
        library.addBook(new Book("That Night ","Nidhi Upadhyay"));
        library.addBook(new Book("Hidden Hindu ","Akash Gupta"));
        library.addBook(new Book("The Lost World ","Sir Arthur Canon Doyle"));
        System.out.println("\nBooks in the library are");
        library.displayBooks();
    }
}
