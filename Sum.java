import java.util.*;
public class Sum{
    public int Sumrecursion(int num){
        if(num==1){
            return 1;
        }
        return num+Sumrecursion(num-1);
    }
    public int WithFormula(int num){
        return (num*(num+1))/2;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Sum obj=new Sum();
        System.out.print("Enter a number ");
        int n=sc.nextInt();
        int r1=obj.Sumrecursion(n);
        int r2=obj.WithFormula(n);
        System.out.println("Sum with Formula is "+r2);
        System.out.println("Sum with Recursion is "+r1);
    }
}
