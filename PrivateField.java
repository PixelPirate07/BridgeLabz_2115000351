import java.lang.reflect.Field;
class Person{
    private int age;
    public Person(int age){
        this.age=age;
    }
    public void displayAge(){
        System.out.println("Age "+age);
    }
}
public class PrivateField{
    public static void main(String[] args){
        try{
            Person person=new Person(25);
            System.out.println("Before modifying");
            person.displayAge();
            Field ageField=Person.class.getDeclaredField("age");
            ageField.setAccessible(true);
            ageField.set(person,30);
            System.out.println("\nAfter modifying");
            person.displayAge();
            int modifiedAge=(int) ageField.get(person);
            System.out.println("\nRetrieved Age using Reflection "+modifiedAge);
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}

