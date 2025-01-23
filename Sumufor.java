import java.util.*;
public class Sumufor{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n=sc.nextInt();
        if(n>0){
            int sumf=n*(n+1)/2;
            int suml=0;
            for(int i=1;i<=n;i++) {
                suml+=i;
            }
            System.out.println("The sum of "+n+" natural numbers using formula is "+sumf);
            System.out.println("The sum of "+n+" natural numbers using for loop is "+suml);
            if(sumf==suml){
                System.out.println("Both computations give the same result.");
            }
        }else{
            System.out.println("The number "+n+" is not a natural");
		}
	}
}	
