import java.util.*;
import java.util.regex.*;
import java.util.stream.Collectors;
import java.util.*;
public class RepeatingWord{
    public static void findRepeatingWords(String text) {
        Pattern pattern=Pattern.compile("\\b(\\w+)\\b");
        Matcher matcher=pattern.matcher(text);
        Map<String, Integer> wordCount=new HashMap<>();
        while(matcher.find()){
            String word=matcher.group().toLowerCase();
            wordCount.put(word,wordCount.getOrDefault(word,0)+1);
        }
        List<String> repeatedWords = wordCount.entrySet().stream().filter(entry -> entry.getValue()>1).map(Map.Entry::getKey).collect(Collectors.toList());
        System.out.println(String.join(", ",repeatedWords));
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a sentence ");
        String text=sc.nextLine();
        findRepeatingWords(text);
    }
}
