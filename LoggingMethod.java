import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Method;
@Retention(RetentionPolicy.RUNTIME)
@interface LogExecutionTime{
}
class PerformanceTest{
    @LogExecutionTime
    public void fastMethod(){
        System.out.println("Executing fast method");
    }
    @LogExecutionTime
    public void slowMethod(){
        System.out.println("Executing slow method");
        try{
            Thread.sleep(500); 
        }catch(InterruptedException e){
            e.printStackTrace();
        }
    }
}
public class LoggingMethod{
    public static void main(String[] args){
        PerformanceTest test=new PerformanceTest();
        try{
            Method[] methods=PerformanceTest.class.getDeclaredMethods();
            for(Method method:methods){
                if(method.isAnnotationPresent(LogExecutionTime.class)){
                    long startTime=System.nanoTime();
                    method.invoke(test);
                    long endTime=System.nanoTime();
                    long executionTime=(endTime-startTime)/1000000;
                    System.out.println("Execution time of "+method.getName()+": "+executionTime);
                }
            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}

