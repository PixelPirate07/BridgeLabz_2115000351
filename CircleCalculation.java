import java.util.*;
class Circle{
    private double radius;
    public Circle(){
        this(1);
    }
    public double getRadius(){
        return radius;
    }
    public Circle(double radius){
        this.radius=radius;
    }
    public double getArea(){
        return 3.14*radius*radius;
    }
}    
public class CircleCalculation{    
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter radius");
        double radius=sc.nextDouble();
        Circle obj=new Circle();
        System.out.println("default radius of circle is "+obj.getRadius());
        System.out.println("default Area of circle is "+obj.getArea());
        Circle obj1=new Circle(radius);
        System.out.println("User Input radius is "+obj1.getRadius());
        System.out.println("User Input Area is "+obj1.getArea());
    }
}
