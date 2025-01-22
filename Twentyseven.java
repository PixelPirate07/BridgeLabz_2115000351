import java.util.*;
public class Twentyseven{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Principal"); 
		double p=sc.nextInt();
		System.out.println("Enter Rate");
		double r=sc.nextInt();
		System.out.println("Enter Time");
		double t=sc.nextInt();
		double si=(p*r*t)/100;
		System.out.println(" The Simple Interest is "+si+"for Principal "+p+", Rate of Interest"+r+"and Time "+t);
	}
}