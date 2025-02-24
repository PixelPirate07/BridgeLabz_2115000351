import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Method;
@Retention(RetentionPolicy.RUNTIME)
@interface BugReports{
    BugReport[] value();
}
@Retention(RetentionPolicy.RUNTIME)
@Repeatable(BugReports.class)
@interface BugReport{
    String description();
}
class SoftwareModule{
    @BugReport(description="Null pointer exception occurs in edge cases")
    @BugReport(description="Performance issue when processing large data")
    public void process(){
        System.out.println("Processing data");
    }
}
public class Repeatable{
    public static void main(String[] args){
        try{
            Method method=SoftwareModule.class.getMethod("process");
            BugReports bugReports=method.getAnnotation(BugReports.class);
            if(bugReports!=null){
                for(BugReport bug:bugReports.value()){
                    System.out.println("Bug Report "+bug.description());
                }
            }
        }catch(NoSuchMethodException e){
            e.printStackTrace();
        }
    }
}

