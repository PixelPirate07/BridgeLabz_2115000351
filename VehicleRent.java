abstract class Vehicle{
    private String vehicleNumber;
    private String type;
    private double rentalRate;
    Vehicle(String vehicleNumber, String type, double rentalRate){
        this.vehicleNumber=vehicleNumber;
        this.type=type;
        this.rentalRate=rentalRate;
    }
    public String getVehicleNumber(){
        return vehicleNumber;
    }
    public void setVehicleNumber(String vehicleNumber){
        this.vehicleNumber=vehicleNumber;
    }
    public String getType(){
        return type;
    }
    public void setType(String type){
        this.type=type;
    }
    public double getRentalRate(){
        return rentalRate;
    }
    public void setRentalRate(double rentalRate){
        this.rentalRate=rentalRate;
    }
    public abstract double calculateRentalCost(int days);
    public void displayDetails(){
        System.out.println("Vehicle Number is "+vehicleNumber);
        System.out.println("Type is "+type);
        System.out.println("Rental Rate is "+rentalRate);
    }
}
interface Insurable{
    double calculateInsurance();
    String getInsuranceDetails();
}
class Car extends Vehicle implements Insurable{
    private String brand;
    Car(String vehicleNumber, double rentalRate,String brand){
        super(vehicleNumber,"Car",rentalRate);
        this.brand=brand;
    }
    @Override
    public double calculateRentalCost(int days){
        return getRentalRate()*days;
    }
    @Override
    public double calculateInsurance(){
        return getRentalRate()*0.1;
    }
    @Override
    public String getInsuranceDetails(){
        return "Insurance for Car is "+calculateInsurance();
    }
    @Override
    public void displayDetails(){
        super.displayDetails();
        System.out.println("Brand is "+brand);
        System.out.println(getInsuranceDetails());
    }
}
class Bike extends Vehicle implements Insurable{
    private String model;
    Bike(String vehicleNumber,double rentalRate,String model){
        super(vehicleNumber,"Bike",rentalRate);
        this.model=model;
    }
    @Override
    public double calculateRentalCost(int days){
        return getRentalRate()*days;
    }
    @Override
    public double calculateInsurance(){
        return getRentalRate()*0.05;
    }
    @Override
    public String getInsuranceDetails(){
        return "Insurance for Bike is "+calculateInsurance();
    }
    @Override
    public void displayDetails(){
        super.displayDetails();
        System.out.println("Model is "+model);
        System.out.println(getInsuranceDetails());
    }
}
class Truck extends Vehicle implements Insurable{
    private double loadCapacity;
    Truck(String vehicleNumber,double rentalRate,double loadCapacity){
        super(vehicleNumber,"Truck",rentalRate);
        this.loadCapacity=loadCapacity;
    }
    @Override
    public double calculateRentalCost(int days){
        return getRentalRate()*days;
    }
    @Override
    public double calculateInsurance() {
        return getRentalRate()*0.15;
    }
    @Override
    public String getInsuranceDetails(){
        return "Insurance for Truck is "+calculateInsurance();
    }
    @Override
    public void displayDetails(){
        super.displayDetails();
        System.out.println("Load Capacity is "+loadCapacity);
        System.out.println(getInsuranceDetails());
    }
}
public class VehicleRent{
    public static void main(String[] args){
        Vehicle car=new Car("UP85 1234",150000,"Tata");
        Vehicle bike=new Bike("UP85 GHTS",30000,"Hero");
        Vehicle truck=new Truck("UP85 789",2500,10);
        Vehicle[] vehicles={car,bike,truck};
        for (Vehicle vehicle:vehicles){
            vehicle.displayDetails();
            int rentalDays=5;
            double rentalCost=vehicle.calculateRentalCost(rentalDays);
            System.out.println("Rental Cost for "+rentalDays+" days is  "+rentalCost+"\n");
        }
    }
}
