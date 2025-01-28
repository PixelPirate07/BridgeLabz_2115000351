import java.util.*;
public class Leapyear{
    public void CheckLeapyear(int year){
        if(year>=1582 && year%4==0 && (year%100!=0 || year%400!=0)){
            System.out.println("Leap Year");
        }
        else{
            System.out.println("Not a Leap Year");
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Leapyear obj=new Leapyear();
        System.out.print("Enter year ");
        int y=sc.nextInt();
        obj.CheckLeapyear(y);
    }
}
