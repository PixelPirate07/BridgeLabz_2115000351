import java.util.*;
public class Calculator{
    public static double calculateDistance(double x1,double y1,double x2,double y2) {
        return Math.sqrt(Math.pow(x2-x1,2)+Math.pow(y2-y1,2));
    }
    public static double[] findLineEquation(double x1,double y1,double x2,double y2) {
        double m=(y2-y1)/(x2-x1); 
        double b=y1-m*x1;         
        return new double[]{m,b};
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter x1 ");
        double x1=sc.nextDouble();
        System.out.print("Enter y1 ");
        double y1=sc.nextDouble();
        System.out.print("Enter x2 ");
        double x2=sc.nextDouble();
        System.out.print("Enter y2 ");
        double y2=sc.nextDouble();
        double distance=calculateDistance(x1,y1,x2,y2);
        System.out.printf("Euclidean Distance: %.2f\n",distance);
        if(x1!=x2){
            double[] lineEquation=findLineEquation(x1,y1, x2, y2);
            System.out.printf("Equation of the line: y = %.2fx + %.2f\n",lineEquation[0],lineEquation[1]);
        }
        else{
            System.out.println("The points form a vertical line, equation: x = "+x1);
        }
    }
}
