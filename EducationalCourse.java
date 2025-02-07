class Course{
    String courseName;
    int duration;
    Course(String courseName,int duration){
        this.courseName=courseName;
        this.duration=duration;
    }
    void display(){
        System.out.println("Course name is "+courseName);
        System.out.println("Duration is "+duration);
    }
}
class OnlineCourse extends Course{
    String platform;
    boolean isRecorded;
    OnlineCourse(String courseName,int duration,String platform,boolean isRecorded){
        super(courseName,duration);
        this.platform=platform;
        this.isRecorded=isRecorded;
    }
    @Override
    void display(){
        super.display();
        System.out.println("Platform is "+platform);
        System.out.println("isRecorded is "+isRecorded);
    }
}
class PaidOnlineCourse extends OnlineCourse{
    int fee;
    int discount;
    PaidOnlineCourse(String courseName,int duration,String platform,boolean isRecorded,int fee,int discount){
        super(courseName,duration,platform,isRecorded);
        this.fee=fee;
        this.discount=discount;
    }
    @Override
    void display(){
        super.display();
        System.out.println("Fee is "+fee);
        System.out.println("Discount is "+discount);
    }
}
public class EducationalCourse{
    public static void main(String args[]){
        Course obj=new OnlineCourse("Btech CS",4,"Mobile",true);
        OnlineCourse obj1=new PaidOnlineCourse("Btech IT",4,"Laptop",true,30000,10);
        System.out.println("Online Course details are ");
        obj.display();
        System.out.println();
        System.out.println("Paid Online Course details are ");
        obj1.display();
    }
}

