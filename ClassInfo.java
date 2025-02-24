import java.lang.reflect.*;
import java.io.*;
public class ClassInfo{
    public static void main(String[] args){
        try{
            System.out.println("Enter the fully qualified class name  ");
            BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
            String className=br.readLine();
            Class<?> cls=Class.forName(className);
            System.out.println("\nClass "+cls.getName());
            System.out.println("\nConstructors");
            Constructor<?>[] constructors=cls.getConstructors();
            for(Constructor<?> constructor:constructors){
                System.out.println(constructor);
            }
            System.out.println("\nMethods");
            Method[] methods=cls.getMethods();
            for(Method method:methods){
                System.out.println(method);
            }
            System.out.println("\nFields");
            Field[] fields=cls.getFields();
            for(Field field:fields){
                System.out.println(field);
            }
        }catch(Exception e){
            System.out.println("Error "+e.getMessage());
        }
    }
}

