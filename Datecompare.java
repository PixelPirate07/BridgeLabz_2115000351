import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;
public class Datecompare{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        DateTimeFormatter format=DateTimeFormatter.ofPattern("dd MM yyyy");
        System.out.print("Enter the first date in dd MM yyyy ");
        LocalDate date1=LocalDate.parse(sc.nextLine(),format);
        System.out.print("Enter the second date dd MM yyyy");
        LocalDate date2=LocalDate.parse(sc.nextLine(),format);
        if(date1.isBefore(date2)){
            System.out.println("The first date is before the second date");
        } 
        else if (date1.isAfter(date2)) {
            System.out.println("The first date is after the second date");
        }
        else {
            System.out.println("Both are same");
        }
    }
}
