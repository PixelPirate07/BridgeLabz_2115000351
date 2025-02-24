import java.lang.reflect.Field;
import java.util.*;
class ObjectMapper{
    public static <T> T toObject(Class<T> clazz,Map<String,Object> properties){
        try{
            T instance=clazz.getDeclaredConstructor().newInstance();
            for(Map.Entry<String, Object> entry:properties.entrySet()){
                Field field;
                try{
                    field=clazz.getDeclaredField(entry.getKey());
                }catch(NoSuchFieldException e){
                    continue; 
                }
                field.setAccessible(true);
                field.set(instance,entry.getValue());
            }
            return instance;
        }catch(Exception e){
            throw new RuntimeException("Error creating object",e);
        }
    }
}
class User{
    private String name;
    private int age;
    public void display(){
        System.out.println("Name "+name+", Age "+age);
    }
}
public class CustomObject{
    public static void main(String[] args){
        Map<String, Object> properties=new HashMap<>();
        properties.put("name","Jon");
        properties.put("age",29);
        User user=ObjectMapper.toObject(User.class,properties);
        user.display();
    }
}

