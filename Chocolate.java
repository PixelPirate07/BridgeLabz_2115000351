import java.util.*;
public class Chocolate{
    public int[] findchocolate(int n,int m){
        int quotient=n/m;
        int remainder=n%m;
        return new int[]{quotient,remainder};
    }
	public static void main(String[] args){
	    Scanner sc=new Scanner(System.in);
	    Chocolate obj=new Chocolate();
	    System.out.println("Enter number of chocolates ");
	    int n=sc.nextInt();
	    System.out.println("Enter number of children ");
	    int m=sc.nextInt();
	    int[] result=obj.findchocolate(n,m);
	    System.out.println("Each child will get "+result[0]);
	    System.out.println("Remaining is "+result[1]);
	}
}
