import java.util.*;
class Vehicle{
    static double registrationFee=5000;
    int registrationNumber;
    String ownerName;
    String vehicleType;
    public Vehicle(String ownerName,final int registrationNumber,String vehicleType){
        this.ownerName=ownerName;
        this.registrationNumber=registrationNumber;
        this.vehicleType=vehicleType;
    }
    static void updateRegistrationFee(double newFee){
        registrationFee=newFee;
    }
    public void viewDetails(){
        System.out.println("Owner Name "+ownerName);
        System.out.println("Registration Number "+registrationNumber);
        System.out.println("Vehicle Type "+vehicleType);
        System.out.println("Registration Fee "+registrationFee);
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Owner Name");
        String owner=sc.nextLine();
        System.out.println("Enter Registration Number");
        int reg=sc.nextInt();
        sc.nextLine();
        System.out.println("Enter Vehicle Type");
        String type=sc.nextLine();
        System.out.println("Enter Owner Name 2");
        String owner1=sc.nextLine();
        System.out.println("Enter Registration Number 2");
        int reg1=sc.nextInt();
        sc.nextLine();
        System.out.println("Enter Vehicle Type 2");
        String type1=sc.nextLine();
        Vehicle vehicle1=new Vehicle(owner,reg,type);
        Vehicle vehicle2=new Vehicle(owner1,reg1,type1);
        System.out.println("Enter new registration fee ");
        double newFee=sc.nextDouble();
        updateRegistrationFee(newFee);
        if (vehicle1 instanceof Vehicle && vehicle2 instanceof Vehicle){
            vehicle1.viewDetails();
            vehicle2.viewDetails();
        }
    }
}
