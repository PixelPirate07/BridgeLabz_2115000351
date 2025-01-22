import java.util.*;

public class Eight{
    public static void main(String[] args) {
        double km;
        Scanner input=new Scanner(System.in);
        km=input.nextDouble();
        double m=km/1.6;
        System.out.println("The total miles is "+m +" mile for the given "+km+ " km");
    }
}
