import java.util.*;
public class Twentyfive{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the length of side 1 (in meters): ");
        double s1=sc.nextDouble();
        System.out.print("Enter the length of side 2 (in meters): ");
        double s2=sc.nextDouble();
        System.out.print("Enter the length of side 3 (in meters): ");
        double s3=sc.nextDouble();
        double p=s1+s2+s3;
        double rd=5*1000;
        double r=rd/p;
        System.out.println("The total number of rounds the athlete will run is "+Math.ceil(r)+" to complete 5 km.");
    }
}
