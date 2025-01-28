import java.util.*;
public class Unitconverter2{
    public static double Yardstofeet(double yards){
        double yards2feet=3;
        return yards*yards2feet;
    }
    public static double Feettoyards(double feet){
        double feet2yards=0.333333;
        return feet*feet2yards;
    }
    public static double Meterstoinches(double meters){
        double meters2inches=39.3701;
        return meters*meters2inches;
    }
    public static double Inchestometers(double inches){
        double inches2meters=0.0254;
        return inches*inches2meters;
    }
    public static double Inchestocm(double inches){
        double inches2cm=2.54;
        return inches*inches2cm;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter yards ");
        double yards=sc.nextDouble();
        System.out.println("Enter feet ");
        double feet=sc.nextDouble();
        System.out.println("Enter meters ");
        double meters=sc.nextDouble();
        System.out.println("Enter inches ");
        double inches=sc.nextDouble();
        double r1=Yardstofeet(yards);
        double r2=Feettoyards(feet);
        double r3=Meterstoinches(meters);
        double r4=Inchestometers(inches);
        double r5=Inchestocm(inches);
        System.out.println("yards to feet is "+r1);
        System.out.println("feet to yards is "+r2);
        System.out.println("meters to inches is "+r3);
        System.out.println("meters to inches is "+r4);
        System.out.println("inches to centimeters is "+r5);
    }
}
