import java.util.*;
public class Natural{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n=sc.nextInt();
        if(n>0){
            int s=n*(n+1)/2;
            System.out.println("The sum of "+n+ " natural numbers is "+s);
        }else{
            System.out.println("The number "+n+ " is not a natural number");
        }
    }
}
