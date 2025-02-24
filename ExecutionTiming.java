import java.lang.reflect.Method;
class SampleClass{
    public void fastMethod(){
        System.out.println("Executing fast Method");
    }
    public void slowMethod(){
        System.out.println("Executing slow Method");
        try{
            Thread.sleep(2000);
        }catch(InterruptedException e){
            e.printStackTrace();
        }
    }
}
class MethodTimer{
    public static void measureExecutionTime(Object obj, String methodName){
        try{
            Method method=obj.getClass().getMethod(methodName);
            long startTime=System.nanoTime();
            method.invoke(obj);
            long endTime=System.nanoTime();
            long duration=(endTime-startTime)/1000000;
            System.out.println("Execution time of "+methodName+": "+duration);
        }catch(Exception e){
            System.out.println("Error "+e.getMessage());
        }
    }
}
public class ExecutionTiming{
    public static void main(String[] args){
        SampleClass obj=new SampleClass();
        MethodTimer.measureExecutionTime(obj,"fastMethod");
        MethodTimer.measureExecutionTime(obj,"slowMethod");
    }
}

