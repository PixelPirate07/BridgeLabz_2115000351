import java.util.*;
class Vehicle{
    static double registrationFee=500;
    String ownerName;
    String vehicleType;
    public Vehicle(String ownerName,String vehicleType){
        this.ownerName=ownerName;
        this.vehicleType=vehicleType;
    }
    public void displayVehicleDetails(){
        System.out.println("Owner Name is "+this.ownerName);
        System.out.println("Vehicle Type is "+this.vehicleType);
        System.out.println("Registration Fee is"+registrationFee);
    }
    public static void updateRegistrationFee(double newFee){
        registrationFee=newFee;
        System.out.println("Registration Fee has been updated to "+registrationFee);
    }
}
public class VehicleRegistration{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the owner's name ");
        String ownerName=sc.nextLine();
        System.out.print("Enter the vehicle type ");
        String vehicleType=sc.nextLine();
        Vehicle obj=new Vehicle(ownerName,vehicleType);
        obj.displayVehicleDetails();
        System.out.print("\nEnter the new registration fee ");
        double newFee=sc.nextDouble();
        Vehicle.updateRegistrationFee(newFee);
        System.out.println("\nUpdated Vehicle Details are");
        obj.displayVehicleDetails();
    }
}
