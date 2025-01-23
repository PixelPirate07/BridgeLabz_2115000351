import java.util.*;
public class Factfor{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int n=sc.nextInt();
        if(n>=0){
            int f=1;
            for(int i=1;i<=n;i++) {
                f*=i;
            }
            System.out.println("The factorial is "+f);
        } else {
            System.out.println("Please enter a positive integer");
        }
    }
}
