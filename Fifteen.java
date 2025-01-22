import java.util.*;
public class Fifteen{
    public static void main(String[] args) {
        double up,tp;
        int q;
        Scanner sc=new Scanner(System.in);
        up=sc.nextDouble();
        q=sc.nextInt();
        tp=up*q;
        System.out.println("The total purchase price is INR "+tp+" if the quantity " +q+ " and unit price is INR "+up);
    }
}
