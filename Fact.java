import java.util.*;
public class Fact{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int n=sc.nextInt();
        if(n>=0){
            int f=1;
            int i=1;
            while(i<=n){
                f*=i;
                i++;
            }
            System.out.println("The factorial is "+f);
        } else {
            System.out.println("Please enter a positive integer.");
        }
    }
}
