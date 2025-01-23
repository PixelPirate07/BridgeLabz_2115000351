import java.util.*;
public class Leap{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a year (>= 1582): ");
        int y=sc.nextInt();
        if(y<1582){
            System.out.println("The year must be 1582 or later to use the Gregorian calendar.");
        }
		else{
            if(y%4==0){
                if(y%100==0){
                    if(y%400 == 0){
                        System.out.println("The year "+y+" is a Leap Year.");
                    }else{
                        System.out.println("The year "+y+" is not a Leap Year.");
                    }
                } else{
                    System.out.println("The year "+y+" is a Leap Year.");
                }
            } else{
                System.out.println("The year "+y+" is not a Leap Year.");
            }
        }
    }
}
