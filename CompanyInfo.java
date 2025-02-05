import java.util.*;
class Employee{
    private String name;
    private String position;
    public Employee(String name,String position){
        this.name=name;
        this.position=position;
    }
    public void displayEmployeeInfo() {
        System.out.println("Employee Name is "+name+", Position is "+position);
    }
}
class Department{
    private String name;
    private List<Employee> employees;
    public Department(String name){
        this.name=name;
        this.employees=new ArrayList<>();
    }
    public void addEmployee(Employee employee){
        employees.add(employee);
    }
    public void displayDepartmentInfo(){
        System.out.println("Department is "+name);
        if(employees.isEmpty()){
            System.out.println("No employees in this department");
        } 
        else {
            for (Employee employee : employees) {
                employee.displayEmployeeInfo();
            }
        }
    }
}
class Company{
    private String name;
    private List<Department> departments;
    public Company(String name){
        this.name=name;
        this.departments=new ArrayList<>();
    }
    public void addDepartment(Department department){
        departments.add(department);
    }
    public void displayCompanyInfo() {
        System.out.println("Company: " + name);
        if (departments.isEmpty()) {
            System.out.println("No departments in the company.");
        } else {
            for (Department department : departments) {
                department.displayDepartmentInfo();
                System.out.println();
            }
        }
    }
}
public class CompanyInfo{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter company name ");
        String companyName=sc.nextLine();
        Company company=new Company(companyName);
        System.out.print("Enter number of departments ");
        int numDepartments=sc.nextInt();
        sc.nextLine();
        for(int i=0;i<numDepartments;i++){
            System.out.print("Enter department name ");
            String departmentName=sc.nextLine();
            Department department=new Department(departmentName);
            System.out.print("Enter number of employees in "+departmentName);
            int numEmployees=sc.nextInt();
            sc.nextLine();
            for(int j=0;j<numEmployees;j++){
                System.out.print("Enter employee name ");
                String employeeName=sc.nextLine();
                System.out.print("Enter employee position ");
                String employeePosition=sc.nextLine();
                Employee employee=new Employee(employeeName,employeePosition);
                department.addEmployee(employee);
            }
            company.addDepartment(department);
        }
        company.displayCompanyInfo();
    }
}
