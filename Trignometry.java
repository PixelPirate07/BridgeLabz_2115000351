import java.util.*;
public class Trignometry{
    public double[] calculateFunction(double angle){
        double radian=Math.toRadians(angle);
        double sine=Math.sin(angle);
        double cosine=Math.cos(angle);
        double tangent=Math.tan(angle);
        return new double[]{sine,cosine,tangent};
    }
	public static void main(String[] args){
	    Scanner sc=new Scanner(System.in);
	    Trignometry obj=new Trignometry();
	    System.out.println("Enter angle ");
	    double angle=sc.nextDouble();
	    double[] result=obj.calculateFunction(angle);
	    System.out.println("Radian is "+result[0]);
	    System.out.println("Sine is "+result[1]);
	    System.out.println("Tan is "+result[2]);
	}
}
