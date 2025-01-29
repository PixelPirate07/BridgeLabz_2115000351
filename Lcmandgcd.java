import java.util.*;
public class Lcmandgcd{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number ");
        int n1=sc.nextInt();
        System.out.print("Enter number ");
        int n2=sc.nextInt();
        int gcd=calculateGCD(n1,n2);
        int lcm=calculateLCM(n1,n2,gcd);
        System.out.println("The GCD of "+n1+" and "+n2+" is "+gcd);
        System.out.println("The LCM of "+n1+" and "+n2+" is "+lcm);
    }
    public static int calculateGCD(int n1,int n2){
        while(n2!=0){
            int temp=n2;
            n2=n1%n2;
            n1=temp;
        }
        return n1;
    }
    public static int calculateLCM(int n1,int n2,int gcd){
        return (n1*n2)/gcd;
    }
}
