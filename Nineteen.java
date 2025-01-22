import java.util.*;
public class Nineteen{
    public static void main(String[] args) {
        double a,b,c;
        Scanner sc=new Scanner(System.in);
        a =sc.nextDouble();
        b =sc.nextDouble();
        c =sc.nextDouble();
        double r1=a+b*c;
        double r2=a*b+c;
        double r3=c+a/b;
        double r4=a%b+c;
        System.out.println("The results of Double Operations are "+r1+", "+r2+", "+r3+", and "+r4);
    }
}
