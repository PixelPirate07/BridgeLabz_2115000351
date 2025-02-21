import java.io.*;
import java.util.*;
class Employee implements Serializable{
    int id;
    String name, department;
    double salary;
    public Employee(int id,String name,String department,double salary){
        this.id=id;
        this.name=name;
        this.department=department;
        this.salary=salary;
    }
    public void display(){
        System.out.println(id+" | "+name+" | "+department+" | "+salary);
    }
}
public class Serialization{
    public static void main(String[] args){
        List<Employee> employees=Arrays.asList(
            new Employee(1,"Jon","HR",50000),
            new Employee(2,"Smith","IT",70000),
            new Employee(3,"Watson","Finance",60000)
        );
        try (ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("employees.dat"))){
            oos.writeObject(employees);
            System.out.println("Employees saved");
        }catch (IOException e){
            System.out.println("Error "+e.getMessage());
        }
        try (ObjectInputStream ois=new ObjectInputStream(new FileInputStream("employees.dat"))){
            List<Employee> deserializedEmployees=(List<Employee>) ois.readObject();
            System.out.println("Deserialized Employees");
            for(Employee emp:deserializedEmployees){
                emp.display();
            }
        }catch(IOException | ClassNotFoundException e){
            System.out.println("Error "+e.getMessage());
        }
    }
}
