import java.util.*;
public class Twentysix{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the total number of chocolates: ");
        int noc=sc.nextInt();
        System.out.print("Enter the total number of children: ");
        int noch=sc.nextInt();     
        int cpc=noc/noch;
        int rc=noc%noch;
        System.out.println("The number of chocolates each child gets is "+cpc+" and the number of remaining chocolates are "+rc+ ".");
    }
}
