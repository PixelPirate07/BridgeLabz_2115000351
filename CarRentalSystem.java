import java.util.*;
class CarRental{
    private String customerName;
    private String carModel;
    private int rentalDays;
    private static final double dailyrate=50;
    public CarRental() {
        this("Unknown","Standard",1);
    }
    public CarRental(String customerName,String carModel,int rentalDays){
        this.customerName=customerName;
        this.carModel=carModel;
        this.rentalDays=rentalDays;
    }
    public double calculateTotalCost(){
        return rentalDays*dailyrate;
    }
    public void displayRentalDetails() {
        System.out.println("Customer Name is "+customerName);
        System.out.println("Car Model is "+carModel);
        System.out.println("Rental Days are "+rentalDays);
        System.out.println("Total Cost is "+calculateTotalCost());
    }
}    
public class CarRentalSystem{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter customer name");
        String customerName=sc.nextLine();
        System.out.println("Enter car model");
        String carModel=sc.nextLine();
        System.out.println("Enter rental days");
        int rentalDays=sc.nextInt();
        CarRental obj=new CarRental(customerName,carModel,rentalDays);
        obj.displayRentalDetails();
        CarRental obj1=new CarRental();
        obj1.displayRentalDetails();
    }
}
