import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;
public class Date{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a date (yyyy-MM-dd) ");
        String inputdate=sc.nextLine();
        LocalDate date=LocalDate.parse(inputdate);
        LocalDate modifiedDate=date.plusDays(7).plusMonths(1).plusYears(2).minusWeeks(3);
        DateTimeFormatter formatter=DateTimeFormatter.ofPattern("yyyy-MM-dd");
        System.out.println("Final date after modifications "+modifiedDate.format(formatter));
    }
}
