import java.util.*;
class Employee{
    static String companyName="XYZ Company";
    static int totalEmployees=0;
    int id;
    String name;
    String designation;
    public Employee(String name,final int id,String designation){
        this.name=name;
        this.id = id;
        this.designation=designation;
        totalEmployees++;
    }
    static void displayTotalEmployees(){
        System.out.println("Total employees "+totalEmployees);
    }
    public void viewDetails(){
        System.out.println("Company Name "+companyName);
        System.out.println("Employee Name "+name);
        System.out.println("Employee ID "+id);
        System.out.println("Designation "+designation);
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Employee Name ");
        String name=sc.nextLine();
        System.out.println("Enter ID ");
        int id=sc.nextInt();
        System.out.println("Enter Designation ");
        String designation=sc.nextLine();
        sc.nextLine();
        System.out.println("Enter Employee Name 2");
        String name1=sc.nextLine();
        System.out.println("Enter ID 2");
        int id1=sc.nextInt();
        System.out.println("Enter Designation 2");
        String designation1=sc.nextLine();
        sc.nextLine();
        Employee emp1=new Employee(name,id,designation);
        Employee emp2=new Employee(name1,id1,designation1);
        if (emp1 instanceof Employee && emp2 instanceof Employee){
            emp1.viewDetails();
            emp2.viewDetails();
            displayTotalEmployees();
        }
    }
}
