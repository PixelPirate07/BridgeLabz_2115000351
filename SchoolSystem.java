class Person{
    String name;
    int age;
    Person(String name,int age){
        this.name=name;
        this.age=age;
    }
    void displayRole(){
        System.out.println("Name is "+name);
        System.out.println("Age is "+age);
    }
}
class Teacher extends Person{
    String subject;
    Teacher(String name,int age,String subject){
        super(name,age);
        this.subject=subject;
    }
    @Override
    void displayRole(){
        super.displayRole();
        System.out.println("Subject is "+subject);
    }
}
class Student extends Person{
    String grade;
    Student(String name,int age,String grade){
        super(name,age);
        this.grade=grade;
    }
    @Override
    void displayRole(){
        super.displayRole();
        System.out.println("Grade is "+grade);
    }
}
class Staff extends Person{
    String position;
    Staff(String name,int age,String position){
        super(name,age);
        this.position=position;
    }
    @Override
    void displayRole(){
        super.displayRole();
        System.out.println("Position is "+position);
    }
}
public class SchoolSystem{
    public static void main(String args[]){
        Person teacher=new Teacher("Dr. Anil",34,"Maths");
        Person student=new Student("Xyz",21,"A");
        Person staff=new Staff("Abc",37,"Incharge");
        teacher.displayRole();
        System.out.println();
        student.displayRole();
        System.out.println();
        staff.displayRole();
        
    }
}
