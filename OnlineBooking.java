class Ticket{
    int ticketId;
    String customerName;
    String movieName;
    String seatNumber;
    String bookingTime;
    Ticket next;
    public Ticket(int ticketId,String customerName,String movieName,String seatNumber,String bookingTime){
        this.ticketId=ticketId;
        this.customerName=customerName;
        this.movieName=movieName;
        this.seatNumber=seatNumber;
        this.bookingTime=bookingTime;
        this.next=null;
    }
}
class TicketReservationSystem{
    Ticket head;
    public TicketReservationSystem(){
        head=null;
    }
    public void addTicket(int ticketId,String customerName,String movieName,String seatNumber,String bookingTime){
        Ticket newTicket=new Ticket(ticketId,customerName,movieName,seatNumber,bookingTime);
        if(head==null){
            head=newTicket;
            newTicket.next=head;
        } 
        else{
            Ticket temp=head;
            while(temp.next!=head){
                temp=temp.next;
            }
            temp.next=newTicket;
            newTicket.next=head;
        }
    }
    public void removeTicket(int ticketId){
        if(head==null){
            System.out.println("No tickets to remove");
            return;
        }
        if(head.ticketId==ticketId){
            if(head.next==head){
                head=null;
            } 
            else{
                Ticket temp=head;
                while(temp.next!=head){
                    temp=temp.next;
                }
                temp.next=head.next;
                head=head.next;
            }
            return;
        }
        Ticket temp=head;
        while(temp.next!=head && temp.next.ticketId!=ticketId){
            temp=temp.next;
        }
        if(temp.next==head){
            System.out.println("Ticket not found");
        }
        else{
            temp.next=temp.next.next;
        }
    }
    public void displayTickets(){
        if(head==null){
            System.out.println("No tickets booked");
            return;
        }
        Ticket temp=head;
        while(temp!=null){
            System.out.println("Ticket ID "+temp.ticketId+", Customer "+temp.customerName+", Movie "+temp.movieName+", Seat "+temp.seatNumber+", Booking Time "+temp.bookingTime);
            temp=temp.next;
            if(temp==head){
                break;
            }    
        }
    }
    public Ticket searchTicketByCustomerName(String customerName){
        if(head==null){
            System.out.println("No tickets found");
            return null;
        }
        Ticket temp=head;
        while(temp!=null){
            if(temp.customerName.equals(customerName)){
                return temp;
            }
            temp=temp.next;
            if(temp==head){
                break;
            }    
        }
        return null;
    }
    public Ticket searchTicketByMovieName(String movieName){
        if(head==null){
            System.out.println("No tickets found");
            return null;
        }
        Ticket temp=head;
        while(temp!=null){
            if(temp.movieName.equals(movieName)){
                return temp;
            }
            temp=temp.next;
            if(temp==head){
                break;
            }    
        }
        return null;
    }
    public int countBookedTickets(){
        if(head==null){
            return 0;
        }
        int count=0;
        Ticket temp=head;
        while(temp!=null){
            count++;
            temp=temp.next;
            if(temp==head){
                break;
            }    
        }
        return count;
    }
}
public class OnlineBooking{
    public static void main(String[] args){
        TicketReservationSystem system=new TicketReservationSystem();
        system.addTicket(1,"Rohit","Interstellar","A1","9:00 AM");
        system.addTicket(2,"Kohli","Conjuring","B2","12:00 PM");
        system.addTicket(3,"Steve","3 Idiots","A3","3:00 PM");
        system.addTicket(4,"Warner","Dunki","C4","6:00 PM");
        system.displayTickets();
        system.removeTicket(2);
        System.out.println("\nTickets after removal");
        system.displayTickets();
        Ticket ticket=system.searchTicketByCustomerName("Charlie");
        if(ticket!=null){
            System.out.println("\nFound Ticket Ticket ID "+ticket.ticketId+", Customer "+ticket.customerName+", Movie "+ticket.movieName);
        }
        System.out.println("\nTotal Booked Tickets "+system.countBookedTickets());
    }
}
