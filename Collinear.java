import java.util.*;
public class Collinear{
    public static boolean areCollinearUsingSlope(double x1, double y1, double x2, double y2, double x3, double y3) {
        double slopeAB=(y2-y1)/(x2-x1);
        double slopeBC=(y3-y2)/(x3-x2);
        double slopeAC=(y3-y1)/(x3-x1);
        return slopeAB==slopeBC && slopeBC==slopeAC;
    }
    public static boolean areCollinearUsingArea(double x1, double y1, double x2, double y2, double x3, double y3) {
        double area=0.5*(x1*(y2-y3)+x2*(y3-y1)+x3*(y1-y2));
        return area==0.0;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter values ");
        double x1=sc.nextDouble();
        double y1=sc.nextDouble();
        double x2=sc.nextDouble();
        double y2=sc.nextDouble();
        double x3=sc.nextDouble();
        double y3=sc.nextDouble();
        System.out.println("Using Slope Formula ");
        if (areCollinearUsingSlope(x1, y1, x2, y2, x3, y3)) {
            System.out.println("The points are collinear ");
        } 
        else {
            System.out.println("The points are not collinear ");
        }
        System.out.println("Using Area of Triangle Formula ");
        if(areCollinearUsingArea(x1, y1, x2, y2, x3, y3)) {
            System.out.println("The points are collinear ");
        } 
        else {
            System.out.println("The points are not collinear ");
        }
    }
}
