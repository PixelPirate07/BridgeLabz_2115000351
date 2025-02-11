class Student{
    int rollnumber;
    String name;
    int age;
    String grade;
    Student next;
    Student(int rollnumber,String name,int age,String grade){
        this.rollnumber=rollnumber;
        this.name=name;
        this.age=age;
        this.grade=grade;
        this.next=null;
    }
}
class Studentlist{
    Student head;
    public Studentlist(){
        head=null;
    }
    public void addatStart(int rollnumber,String name,int age,String grade){
        Student newstudent=new Student(rollnumber,name,age,grade);
        newstudent.next=head;
        head=newstudent;
    }
    public void addatEnd(int rollnumber,String name,int age,String grade){
        Student newstudent=new Student(rollnumber,name,age,grade);
        if(head==null){
            head=newstudent;
            return;
        }
        Student temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=newstudent;
    }
    public void addatPosition(int rollnumber,String name,int age,String grade,int position){
        Student newstudent=new Student(rollnumber,name,age,grade);
        if(position==1){
            newstudent.next=head;
            head=newstudent;
            return;
        }
        Student temp=head;
        int count=1;
        while(temp.next!=null && count<position-1){
            temp=temp.next;
            count++;
        }
        if(temp.next!=null){
            newstudent.next=temp.next;
            temp.next=newstudent;
        }
        else{
            System.out.println("Position out of range");
        }
    }
    public void deletestudentbyRollnumber(int rollnumber){
        if(head==null){
            System.out.println("List is empty");
            return;
        }
        if(head.rollnumber==rollnumber){
            head=head.next;
            return;
        }
        Student temp=head;
        while(temp.next!=null && temp.next.rollnumber!=rollnumber){
            temp=temp.next;
        }
        if(temp.next==null){
            System.out.println("Student not found");
        } 
        else{
            temp.next=temp.next.next;
        }
    }
    public Student searchStudent(int rollnumber){
        Student temp=head;
        while(temp!=null){
            if(temp.rollnumber==rollnumber){
                return temp;
            }
            temp=temp.next;
        }
        return null;
    }
    public void updateStudentgrade(int rollnumber,String newgrade){
        Student updategrade=searchStudent(rollnumber);
        if(updategrade!=null){
            updategrade.grade=newgrade;
            System.out.println("Updated success");
        }
        else{
            System.out.println("Student not found");
        }
    }
    public void displayDetails(){
        if(head==null){
            System.out.println("No data");
        }
        else{
            Student temp=head;
            while(temp!=null){
                System.out.println("Roll Number is "+temp.rollnumber+", Name is "+temp.name+", Age is "+temp.age+", Grade is "+temp.grade);
                temp=temp.next;
            }
        }
    }
}
public class StudentRecord{
    public static void main(String args[]){
        Studentlist studentList=new Studentlist();
        studentList.addatEnd(1,"James",20,"A");
        studentList.addatEnd(2,"Arthur",21,"B");
        studentList.addatEnd(3,"Walt",22,"C");
        System.out.println("All Student Records:");
        studentList.displayDetails();
        studentList.addatStart(0,"Jon",19,"A");
        System.out.println("\nAll Student Records After Adding Jon:");
        studentList.displayDetails();
        studentList.addatPosition(4,"Will",23,"B",2);
        System.out.println("\nAll Student Records After Adding Will at Position 2:");
        studentList.displayDetails();
        studentList.updateStudentgrade(3,"B+");
        System.out.println("\nAll Student Records After Grade Update:");
        studentList.displayDetails();
        Student student=studentList.searchStudent(2);
        if(student!=null){
            System.out.println("\nStudent Found Roll Number is "+student.rollnumber+", Name is "+student.name+", Age is "+student.age+", Grade is "+student.grade);
        } 
        else{
            System.out.println("Student not found");
        }
        studentList.deletestudentbyRollnumber(2);
        System.out.println("\nAll Student Records After Deleting Student with Roll Number 2:");
        studentList.displayDetails();
    }
}
