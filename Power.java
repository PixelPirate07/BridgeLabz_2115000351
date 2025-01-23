import java.util.*;
public class Power{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter base");
        int b=sc.nextInt();
        System.out.println("Enter exponent");
        int e=sc.nextInt();
        int power=1;
        for(int i=1;i<=e;i++){
            power=power*b;
        }
        System.out.println(power);
    }
}
