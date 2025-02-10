abstract class Vehicle{
    private String vehicleId;
    private String driverName;
    private double ratePerKm;
    Vehicle(String vehicleId,String driverName,double ratePerKm){
        this.vehicleId=vehicleId;
        this.driverName=driverName;
        this.ratePerKm=ratePerKm;
    }
    public String getVehicleId(){
        return vehicleId;
    }
    public void setVehicleId(String vehicleId){
        this.vehicleId=vehicleId;
    }
    public String getDriverName(){
        return driverName;
    }
    public void setDriverName(String driverName){
        this.driverName=driverName;
    }
    public double getRatePerKm(){
        return ratePerKm;
    }
    public void setRatePerKm(double ratePerKm){
        this.ratePerKm=ratePerKm;
    }
    public abstract double calculateFare(double distance);
    public void getVehicleDetails() {
        System.out.println("Vehicle ID is "+vehicleId);
        System.out.println("Driver Name is "+driverName);
        System.out.println("Rate per Km is "+ratePerKm);
    }
}
interface GPS{
    String getCurrentLocation();
    void updateLocation(String newLocation);
}
class Car extends Vehicle implements GPS{
    private String model;
    Car(String vehicleId,String driverName,double ratePerKm,String model){
        super(vehicleId,driverName,ratePerKm);
        this.model=model;
    }
    @Override
    public double calculateFare(double distance){
        return getRatePerKm()*distance;
    }
    @Override
    public String getCurrentLocation() {
        return "Current Location of Car is ";
    }
    @Override
    public void updateLocation(String newLocation){
        System.out.println("Car location updated to "+newLocation);
    }
    @Override
    public void getVehicleDetails(){
        super.getVehicleDetails();
        System.out.println("Car Model is "+model);
    }
}
class Bike extends Vehicle implements GPS{
    private String type;
    Bike(String vehicleId,String driverName,double ratePerKm,String type){
        super(vehicleId,driverName,ratePerKm);
        this.type=type;
    }
    @Override
    public double calculateFare(double distance){
        return getRatePerKm()*distance;
    }
    @Override
    public String getCurrentLocation(){
        return "Current Location of Bike is ";
    }
    @Override
    public void updateLocation(String newLocation){
        System.out.println("Bike location updated to "+newLocation);
    }
    @Override
    public void getVehicleDetails(){
        super.getVehicleDetails();
        System.out.println("Bike Type is "+type);
    }
}
class Auto extends Vehicle implements GPS{
    private int seatingCapacity;
    Auto(String vehicleId,String driverName,double ratePerKm,int seatingCapacity){
        super(vehicleId,driverName,ratePerKm);
        this.seatingCapacity=seatingCapacity;
    }
    @Override
    public double calculateFare(double distance){
        return getRatePerKm()*distance;
    }
    @Override
    public String getCurrentLocation(){
        return "Current Location of Auto is ";
    }
    @Override
    public void updateLocation(String newLocation){
        System.out.println("Auto location updated to "+newLocation);
    }
    @Override
    public void getVehicleDetails(){
        super.getVehicleDetails();
        System.out.println("Auto Seating Capacity is "+seatingCapacity);
    }
}
public class RideHailing{
    public static void main(String[] args){
        Vehicle car=new Car("1","James",10,"Suzuki");
        Vehicle bike=new Bike("2","Harry", 5,"Sport");
        Vehicle auto=new Auto("3","Steve",7,6);
        Vehicle[] vehicles={car,bike,auto};
        double distance=20;
        for(Vehicle vehicle:vehicles){
            vehicle.getVehicleDetails();
            double fare=vehicle.calculateFare(distance);
            System.out.println("Fare for "+distance+" km is "+fare+"\n");
            if(vehicle instanceof GPS){
                GPS gps=(GPS)vehicle;
                System.out.println(gps.getCurrentLocation());
                gps.updateLocation("New Location");
                System.out.println();
            }
        }
    }
}
