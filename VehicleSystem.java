class Vehicle{
    int maxSpeed;
    String model;
    Vehicle(int maxSpeed,String model){
        this.maxSpeed=maxSpeed;
        this.model=model;
    }
    void Info(){
        System.out.println("Max speed is "+maxSpeed);
        System.out.println("Model is "+model);
    }
}
interface Refuelable{
    void refuel();
}
class ElectricVehicle extends Vehicle{
    ElectricVehicle(int maxSpeed,String model){
        super(maxSpeed,model);
    }
    void charge(){
        super.Info();
        System.out.println("Charging");
    }
}
class PetrolVehicle extends Vehicle implements Refuelable{
    PetrolVehicle(int maxSpeed,String model){
        super(maxSpeed,model);
    }
    @Override
    public void refuel(){
        super.Info();
        System.out.println("Refueling");
    }
}
public class VehicleSystem{
    public static void main(String args[]){
        Vehicle obj=new ElectricVehicle(120,"Tata Electric");
        Vehicle obj1=new PetrolVehicle(180,"Hero");
        if(obj instanceof ElectricVehicle){
            ((ElectricVehicle)obj).charge();
        }
        if(obj1 instanceof PetrolVehicle){
            ((PetrolVehicle)obj1).refuel();
        }
    }
}