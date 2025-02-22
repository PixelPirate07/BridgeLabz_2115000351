import java.util.regex.*;
import java.util.*;
public class SSNValidator{
    public static void validateSSNs(String text){
        Pattern pattern=Pattern.compile("\\b\\d{3}-\\d{2}-\\d{4}\\b");
        Matcher matcher=pattern.matcher(text);
        while(matcher.find()){
            System.out.println("\""+matcher.group()+"\" is valid");
        }
        Pattern invalidPattern=Pattern.compile("\\b\\d{9}\\b");
        Matcher invalidMatcher=invalidPattern.matcher(text);
        while(invalidMatcher.find()){
            System.out.println("\"" +invalidMatcher.group()+"\" is invalid");
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter text ");
        String text=sc.nextLine();
        validateSSNs(text);
    }
}