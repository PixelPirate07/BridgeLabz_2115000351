import java.util.*;
class Course{
    static String instituteName="Default Institute";
    String courseName;
    int duration;
    double fee;
    public Course(String courseName,int duration,double fee){
        this.courseName=courseName;
        this.duration=duration;
        this.fee=fee;
    }
    public void displayCourseDetails() {
        System.out.println("Course Name is "+this.courseName);
        System.out.println("Duration is "+this.duration+" months");
        System.out.println("Fees is "+this.fee);
        System.out.println("Institute is "+instituteName);
    }
    public static void updateInstituteName(String newInstituteName){
        instituteName=newInstituteName;
        System.out.println("Institute Name has been updated to "+instituteName);
    }
}
public class Onlinecourse{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the course name");
        String courseName=sc.nextLine();
        System.out.print("Enter the course duration in months");
        int duration=sc.nextInt();
        System.out.print("Enter the course fees");
        double fee=sc.nextDouble();
        Course obj=new Course(courseName,duration,fee);
        obj.displayCourseDetails();
        sc.nextLine();
        System.out.print("\nEnter the new institute name ");
        String newInstituteName=sc.nextLine();
        Course.updateInstituteName(newInstituteName);
        System.out.println("\nUpdated Course Details are ");
        obj.displayCourseDetails();
    }
}
