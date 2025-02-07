class Vehicle{
    int Maxspeed;
    String fueltype;
    Vehicle(int Maxspeed,String fueltype){
        this.Maxspeed=Maxspeed;
        this.fueltype=fueltype;
    }
    void displayInfo(){
        System.out.println(" ");
        System.out.println("Max speed is "+Maxspeed);
        System.out.println("Fuel type is "+fueltype);
    }
}
class Car extends Vehicle{
    int seatCapacity;
    Car(int Maxspeed,String fueltype,int seatCapacity){
        super(Maxspeed,fueltype);
        this.seatCapacity=seatCapacity;
    }
    @Override
    void displayInfo(){
        super.displayInfo();
        System.out.println("Seat Capacity is "+seatCapacity);
        System.out.println("Vehicle Type is Car");
    }
}
class Truck extends Vehicle{
    int seatCapacity;
    Truck(int Maxspeed,String fueltype,int seatCapacity){
        super(Maxspeed,fueltype);
        this.seatCapacity=seatCapacity;
    }
    @Override
    void displayInfo(){
        super.displayInfo();
        System.out.println("Seat Capacity is "+seatCapacity);
        System.out.println("Vehicle Type is Truck");
    }
}
class Motorcycle extends Vehicle{
    int seatCapacity;
    Motorcycle(int Maxspeed,String fueltype,int seatCapacity){
        super(Maxspeed,fueltype);
        this.seatCapacity=seatCapacity;
    }
    @Override
    void displayInfo(){
        super.displayInfo();
        System.out.println("Seat Capacity is "+seatCapacity);
        System.out.println("Vehicle Type is Motorcycle");
    }
}
public class TransportSystem{
    public static void main(String args[]){
        Vehicle car=new Car(120,"Petrol",5);
        Vehicle truck=new Truck(180,"Deisel",3);
        Vehicle motorcycle=new Motorcycle(100,"Petrol",2);
        car.displayInfo();
        truck.displayInfo();
        motorcycle.displayInfo();
    }
}