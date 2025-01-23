import java.util.*;
public class ArmstrongNumber{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n=sc.nextInt();
        int s=0,org,r;
        org=n;
        while(n!=0){
            r=n%10;  
            s+=Math.pow(r,3);  
            n/=10; 
        }
        if(sum==org){
            System.out.println(org+" is an Armstrong number.");
        }else{
            System.out.println(org+" is not an Armstrong number.");
        }
    }
}
