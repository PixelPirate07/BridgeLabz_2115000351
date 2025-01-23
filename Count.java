import java.util.*;
public class Count{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the countdown start: ");
        int c=sc.nextInt();
        while(c>0) {
            System.out.println(c);
            c--;
        }
    }
}