import java.util.*;
abstract class CourseType{
    abstract void evaluate();
}
class ExamCourse extends CourseType{
    @Override
    void evaluate(){
        System.out.println("This is evaluating by Exam");
    }
} 
class AssignmentCourse extends CourseType{
    @Override
    void evaluate(){
        System.out.println("This is evaluating by Assignments");
    }
} 
class ResearchCourse extends CourseType{
    @Override
    void evaluate(){
        System.out.println("This is evaluating by Research");
    }
} 
class Course<T extends CourseType>{
    private String courseName;
    private T courseType;
    Course(String courseName,T courseType){
        this.courseName=courseName;
        this.courseType=courseType;
    }
    public void displayCourseInfo(){
        System.out.println("Course Name is "+courseName);
        courseType.evaluate();
    }
    public T getCourseType(){
        return courseType;
    }
}
public class UniversityCourse{
    public static void main(String args[]){
        Course<ExamCourse> examCourse=new Course<>("Math",new ExamCourse());
        Course<AssignmentCourse> assignmentCourse=new Course<>("English Assignment",new AssignmentCourse());
        Course<ResearchCourse> researchCourse=new Course<>("AI Research",new ResearchCourse());
        examCourse.displayCourseInfo();
        assignmentCourse.displayCourseInfo();
        researchCourse.displayCourseInfo();
        List<CourseType> courses=new ArrayList<>();
        courses.add(examCourse.getCourseType());
        courses.add(assignmentCourse.getCourseType());
        courses.add(researchCourse.getCourseType());
        for(CourseType course:courses){
            course.evaluate();
        }    
    }
}