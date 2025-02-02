import java.util.*;
class Employee{
    public int employeeID;
    protected String department;
    private double salary;
    public Employee(int employeeID,String department,double salary){
        this.employeeID=employeeID;
        this.department=department;
        this.salary=salary;
    }
    public double getSalary(){
        return salary;
    }
    public void setSalary(double salary){
        this.salary=salary;
    }
    public void displayEmployeeDetails(){
        System.out.println("Employee ID is "+employeeID);
        System.out.println("Department is "+department);
        System.out.println("Salary is"+salary);
    }
}
class Manager extends Employee{
    public Manager(int employeeID,String department,double salary){
        super(employeeID,department,salary);
    }
    public void displayManagerDetails() {
        System.out.println("Manager Details are");
        System.out.println("Employee ID is "+employeeID);
        System.out.println("Department is "+department);
        System.out.println("Salary is " +getSalary());
    }
}
public class EmployeeRecords{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter ID ");
        int employeeID=sc.nextInt();
        sc.nextLine();
        System.out.println("Enter Department ");
        String department=sc.nextLine();
        System.out.println("Enter salary");
        double salary=sc.nextDouble();
        Employee obj=new Employee(employeeID,department,salary);
        obj.displayEmployeeDetails();
        System.out.print("\nEnter new salary");
        double newSalary=sc.nextDouble();
        obj.setSalary(newSalary);
        System.out.println("\nUpdated Employee details");
        obj.displayEmployeeDetails();
        System.out.print("\nEnter ID for manager ");
        int managerID=sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Department for Manager ");
        String managerDepartment=sc.nextLine();
        System.out.print("Enter salary for Manager");
        double managerSalary=sc.nextDouble();
        Manager obj1=new Manager(managerID,managerDepartment,managerSalary);
        obj1.displayManagerDetails();
    }
}
