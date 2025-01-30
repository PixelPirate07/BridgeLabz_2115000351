import java.util.*;
class Employee{
    String name;
    int id;
    double salary;
    public Employee(String name,int id,int salary){
        this.name=name;
        this.id=id;
        this.salary=salary;
    }
    public void displayDetails(){
        System.out.println("Name is "+name);
        System.out.println("ID is " +id);
        System.out.println("Salary is " +salary);
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter name ");
        String name=sc.nextLine();
        System.out.println("Enter id ");
        int id=sc.nextInt();
        System.out.println("Enter salary ");
        int sal=sc.nextInt();
        Employee obj=new Employee(name,id,sal);
        obj.displayDetails();
    }
}
