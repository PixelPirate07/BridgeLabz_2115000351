import java.util.*;
public class Interest{
    public double CalculateSI(double principal,double rate,double time){
        return (principal*rate*time)/100;
    }
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    Interest obj=new Interest();
	    System.out.println("Enter Principal");
	    double p=sc.nextDouble();
	    System.out.println("Enter Rate");
	    double r=sc.nextDouble();
	    System.out.println("Enter Time");
	    double t=sc.nextDouble();
	    double si=obj.CalculateSI(p,r,t);
	    System.out.println("The Simple Interest is "+si+"  for Principal "+p+" , Rate of Interest "+r+"  and Time "+t);
	}
}