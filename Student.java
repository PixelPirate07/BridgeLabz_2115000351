import java.util.*;
class Student{
    static String universityName="ABC University";
    static int totalStudents=0;
    int rollNumber;
    String name;
    String grade;
    public Student(String name,final int rollNumber,String grade){
        this.name=name;
        this.rollNumber=rollNumber;
        this.grade=grade;
        totalStudents++;
    }
    static void displayTotalStudents(){
        System.out.println("Total students are "+totalStudents);
    }
    public void viewDetails(){
        System.out.println("University Name "+universityName);
        System.out.println("Student Name "+name);
        System.out.println("Roll Number "+rollNumber);
        System.out.println("Grade "+grade);
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Student Name");
        String name=sc.nextLine();
        System.out.println("Enter Roll Number");
        int roll=sc.nextInt();
        sc.nextLine();
        System.out.println("Enter Grade");
        String grade=sc.nextLine();
        System.out.println("Enter Student Name 2");
        String name1=sc.nextLine();
        System.out.println("Enter Roll Number 2");
        int roll1=sc.nextInt();
        sc.nextLine();
        System.out.println("Enter Grade 2 ");
        String grade1=sc.nextLine();
        Student student1=new Student(name,roll,grade);
        Student student2=new Student(name1,roll1,grade1);
        if (student1 instanceof Student && student2 instanceof Student){
            student1.viewDetails();
            student2.viewDetails();
            displayTotalStudents();
        }
    }
}
