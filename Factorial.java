import java.util.*;
public class Factorial{
    public static long calculate(int num){
        if(num==0 || num==1){
            return 1;
        } 
        else{
            return num*calculate(num-1);
        }
    }
    public static void displayResult(String result){
        System.out.println(result);
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number ");
        int n=sc.nextInt();
        long result=calculate(n);
        displayResult("The factorial of "+n+" is "+result);
    }
}
