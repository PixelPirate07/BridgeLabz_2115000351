import java.util.*;
public class Odde{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int n=sc.nextInt();
        if(n>0){
            for(int i=1;i<=n;i++){
                if(i%2==0){
                    System.out.println(i+" is an even number.");
                }else{
                    System.out.println(i+" is an odd number.");
                }
            }
        }else{
            System.out.println("Please enter a positive integer");
        }
    }
}
