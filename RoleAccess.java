import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Method;
@Retention(RetentionPolicy.RUNTIME)
@interface RoleAllowed{
    String value();
}
class User{
    private String role;
    public User(String role){
        this.role=role;
    }
    public String getRole(){
        return role;
    }
}
class SecureService{
    @RoleAllowed("ADMIN")
    public void adminTask(){
        System.out.println("Admin task executed successfully!");
    }
}
public class RoleAccess{
    public static void main(String[] args){
        User adminUser=new User("ADMIN");
        User regularUser=new User("USER");
        SecureService service=new SecureService();
        executeIfAllowed(service,"adminTask",adminUser);
        executeIfAllowed(service,"adminTask",regularUser);
    }
    private static void executeIfAllowed(Object obj,String methodName,User user){
        try{
            Method method=obj.getClass().getMethod(methodName);
            if(method.isAnnotationPresent(RoleAllowed.class)){
                RoleAllowed roleAllowed=method.getAnnotation(RoleAllowed.class);
                if(user.getRole().equals(roleAllowed.value())){
                    method.invoke(obj);
                } 
                else{
                    System.out.println("Access Denied!");
                }
            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}

