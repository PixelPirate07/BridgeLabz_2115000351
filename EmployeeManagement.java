abstract class Employee{
    private int employeeId;
    private String name;
    private int baseSalary;
    Employee(int employeeId,String name,int baseSalary){
        this.employeeId=employeeId;
        this.name=name;
        this.baseSalary=baseSalary;
    }
    abstract int calculateSalary();
    public void displayDetails(){
        System.out.println("Employee id is "+employeeId);
        System.out.println("Name is "+name);
        System.out.println("Base salary is "+baseSalary);
    }
    public int getEmployeeId(){
        return employeeId;
    }
    public void setEmployeeId(int employeeId){
        this.employeeId=employeeId;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
    public int getSalary(){
        return baseSalary;
    }
    public void setSalary(int baseSalary){
        this.baseSalary=baseSalary;
    }
}
class PartTimeEmployee extends Employee{
    private int hoursal;
    private int hourswork;
    PartTimeEmployee(int employeeId,String name,int baseSalary,int hoursal,int hourswork){
        super(employeeId,name,baseSalary);
        this.hoursal=hoursal;
        this.hourswork=hourswork;
    }
    @Override
    public int calculateSalary(){
        return hoursal*hourswork;
    }
    @Override
    public void displayDetails(){
        super.displayDetails();
        System.out.println("Hourly Rate is "+hoursal);
        System.out.println("Hours Worked are "+hourswork);
    }
    public int getHoursal(){
        return hoursal;
    }
    public void setHoursal(int hoursal){
        this.hoursal=hoursal;
    }
    public int getHourswork(){
        return hourswork;
    }
    public void setHourswork(int hourswork){
        this.hourswork=hourswork;
    }
}
class FullTimeEmployee extends Employee{
    private int fixedsal;
    FullTimeEmployee(int employeeId,String name,int baseSalary,int fixedsal){
        super(employeeId,name,baseSalary);
        this.fixedsal=fixedsal;
    }
    @Override
    public int calculateSalary(){
        return fixedsal;
    }
    @Override
    public void displayDetails(){
        super.displayDetails();
        System.out.println("Fixed salary is "+fixedsal);
    }
    public int getFixedSal(){
        return fixedsal;
    }
    public void setFixedSal(int fixedsal){
        this.fixedsal=fixedsal;
    }
}
interface Department{
    void assignDepartment(String departmentName);
    String getDepartmentDetails();
}
class EmployeeWithDepartment extends Employee implements Department{
    private String department;
    public EmployeeWithDepartment(int employeeId,String name,int baseSalary){
        super(employeeId,name,baseSalary);
    }
    @Override
    public void assignDepartment(String departmentName){
        this.department=departmentName;
    }
    @Override
    public String getDepartmentDetails() {
        return "Department is "+department;
    }
    @Override
    public int calculateSalary(){
        return getSalary();
    }
    @Override
    public void displayDetails(){
        super.displayDetails();
        System.out.println(getDepartmentDetails());
    }
}
public class EmployeeManagement{
    public static void main(String[] args){
        Employee fullTimeEmployee=new FullTimeEmployee(1,"Walt",0,5000);
        Employee partTimeEmployee=new PartTimeEmployee(2,"Steve",0,20,100);
        Employee[] employees={fullTimeEmployee, partTimeEmployee};
        for (Employee employee:employees){
            employee.displayDetails();
            System.out.println("Calculated Salary is "+employee.calculateSalary()+"\n");
        }
        EmployeeWithDepartment employeeWithDept=new EmployeeWithDepartment(3,"Jon",3000);
        employeeWithDept.assignDepartment("Human Resources");
        employeeWithDept.displayDetails();
    }
}
