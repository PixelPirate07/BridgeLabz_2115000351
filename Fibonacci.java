import java.util.*;
public class Fibonacci{
    public static void Fibonacci(int num){
        System.out.println("Numbers are ");
        int a=0;
        int b=1;
        System.out.print(a+" ");
        System.out.print(b+" ");
        for(int i=2;i<num;i++){
            int c=a+b;
            System.out.print(c+" ");
            a=b;
            b=c;
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number ");
        int n=sc.nextInt();
        Fibonacci(n);
    }
}
