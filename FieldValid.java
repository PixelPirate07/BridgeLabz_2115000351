import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Field;
@Retention(RetentionPolicy.RUNTIME)
@interface MaxLength{
    int value();
}
class User{
    @MaxLength(10)
    private String username;
    public User(String username){
        validateMaxLength(username);
        this.username = username;
    }
    private void validateMaxLength(String value){
        try{
            Field field=User.class.getDeclaredField("username");
            if(field.isAnnotationPresent(MaxLength.class)) {
                MaxLength maxLength=field.getAnnotation(MaxLength.class);
                if(value.length()>maxLength.value()){
                    throw new IllegalArgumentException("Username exceeds max length of "+maxLength.value()+" characters");
                }
            }
        }catch(NoSuchFieldException e){
            e.printStackTrace();
        }
    }
    public String getUsername(){
        return username;
    }
}
public class FieldValid{
    public static void main(String[] args){
        try{
            User user1 = new User("Alice123");
            System.out.println("User created "+user1.getUsername());
            User user2=new User("VeryLongUsername");
            System.out.println("User created "+user2.getUsername());
        }catch(IllegalArgumentException e){
            System.out.println("Error "+e.getMessage());
        }
    }
}

