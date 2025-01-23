import java.util.*;
public class Multiple{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number");
        int n=sc.nextInt();
        for(int i=100;i>=1;i--){
            if(n%i==0){
                System.out.println(i);
                continue;
            }
        }
    }
}
