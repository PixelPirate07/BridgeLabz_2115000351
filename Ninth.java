import java.util.*;

public class Ninth{
    public static void main(String[] args) {
        double f,dp,d,ff;
        Scanner sc=new Scanner(System.in);
        f=sc.nextDouble();
        dp=sc.nextDouble();
        d=(f*dp)/100;
        ff=f-d;
        System.out.println("The discount amount is INR "+d+ " and final discounted fee is INR "+ff);
    }
}
