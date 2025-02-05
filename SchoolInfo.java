import java.util.*;
class Course{
    private String courseName;
    private List<Student> enrolledStudents;
    public Course(String courseName){
        this.courseName=courseName;
        this.enrolledStudents=new ArrayList<>();
    }
    public String getCourseName(){
        return courseName;
    }
    public void enrollStudent(Student student){
        if(!enrolledStudents.contains(student)){
            enrolledStudents.add(student);
            student.enrollInCourse(this);
        }
    }
    public void displayCourseInfo(){
        System.out.println("Course "+courseName);
        if (enrolledStudents.isEmpty()){
            System.out.println("No students enrolled in this course");
        } 
        else{
            System.out.println("Enrolled Students");
            for(Student student:enrolledStudents){
                System.out.println(student.getStudentName());
            }
        }
    }
}
class Student{
    private String studentName;
    private List<Course> enrolledCourses;
    public Student(String studentName){
        this.studentName=studentName;
        this.enrolledCourses=new ArrayList<>();
    }
    public String getStudentName(){
        return studentName;
    }
    public void enrollInCourse(Course course){
        if(!enrolledCourses.contains(course)){
            enrolledCourses.add(course);
        }
    }
    public void viewCourses(){
        System.out.println("Student "+studentName);
        if (enrolledCourses.isEmpty()){
            System.out.println("Not enrolled in any courses");
        } 
        else{
            System.out.println("Enrolled Courses");
            for (Course course:enrolledCourses){
                System.out.println(course.getCourseName());
            }
        }
    }
}
class School{
    private String schoolName;
    private List<Student> students;
    public School(String schoolName) {
        this.schoolName = schoolName;
        this.students = new ArrayList<>();
    }
    public void addStudent(Student student){
        students.add(student);
    }
    public void displaySchoolInfo(){
        System.out.println("School is "+schoolName);
        if(students.isEmpty()){
            System.out.println("No students enrolled in the school");
        } 
        else{
            for(Student student:students){
                student.viewCourses();
            }
        }
    }
}
public class SchoolInfo{
    public static void main(String[] args){
        School school=new School("Example School");
        Student student1=new Student("Xyz");
        Student student2=new Student("Abc");
        Course course1=new Course("Mathematics");
        Course course2=new Course("Science");
        Course course3=new Course("History");
        course1.enrollStudent(student1);
        course2.enrollStudent(student1);
        course2.enrollStudent(student2);
        course3.enrollStudent(student2);
        school.addStudent(student1);
        school.addStudent(student2);
        school.displaySchoolInfo();
        course1.displayCourseInfo();
        course2.displayCourseInfo();
        course3.displayCourseInfo();
    }
}
