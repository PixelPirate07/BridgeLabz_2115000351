import java.util.*;
class Circle{
    double radius;
    public Circle(double radius){
        this.radius=radius;
    }
    public void displayArea(){
        System.out.println("Area is "+(3.14*radius*radius));
    }
    public void displayCircumference(){
        System.out.println("Area is "+(3.14*radius*2));
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter radius ");
        int radius=sc.nextInt();
        Circle obj=new Circle(radius);
        obj.displayArea();
        obj.displayCircumference();
    }
}
