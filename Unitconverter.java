import java.util.*;
public class Unitconverter{
    public static double convertKmToMiles(double km) {
        double kmtomiles=0.621371;
        return km*kmtomiles;
    }
    public static double convertMilesToKm(double miles) {
        double milestokm=1.60934;
        return miles*milestokm;
    }
    public static double convertMetersToFeet(double meters) {
        double meterstofeet=3.28084;
        return meters*meterstofeet;
    }
    public static double convertFeetToMeters(double feet){
        double feettometers=0.3048;
        return feet*feettometers;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter km ");
        double km=sc.nextDouble();
        System.out.println("Enter miles ");
        double miles=sc.nextDouble();
        System.out.println("Enter meters ");
        double meters=sc.nextDouble();
        System.out.println("Enter feet ");
        double feet=sc.nextDouble();
        double r1=convertKmToMiles(km);
        double r2=convertMilesToKm(miles);
        double r3=convertMetersToFeet(meters);
        double r4=convertFeetToMeters(feet);
        System.out.println("Km to miles is "+r1);
        System.out.println("miles to km is "+r2);
        System.out.println("meters to feet is "+r3);
        System.out.println("feet to meters is "+r4);
        
    }
}
