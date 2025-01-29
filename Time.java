import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.ZoneId;
public class Time{
    public static void main(String[] args) {
        ZonedDateTime gmttime=ZonedDateTime.now(ZoneId.of("GMT"));
        ZonedDateTime isttime=ZonedDateTime.now(ZoneId.of("Asia/Kolkata"));
        ZonedDateTime psttime=ZonedDateTime.now(ZoneId.of("America/Los_Angeles"));
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss z");
        System.out.println("Current time in GMT is " +gmttime.format(formatter));
        System.out.println("Current time in IST is " +isttime.format(formatter));
        System.out.println("Current time in PST is " +psttime.format(formatter));
    }
}
