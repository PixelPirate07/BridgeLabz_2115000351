import java.util.*;
public class Sumofnum{
    public int Sum(int num){
        int s=0;
        for(int i=1;i<=num;i++){
            s=s+i;
        }
        return s;
    }
	public static void main(String[] args){
	    Scanner sc=new Scanner(System.in);
	    Sumofnum obj=new Sumofnum();
	    System.out.println("Enter number");
	    int n=sc.nextInt();
	    int result=obj.Sum(n);
	    System.out.println("Sum is "+result);
	}
}
