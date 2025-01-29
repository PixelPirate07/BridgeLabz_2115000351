import java.util.*;
public class Calc{
    public static double add(double n1,double n2){
        return n1+n2;
    }
    public static double subtract(double n1,double n2){
        return n1-n2;
    }
    public static double multiply(double n1,double n2){
        return n1*n2;
    }
    public static double divide(double n1,double n2){
        return n1/n2;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 1 to Add");
        System.out.println("Enter 2 to Subtract");
        System.out.println("Enter 3 to Multiply");
        System.out.println("Enter 4 to Divide");
        int choice=sc.nextInt();
        System.out.print("Enter number ");
        double n1=sc.nextDouble();
        System.out.print("Enter number ");
        double n2=sc.nextDouble();
        switch (choice){
            case 1:
                System.out.println("Result is "+add(n1,n2));
                break;
            case 2:
                System.out.println("Result is "+subtract(n1,n2));
                break;
            case 3:
                System.out.println("Result is "+multiply(n1,n2));
                break;
            case 4:
                if(n2!=0){
                    System.out.println("Result is "+divide(n1,n2));
                } 
                else{
                    System.out.println("Division by zero is not allowed");
                }
                break;
            default:
                System.out.println("Invalid choice");
                break;
        }
    }
}
