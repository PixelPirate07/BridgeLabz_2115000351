import java.util.*;
public class Countfor{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the countdown start: ");
        int c=sc.nextInt();
        for (int i=c;i>0;i--) {
            System.out.println(i);
        }
    }
}