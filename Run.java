import java.util.*;
public class Run{
    public double Rounds(double side1,double side2,double side3){
        double perimeter=side1+side2+side3;
        return 5000/perimeter;
    }
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    Run obj=new Run();
	    System.out.println("Enter side1");
	    double s1=sc.nextDouble();
	    System.out.println("Enter side2");
	    double s2=sc.nextDouble();
	    System.out.println("Enter side3");
	    double s3=sc.nextDouble();
	    double round=obj.Rounds(s1,s2,s3);
	    System.out.println("No. of rounds are "+(int)round);
	}
}
