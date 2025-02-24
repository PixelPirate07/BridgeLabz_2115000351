import java.lang.reflect.Constructor;
class Student{
    private String name;
    public Student(){
        this.name="Default Student";
    }
    public void display(){
        System.out.println("Student Name " +name);
    }
}
public class CreateObject{
    public static void main(String[] args){
        try{
            Class<?> studentClass=Class.forName("Student");
            Constructor<?> constructor=studentClass.getDeclaredConstructor();
            Object studentObj=constructor.newInstance();
            Student student=(Student)studentObj;
            student.display();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}

