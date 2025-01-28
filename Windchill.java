import java.util.*;
public class Windchill{
    public double calculateWindChill(double temperature,double windspeed){
        double windChill=35.74+(0.6215*temperature)+(0.4275*temperature-35.75)*Math.pow(windspeed,0.16);
        return  windChill;
    }
	public static void main(String[] args){
	    Scanner sc=new Scanner(System.in);
	    Windchill obj=new Main();
	    System.out.println("Enter temperature ");
	    double temp=sc.nextDouble();
	    System.out.println("Enter windspeed ");
	    double wind=sc.nextDouble();
	    double result=obj.calculateWindChill(temp,wind);
	    System.out.println("Wind Chill is "+result);
	}
}
