import java.util.*;
public class FindQuotandRem{
    public int[] findQuotientAndRemainder(int number1,int number2){
        int quotient=number1/number2;
        int remainder=number1%number2;
        return new int[]{quotient,remainder};
    }
	public static void main(String[] args){
	    Scanner sc=new Scanner(System.in);
	    FindQuotandRem obj=new  FindQuotandRem();
	    System.out.println("Enter number 1 ");
	    int n1=sc.nextInt();
	    System.out.println("Enter number 2 ");
	    int n2=sc.nextInt();
	    int[] result=obj.findQuotientAndRemainder(n1,n2);
	    System.out.println("Quotient is "+result[0]);
	    System.out.println("Remainder is "+result[1]);
	}
}
