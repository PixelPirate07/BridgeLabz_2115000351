import java.util.*;
public class Unitconverter3{
    public static double FahrenheitToCelsius(double fahrenheit){
        return (fahrenheit-32)*5/9;
    }
    public static double CelsiusToFahrenheit(double celsius){
        return (celsius*9/5)+32;
    }
    public static double PoundsToKilograms(double pounds){
        return pounds*0.453592;
    }
    public static double KilogramsToPounds(double kilograms){
        return kilograms*2.20462;
    }
    public static double GallonsToLiters(double gallons){
        return gallons*3.78541;
    }
    public static double LitersToGallons(double liters){
        return liters*0.264172;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter fahrenheit ");
        double fahrenheit=sc.nextDouble();
        System.out.println("Enter celcius ");
        double celcius=sc.nextDouble();
        System.out.println("Enter pounds ");
        double pounds=sc.nextDouble();
        System.out.println("Enter kilograms ");
        double kilograms=sc.nextDouble();
        System.out.println("Enter gallons ");
        double gallons=sc.nextDouble();
        System.out.println("Enter liters ");
        double liters=sc.nextDouble();
        double r1=FahrenheitToCelsius(fahrenheit);
        double r2=CelsiusToFahrenheit(celcius);
        double r3=PoundsToKilograms(pounds);
        double r4=KilogramsToPounds(kilograms);
        double r5=GallonsToLiters(gallons);
        double r6=LitersToGallons(liters);
        System.out.println("fahrenheit to celcius is "+r1);
        System.out.println("celcius to fahrenheit is "+r2);
        System.out.println("pounds to kg is "+r3);
        System.out.println("kg to pounds is "+r4);
        System.out.println("gallons to liters is "+r5);
        System.out.println("liters to gallons is "+r6);
    }
}
