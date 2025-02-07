class Employee{
    String name;
    int id;
    double salary;
    Employee(String name,int id,double salary){
        this.name=name;
        this.id=id;
        this.salary=salary;
    }
    void displayDetails(){
        System.out.println("Name is "+name);
        System.out.println("ID is "+id);
        System.out.println("Salary is "+salary);
    }
    void showRole(){
        System.out.println("Role is General Employee");
    }
}
class Manager extends Employee{
    int teamSize;
    Manager(String name,int id,double salary,int teamSize){
        super(name,id,salary);
        this.teamSize=teamSize;
    }
    @Override
    void displayDetails(){
        super.displayDetails();
        System.out.println("Team Size is "+teamSize);
    }
    @Override
    void showRole(){
        System.out.println("Role is Manager");
    }
}
class Developer extends Employee{
    String programmingLanguage;
    Developer(String name,int id,double salary,String programmingLanguage){
        super(name,id,salary);
        this.programmingLanguage=programmingLanguage;
    }
    @Override
    void displayDetails(){
        super.displayDetails();
        System.out.println("Programming Language is  " + programmingLanguage);
    }
    @Override
    void showRole() {
        System.out.println("Role is Developer");
    }
}
class Intern extends Employee{
    int internshipDuration; 
    Intern(String name,int id,double salary,int internshipDuration){
        super(name,id,salary);
        this.internshipDuration=internshipDuration;
    }
    @Override
    void displayDetails(){
        super.displayDetails();
        System.out.println("Internship Duration is "+internshipDuration+" months");
    }

    @Override
    void showRole(){
        System.out.println("Role is Intern");
    }
}
public class EmployeeManagement{
    public static void main(String[] args){
        Employee manager=new Manager("Aman",101,80000,10);
        Employee developer=new Developer("Badal",102,60000,"Java");
        Employee intern=new Intern("Sam",103,20000,6);
        System.out.println("Manager Details:");
        manager.displayDetails();
        manager.showRole();
        System.out.println("\nDeveloper Details:");
        developer.displayDetails();
        developer.showRole();
        System.out.println("\nIntern Details:");
        intern.displayDetails();
        intern.showRole();
    }
}
