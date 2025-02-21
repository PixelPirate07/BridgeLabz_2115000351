import java.util.*;
public class UnCheckedException{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        try{
            System.out.print("Enter numerator ");
            int num=sc.nextInt();
            System.out.print("Enter denominator ");
            int den=sc.nextInt();
            int result=num/den;
            System.out.println("Result "+result);
        }catch(ArithmeticException e){
            System.out.println("Division by zero is not allowed");
        }catch(InputMismatchException e){
            System.out.println("Error enter a valid number");
        }
    }
}
