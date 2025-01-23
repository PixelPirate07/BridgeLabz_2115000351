import java.util.*;
public class Bonus{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the salary of the employee: ");
        double sal=sc.nextDouble();
        System.out.print("Enter the number of years of service: ");
        int yos=sc.nextInt();
        if(yos>5){
            double b=sal*0.05;
            System.out.println("The bonus amount is: INR "+b);
        }else{
            System.out.println("The employee is not eligible for a bonus");
        }
    }
}
