import java.util.regex.*;
import java.util.*;
public class DateExtractor{
    public static void extractDates(String text){
        Pattern pattern=Pattern.compile("\\b(0[1-9]|[12][0-9]|3[01])/(0[1-9]|1[0-2])/\\d{4}\\b");
        Matcher matcher=pattern.matcher(text);
        while (matcher.find()){
            System.out.println(matcher.group());
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter text ");
        String text=sc.nextLine();
        extractDates(text);
    }
}
