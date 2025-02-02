import java.util.*;
class Student{
    public int rollNumber;
    protected String name;
    private double CGPA;
    public Student(int rollNumber,String name,double CGPA){
        this.rollNumber=rollNumber;
        this.name=name;
        this.CGPA=CGPA;
    }
    public double getCGPA(){
        return CGPA;
    }
    public void setCGPA(double CGPA){
        this.CGPA=CGPA;
    }
    public void displayStudentDetails(){
        System.out.println("Roll Number is "+rollNumber);
        System.out.println("Name is "+name);
        System.out.println("CGPA is "+CGPA);
    }
}
class PostgraduateStudent extends Student{
    public PostgraduateStudent(int rollNumber,String name,double CGPA){
        super(rollNumber,name,CGPA);
    }
    public void displayPostgraduateDetails() {
        System.out.println("PG Student Details is ");
        System.out.println("Roll Number is "+rollNumber);
        System.out.println("Name is "+name);
        System.out.println("CGPA is "+getCGPA());
    }
}
public class UniversityManagement{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter roll number for Student ");
        int rollNumber=sc.nextInt();
        sc.nextLine();
        System.out.print("Enter name for Student ");
        String name=sc.nextLine();
        System.out.print("Enter CGPA for Student ");
        double CGPA=sc.nextDouble();
        Student obj=new Student(rollNumber,name,CGPA);
        obj.displayStudentDetails();
        System.out.print("\nEnter new CGPA for Student ");
        double newCGPA=sc.nextDouble();
        obj.setCGPA(newCGPA);
        System.out.println("\nUpdated Student Details after modifying CGPA");
        obj.displayStudentDetails();
        System.out.print("\nEnter roll number for PG Student ");
        int pgRollNumber=sc.nextInt();
        sc.nextLine();
        System.out.print("Enter name for PG Student ");
        String pgName=sc.nextLine();
        System.out.print("Enter CGPA for PG Student ");
        double pgCGPA=sc.nextDouble();
        PostgraduateStudent pgStudent=new PostgraduateStudent(pgRollNumber,pgName,pgCGPA);
        pgStudent.displayPostgraduateDetails();
    }
}
