import java.util.*;
class Person{
    private String name;
    private int age;
    public Person(String name,int age){
        this.name=name;
        this.age=age;
    }
    public Person(Person others){
        this.name=others.name;
        this.age=others.age;
    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
}    
public class Peoplecopy{    
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter name ");
        String name=sc.nextLine();
        System.out.println("Enter age ");
        int age=sc.nextInt();
        Person person1=new Person(name,age);
        Person person2=new Person(person1);
        System.out.println("Original constructor Person is "+person1.getName()+" Age is "+person1.getAge());
        System.out.println("Cloned constructor Person is "+person2.getName()+" Age is "+person2.getAge());
    }
}
