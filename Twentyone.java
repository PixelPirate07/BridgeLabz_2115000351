import java.util.*;
public class Twentyone{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter temperature in Fahrenheit: ");
        double f=sc.nextDouble();
        double c=(f-32)*5/9;
        System.out.println("The "+f+"is "+c+"Celcius");
        sc.close();
    }
}