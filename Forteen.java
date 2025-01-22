import java.util.*;
public class Forteen{
    public static void main(String[] args) {
        double dif;
        Scanner sc=new Scanner(System.in);
        dif=sc.nextDouble();
        double diy=dif/3;
        double dim=diy/1760;        
        System.out.println("The distance in yards is "+diy+" and in miles is "+dim);
    }
}
