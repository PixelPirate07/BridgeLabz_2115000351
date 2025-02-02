import java.util.*;
class HotelBooking{
    private String guestName;
    private String roomType;
    private int nights;
    public HotelBooking(){
        this("Unknown","Standard",1);
    }
    public HotelBooking(String guestName,String roomType,int nights){
        this.guestName = guestName;
        this.roomType = roomType;
        this.nights = nights;
    }
    public HotelBooking(HotelBooking others){
        this.guestName=others.guestName;
        this.roomType=others.roomType;
        this.nights=others.nights;
    }
    public void displayBooking(){
        System.out.println("Guest Name is "+guestName);
        System.out.println("Room Type is "+roomType);
        System.out.println("Nights are "+nights);
    }
}    
public class HotelBookingSystem{    
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Name ");
        String guestName=sc.nextLine();
        System.out.println("Enter Room type");
        String roomType=sc.nextLine();
        System.out.println("Enter Nights ");
        int nights=sc.nextInt();
        HotelBooking obj=new HotelBooking(guestName,roomType,nights);
        HotelBooking obj1=new HotelBooking(obj);
        HotelBooking obj2=new HotelBooking();
        System.out.println("Original Booking is");
        obj.displayBooking();
        System.out.println("Cloned Booking is");
        obj1.displayBooking();
        System.out.println("Default Booking is");
        obj2.displayBooking();
    }
}
