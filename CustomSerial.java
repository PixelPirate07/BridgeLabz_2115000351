import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Field;
@Retention(RetentionPolicy.RUNTIME)
@interface JsonField{
    String name();
}
class User{
    @JsonField(name="user_name")
    private String username;
    @JsonField(name="user_email")
    private String email;
    public User(String username,String email){
        this.username=username;
        this.email=email;
    }
}
class JsonSerializer{
    public static String toJson(Object obj){
        StringBuilder json=new StringBuilder("{");
        try{
            for(Field field:obj.getClass().getDeclaredFields()){
                field.setAccessible(true);
                if(field.isAnnotationPresent(JsonField.class)){
                    JsonField annotation=field.getAnnotation(JsonField.class);
                    json.append("\"").append(annotation.name()).append("\":\"")
                        .append(field.get(obj)).append("\",");
                }
            }
            if(json.length()>1)json.deleteCharAt(json.length()-1);
        }catch(IllegalAccessException e){
            e.printStackTrace();
        }
        json.append("}");
        return json.toString();
    }
}
public class CustomSerial{
    public static void main(String[] args){
        User user=new User("Jon Snow", "jon@example.com");
        String json=JsonSerializer.toJson(user);
        System.out.println(json);
    }
}

