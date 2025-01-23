import java.util.*;
public class Sumu{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n=sc.nextInt();
        if(n>0){
            int s=0;
            int i=1;
            while(i<=n){
                s+=i;
                i++;
            }
            int fs=n*(n+1)/2;
            System.out.println("Sum using loop: "+s);
            System.out.println("Sum using formula: "+fs);
        } else{
            System.out.println("Not a natural number");
        }
    }
}