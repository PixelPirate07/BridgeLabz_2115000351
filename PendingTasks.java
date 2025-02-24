import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Method;
@Retention(RetentionPolicy.RUNTIME)
@interface Todo{
    String task();  
    String assignedTo();    
    String priority() default "MEDIUM"; 
}
class ProjectModule{
    @Todo(task="Implement login functionality",assignedTo="Kohli",priority="HIGH")
    public void loginFeature(){
        System.out.println("Login feature pending");
    }
    @Todo(task="Optimize database queries",assignedTo ="John")
    public void optimizeDatabase(){
        System.out.println("Database optimization pending");
    }
    @Todo(task="Improve UI design",assignedTo="Steve",priority="LOW")
    public void improveUI(){
        System.out.println("UI improvement pending");
    }
}
public class PendingTasks{
    public static void main(String[] args){
        try{
            Method[] methods=ProjectModule.class.getDeclaredMethods();
            for(Method method:methods){
                if(method.isAnnotationPresent(Todo.class)){
                    Todo todo=method.getAnnotation(Todo.class);
                    System.out.println("Task "+todo.task());
                    System.out.println("Assigned To "+todo.assignedTo());
                    System.out.println("Priority "+todo.priority());
                }
            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}

