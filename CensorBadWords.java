import java.util.*;
public class CensorBadWords{
    public static String censorText(String text,String[] badWords){
        for(String word:badWords){
            text=text.replaceAll("\\b"+word+"\\b","****");
        }
        return text;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter text ");
        String text=sc.nextLine();
        String[] badWords={"damn","stupid"};
        System.out.println("Censored text "+censorText(text,badWords));
    }
}
