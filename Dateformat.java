import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
public class Dateformat{
    public static void main(String[] args){
        LocalDate currentdate=LocalDate.now();
        DateTimeFormatter f1=DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter f2=DateTimeFormatter.ofPattern("yyyy-MM-dd");
        DateTimeFormatter f3=DateTimeFormatter.ofPattern("EEE,MMM dd,yyyy");
        System.out.println("Date in format dd/MM/yyyy is "+currentdate.format(f1));
        System.out.println("Date in format yyyy-MM-dd is "+currentdate.format(f2));
        System.out.println("Date in format EEE MMM dd yyyy is "+currentdate.format(f3));
    }
}
