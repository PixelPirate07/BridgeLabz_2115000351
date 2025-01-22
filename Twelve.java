import java.util.*;
public class Twelve{
    public static void main(String[] args) {
        double b,h;
        Scanner sc=new Scanner(System.in);
        b=sc.nextDouble();
        h=sc.nextDouble();
        double ai=0.5*b*h;
        double ac=ai*6.4516;
        System.out.println("The area of the triangle is "+ai+" square inches and "+ac+" square centimeters.");
    }
}
