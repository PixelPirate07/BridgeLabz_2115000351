import java.util.*;
class Faculty{
    private String name;
    private String specialization;
    public Faculty(String name,String specialization){
        this.name=name;
        this.specialization=specialization;
    }
    public String getName(){
        return name;
    }
    public String getSpecialization(){
        return specialization;
    }
    public void displayFacultyInfo(){
        System.out.println("Faculty Name is "+name+", Specialization is "+specialization);
    }
}
class Department{
    private String departmentName;
    private List<Faculty> faculties;
    public Department(String departmentName){
        this.departmentName=departmentName;
        this.faculties=new ArrayList<>();
    }
    public String getDepartmentName(){
        return departmentName;
    }
    public void addFaculty(Faculty faculty){
        faculties.add(faculty);
    }
    public void displayDepartmentInfo(){
        System.out.println("Department is "+departmentName);
        if(faculties.isEmpty()){
            System.out.println("No faculty members in this department");
        }else{
            System.out.println("Faculty Members");
            for (Faculty faculty:faculties){
                faculty.displayFacultyInfo();
            }
        }
    }
}
class University{
    private String universityName;
    private List<Department> departments;
    public University(String universityName){
        this.universityName=universityName;
        this.departments=new ArrayList<>();
    }
    public void addDepartment(Department department){
        departments.add(department);
    }
    public void displayUniversityInfo(){
        System.out.println("University is "+universityName);
        if(departments.isEmpty()){
            System.out.println("No departments in this university");
        }
        else{
            for(Department department:departments){
                department.displayDepartmentInfo();
                System.out.println();
            }
        }
    }
    public void deleteUniversity(){
        departments.clear();
        System.out.println("University deleted");
    }
}
public class UniversityInfo{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter university name ");
        String universityName=sc.nextLine();
        University university=new University(universityName);
        System.out.print("Enter number of departments ");
        int numDepartments=sc.nextInt();
        sc.nextLine();
        for(int i=0;i<numDepartments;i++){
            System.out.print("Enter department name ");
            String departmentName=sc.nextLine();
            Department department=new Department(departmentName);
            System.out.print("Enter number of faculty members in "+departmentName);
            int numFaculties=sc.nextInt();
            sc.nextLine();
            for(int j=0;j<numFaculties;j++) {
                System.out.print("Enter faculty name ");
                String facultyName=sc.nextLine();
                System.out.print("Enter faculty specialization ");
                String facultySpecialization=sc.nextLine();
                Faculty faculty=new Faculty(facultyName,facultySpecialization);
                department.addFaculty(faculty);
            }
            university.addDepartment(department);
        }
        university.displayUniversityInfo();
        university.deleteUniversity();
        university.displayUniversityInfo();
    }
}
