import java.util.*;
class Course{
    private String courseName;
    private Professor professor;
    private List<Student> enrolledStudents;
    public Course(String courseName){
        this.courseName=courseName;
        this.enrolledStudents=new ArrayList<>();
    }
    public String getCourseName(){
        return courseName;
    }
    public void assignProfessor(Professor professor){
        this.professor=professor;
    }
    public void enrollStudent(Student student){
        enrolledStudents.add(student);
    }
    public void displayCourseInfo(){
        System.out.println("Course "+courseName);
        if(professor!=null){
            System.out.println("Professor "+professor.getName());
        } 
        else{
            System.out.println("No professor assigned");
        }
        if(enrolledStudents.isEmpty()){
            System.out.println("No students enrolled");
        } 
        else{
            System.out.println("Enrolled Students");
            for(Student student:enrolledStudents){
                System.out.println("- "+student.getName());
            }
        }
    }
}
class Professor{
    private String name;
    public Professor(String name){
        this.name=name;
    }
    public String getName(){
        return name;
    }
    public void teachCourse(Course course){
        course.assignProfessor(this);
    }
}
class Student{
    private String name;
    private List<Course> enrolledCourses;
    public Student(String name){
        this.name=name;
        this.enrolledCourses=new ArrayList<>();
    }
    public String getName(){
        return name;
    }
    public void enrollCourse(Course course){
        enrolledCourses.add(course);
        course.enrollStudent(this);
    }
    public void displayStudentInfo(){
        System.out.println("Student "+name);
        if(enrolledCourses.isEmpty()){
            System.out.println("No courses enrolled");
        } 
        else{
            System.out.println("Enrolled Courses");
            for(Course course:enrolledCourses){
                System.out.println("- "+course.getCourseName());
            }
        }
    }
}
public class UniversityManagement{
    public static void main(String[] args){
        Course course1=new Course("Computer Science");
        Course course2=new Course("Mathematics");
        Professor professor1=new Professor("Dr. Ankur");
        Professor professor2=new Professor("Dr. Amit");
        course1.assignProfessor(professor1);
        course2.assignProfessor(professor2);
        Student student1=new Student("Abc");
        Student student2=new Student("Xyz");
        student1.enrollCourse(course1);
        student1.enrollCourse(course2);
        student2.enrollCourse(course2);
        System.out.println("\nUniversity Management System Summary");
        course1.displayCourseInfo();
        System.out.println();
        course2.displayCourseInfo();
        System.out.println();
        student1.displayStudentInfo();
        System.out.println();
        student2.displayStudentInfo();
    }
}
