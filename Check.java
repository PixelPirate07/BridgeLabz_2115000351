import java.util.*;
public class Check{
    public int Checknumber(int n){
        if(n>0){
            return 1;
        }
        if(n<0){
            return -1;
        }
        else{
            return 0;
        }
    }
	public static void main(String[] args){
	    Scanner sc=new Scanner(System.in);
	    Check obj=new Check();
	    System.out.println("Enter number");
	    int num=sc.nextInt();
	    int result=obj.Checknumber(num);
	    System.out.println("Number is "+result);
	}
}
