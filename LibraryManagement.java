class Book{
    String title;
    String author;
    String genre;
    int bookId;
    boolean availabilityStatus;
    Book next;
    Book prev;
    public Book(String title,String author,String genre,int bookId,boolean availabilityStatus){
        this.title=title;
        this.author=author;
        this.genre=genre;
        this.bookId=bookId;
        this.availabilityStatus=availabilityStatus;
        this.next=null;
        this.prev=null;
    }
}
class Library{
    Book head;
    Book tail;
    public Library(){
        head=null;
        tail=null;
    }
    public void addBookAtBeginning(String title, String author, String genre, int bookId, boolean availabilityStatus){
        Book newBook=new Book(title, author, genre, bookId, availabilityStatus);
        if(head==null){
            head=newBook;
            tail=newBook;
        } 
        else{
            newBook.next=head;
            head.prev=newBook;
            head=newBook;
        }
    }
    public void addBookAtEnd(String title, String author, String genre, int bookId, boolean availabilityStatus){
        Book newBook=new Book(title, author, genre, bookId, availabilityStatus);
        if(head==null){
            head=newBook;
            tail=newBook;
        } 
        else{
            tail.next=newBook;
            newBook.prev=tail;
            tail=newBook;
        }
    }
    public void addBookAtPosition(String title, String author, String genre, int bookId, boolean availabilityStatus, int position){
        Book newBook=new Book(title, author, genre, bookId, availabilityStatus);
        if(position==1){
            addBookAtBeginning(title, author, genre, bookId, availabilityStatus);
            return;
        }
        Book temp=head;
        int count=1;
        while(temp!=null && count<position-1){
            temp=temp.next;
            count++;
        }
        if(temp==null){
            System.out.println("Position out of range");
            return;
        }
        newBook.next=temp.next;
        newBook.prev=temp;
        if(temp.next!=null){
            temp.next.prev=newBook;
        }    
        temp.next=newBook;
        if(newBook.next==null){
            tail=newBook;
        }    
    }
    public void removeBookById(int bookId){
        if(head==null){
            System.out.println("Library is empty");
            return;
        }
        Book temp=head;
        while(temp!=null && temp.bookId!=bookId){
            temp=temp.next;
        }
        if(temp==null){
            System.out.println("Book not found");
            return;
        }
        if(temp==head){
            head=head.next;
            if(head!=null){
                head.prev = null;
            } 
        } 
        else if(temp==tail){
            tail=tail.prev;
            if(tail!=null){
                tail.next=null;
            }    
        } 
        else{
            temp.prev.next=temp.next;
            temp.next.prev=temp.prev;
        }
        System.out.println("Book with ID "+bookId+" removed");
    }
    public Book searchBookByTitle(String title){
        Book temp=head;
        while(temp!=null){
            if(temp.title.equals(title)){
                return temp;
            }
            temp=temp.next;
        }
        return null;
    }
    public Book searchBookByAuthor(String author){
        Book temp=head;
        while(temp!=null){
            if(temp.author.equals(author)){
                return temp;
            }
            temp=temp.next;
        }
        return null;
    }
    public void updateBookAvailability(int bookId,boolean availabilityStatus){
        Book temp=head;
        while(temp!=null){
            if(temp.bookId==bookId){
                temp.availabilityStatus=availabilityStatus;
                return;
            }
            temp=temp.next;
        }
        System.out.println("Book not found");
    }
    public void displayBooksForward(){
        if(head==null){
            System.out.println("Library is empty");
            return;
        }
        Book temp=head;
        while(temp!=null){
            System.out.println("Title is "+temp.title+", Author is "+temp.author+", Genre is " +temp.genre+", Book ID is "+temp.bookId+", Availability is "+temp.availabilityStatus);
            temp=temp.next;
        }
    }
    public void displayBooksReverse(){
        if(tail==null){
            System.out.println("Library is empty");
            return;
        }
        Book temp=tail;
        while(temp!=null){
            System.out.println("Title is "+temp.title+", Author is "+temp.author+", Genre is "+temp.genre+", Book ID is "+temp.bookId+", Availability is "+temp.availabilityStatus);
            temp=temp.prev;
        }
    }
    public int countBooks(){
        int count=0;
        Book temp=head;
        while(temp!=null){
            count++;
            temp=temp.next;
        }
        return count;
    }
}
public class LibraryManagement{
    public static void main(String[] args){
        Library library=new Library();
        library.addBookAtEnd("To Kill a Mockingbird","Harper Lee","Fiction",1,true);
        library.addBookAtEnd("1984","George Orwell","Dystopian",2,true);
        library.addBookAtEnd("Moby Dick","Herman Melville", "Adventure",3,false);
        library.addBookAtBeginning("Pride and Prejudice","Jane Austen","Romance",4,true);
        library.addBookAtPosition("The Great Gatsby","F. Scott Fitzgerald","Fiction",5,true,2);
        System.out.println("Library after adding books");
        library.displayBooksForward();
        library.removeBookById(3);
        System.out.println("\nLibrary after removing book with ID 3");
        library.displayBooksForward();
        library.updateBookAvailability(2,false);
        System.out.println("\nLibrary after updating availability of book with ID 2");
        library.displayBooksForward();
        System.out.println("\nSearching for book with title '1984'");
        Book foundBook=library.searchBookByTitle("1984");
        if(foundBook!=null){
            System.out.println("Book Found is "+foundBook.title+", "+foundBook.author+", "+foundBook.genre+", "+foundBook.bookId+", "+foundBook.availabilityStatus);
        }    
        System.out.println("\nTotal number of books in the library is "+library.countBooks());
        System.out.println("\nDisplaying books in reverse order:");
        library.displayBooksReverse();
    }
}
