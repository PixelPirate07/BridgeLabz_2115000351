import java.util.*;
public class Eighteen{
    public static void main(String[] args) {
        int a,b,c;
        Scanner sc=new Scanner(System.in);
        a =sc.nextInt();
        b =sc.nextInt();
        c =sc.nextInt();
        int r1=a+b*c;
        int r2=a*b+c;
        int r3=c+a/b;
        int r4=a%b+c;
        System.out.println("The results of Int Operations are "+r1+", "+r2+", "+r3+", and "+r4);
    }
}
