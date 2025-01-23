import java.util.*;
public class Countnum{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int n= sc.nextInt();
        int c=0;
        while(n!=0){
            n/=10;  
            c++;  
        }
        if(c==0){
            c=1;
        }
        System.out.println("The number of digits is: "+c);
    }
}
