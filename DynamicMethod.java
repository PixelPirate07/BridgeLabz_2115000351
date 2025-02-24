import java.lang.reflect.Method;
import java.util.*;
class MathOperations{
    public int add(int a,int b){
        return a+b;
    }
    public int subtract(int a,int b){
        return a-b;
    }
    public int multiply(int a,int b){
        return a*b;
    }
}
public class DynamicMethod{
    public static void main(String[] args){
        try{
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter method name ");
            String methodName=sc.nextLine();
            System.out.println("Enter first number ");
            int num1=sc.nextInt();
            System.out.println("Enter second number ");
            int num2=sc.nextInt();
            Class<?> mathClass=MathOperations.class;
            Method method=mathClass.getMethod(methodName,int.class,int.class);
            MathOperations mathObj=new MathOperations();
            int result=(int) method.invoke(mathObj,num1,num2);
            System.out.println("Result "+result);
        }catch(Exception e){
            System.out.println("Invalid method name or error "+e.getMessage());
        }
    }
}

