import java.util.regex.*;
import java.util.*;
public class ProgrammingExtractor{
    public static void extractLanguages(String text){
        Pattern pattern=Pattern.compile("\\b(JavaScript|Java|Python|C\+\+|C#|Go|Ruby|Swift|PHP|Kotlin|TypeScript|Rust|Perl)\\b");
        Matcher matcher=pattern.matcher(text);
        while(matcher.find()){
            System.out.println(matcher.group());
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter text ");
        String text=sc.nextLine();
        extractLanguages(text);
    }
}
