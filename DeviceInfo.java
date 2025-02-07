class Device{
    String status;
    int deviceID;
    Device(int deviceID,String status){
        this.deviceID=deviceID;
        this.status=status;
    }
    void displayStatus(){
        System.out.println("Device ID is "+deviceID);
        System.out.println("Status is "+status);
    }
}
class Thermostat extends Device{
    double tempsetting;
    Thermostat(int deviceID,String status,double tempsetting){
        super(deviceID,status);
        this.tempsetting=tempsetting;
    }
    @Override
    void displayStatus(){
        super.displayStatus();
        System.out.println("Temperature Setting is "+tempsetting);
    }
}
public class DeviceInfo{
    public static void main(String args[]){
        Device obj=new Thermostat(12,"Active",22.5);
        obj.displayStatus();
    }
}