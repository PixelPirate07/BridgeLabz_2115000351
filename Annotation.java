import java.lang.annotation.*;
import java.lang.reflect.*;
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@interface Author{
    String name();
}
@Author(name="Jon Snow")
class Book{
    public void display() {
        System.out.println("Book class method");
    }
}
public class Annotation{
    public static void main(String[] args){
        try{
            Class<Book> bookClass=Book.class;
            if(bookClass.isAnnotationPresent(Author.class)){
                Author author=bookClass.getAnnotation(Author.class);
                System.out.println("Author Name "+author.name());
            }else{
                System.out.println("No @Author annotation present");
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}

