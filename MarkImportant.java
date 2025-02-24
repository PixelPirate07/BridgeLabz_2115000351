
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Method;
@Retention(RetentionPolicy.RUNTIME)
@interface ImportantMethod{
    String level() default "HIGH";
}
class Application{
    @ImportantMethod
    public void criticalTask(){
        System.out.println("Executing critical task");
    }

    @ImportantMethod(level="MEDIUM")
    public void secondaryTask(){
        System.out.println("Executing secondary task");
    }

    public void normalTask(){
        System.out.println("Executing normal task");
    }
}
public class MarkImportant{
    public static void main(String[] args){
        try{
            Method[] methods=Application.class.getDeclaredMethods();
            for(Method method:methods){
                if(method.isAnnotationPresent(ImportantMethod.class)){
                    ImportantMethod annotation=method.getAnnotation(ImportantMethod.class);
                    System.out.println("Important Method "+method.getName()+" (Level: "+annotation.level()+")");
                }
            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}

