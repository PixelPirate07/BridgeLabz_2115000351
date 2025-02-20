import java.util.*;
class Employee{
    private String name;
    private String department;
    public Employee(String name,String department){
        this.name=name;
        this.department=department;
    }
    public String getDepartment(){
        return department;
    }
    public String getName(){
        return name;
    }
    @Override
    public String toString(){
        return name;
    }
}
public class GroupObjects{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        List<Employee> employees=readEmployees(sc);
        Map<String,List<Employee>> groupedEmployees=groupByDepartment(employees);
        System.out.println("Employees grouped by department");
        for(Map.Entry<String,List<Employee>> entry:groupedEmployees.entrySet()){
            System.out.println(entry.getKey()+": "+entry.getValue());
        }
    }
    public static List<Employee> readEmployees(Scanner sc){
        List<Employee> employees=new ArrayList<>();
        System.out.println("Enter the number of employees");
        int n=sc.nextInt();
        sc.nextLine();
        for(int i=0;i<n;i++){
            System.out.println("Enter employee name ");
            String name=sc.nextLine();
            System.out.println("Enter department ");
            String department=sc.nextLine();
            employees.add(new Employee(name,department));
        }
        return employees;
    }
    public static Map<String,List<Employee>> groupByDepartment(List<Employee> employees){
        Map<String,List<Employee>> groupedEmployees=new HashMap<>();
        for(Employee emp:employees){
            groupedEmployees.computeIfAbsent(emp.getDepartment(),k->new ArrayList<>()).add(emp);
        }
        return groupedEmployees;
    }
}
