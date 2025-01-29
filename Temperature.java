import java.util.*;
public class Temperature{
    public static double calculateFahrenheittoCelcius(double fahrenheit){
        return (fahrenheit-32)*5/9;
    }
    public static double calculateCelciustoFahrenheit(double celcius){
        return (celcius*9/5)+32;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter in fahrenheit ");
        double f=sc.nextDouble();
        System.out.print("Enter in celcius ");
        double c=sc.nextDouble();
        double incelcius=calculateFahrenheittoCelcius(f);
        double infahrenheit=calculateCelciustoFahrenheit(c);
        System.out.println("The temperature of "+f+" in Celcius is "+incelcius);
        System.out.println("The tempertaure of "+c+" in Fahrenheit is "+infahrenheit);
    }
}
