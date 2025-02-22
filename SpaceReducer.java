import java.util.*;
public class SpaceReducer{
    public static String reduceSpaces(String text){
        return text.replaceAll("\\s+"," ").trim();
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter text ");
        String text=sc.nextLine();
        System.out.println("Processed text "+reduceSpaces(text));
    }
}