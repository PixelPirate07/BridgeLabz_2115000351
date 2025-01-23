import java.util.*;
public class Harshad{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n=sc.nextInt();
        int org=n;
        int s=0;
        while(n!=0){
            s+=n%10; 
            n/=10; 
        }
        if(org%s==0){
            System.out.println(org+" is a Harshad Number.");
        }else{
            System.out.println(org+" is Not a Harshad Number.");
        }
    }
}
