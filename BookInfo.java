class Book{
    String title;
    int publicationyear;
    Book(String title,int publicationyear){
        this.title=title;
        this.publicationyear=publicationyear;
    }
    void displayInfo(){
        System.out.println("Title is "+title);
        System.out.println("Production year is "+publicationyear);
    }
}
class Author extends Book{
    String name;
    String bio;
    Author(String title,int publicationyear,String name,String bio){
        super(title,publicationyear);
        this.name=name;
        this.bio=bio;
    }
    @Override
    void displayInfo(){
        super.displayInfo();
        System.out.println("Author Name is "+name);
        System.out.println("Bio is "+bio);
    }
}
public class BookInfo{
    public static void main(String args[]){
        Book obj=new Author("That Night",2016,"Nidhi Upadhyay","Good writer");
        obj.displayInfo();
    }
}