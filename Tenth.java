import java.util.*;
public class Tenth{
    public static void main(String[] args) {
        double cm,feet,inches;
        Scanner sc=new Scanner(System.in);
        cm=sc.nextDouble();
        inches=cm/2.54;
        feet=inches/12;
        inches=inches%12;
        System.out.println("Your Height in cm is " + cm + " while in feet is " +(int) feet+" and inches is "+(int) inches);
    }
}
