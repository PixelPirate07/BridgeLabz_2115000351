import java.util.*;
public class Sum{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double t=0.0;
        while(true){
            System.out.print("Enter a number (0 to stop): ");
            double n=sc.nextDouble();
            if(n==0) break;
            t+=n;
        }
        System.out.println("The total sum is "+t);
    }
}