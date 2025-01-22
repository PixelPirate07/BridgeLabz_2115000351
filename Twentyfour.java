import java.util.*;
public class Twentyfour{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String name=sc.nextLine();
        String fromCity=sc.nextLine();
        String viaCity=sc.nextLine();
        String toCity=sc.nextLine();
        double distanceFromToVia=sc.nextDouble();
        int timeFromToVia=sc.nextInt();
        double distanceViaToFinalCity=sc.nextDouble();
        int timeViaToFinalCity=sc.nextInt();
        double totalDistance=distanceFromToVia+distanceViaToFinalCity;
        int totalTime=timeFromToVia+timeViaToFinalCity;
        System.out.println("The Total Distance travelled by "+name+" from "+fromCity+" to " +toCity+ " via "+viaCity+" is "+totalDistance+" km and "+"the Total Time taken is "+totalTime+" minutes");      
    }
}