import java.util.*;
public class Seventeen{
    public static void main(String[] args) {
        int n1,n2;
        Scanner sc=new Scanner(System.in);
        n1=sc.nextInt();
        n2=sc.nextInt();
        int q=n1/n2;
        int r=n1%n2;
        System.out.println("The Quotient is "+q+" and Reminder is "+r+" of two numbers "+n1+" and "+n2);
    }
}
