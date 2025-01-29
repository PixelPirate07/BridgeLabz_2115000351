import java.util.*;
public class Replacement{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a string ");
        String str=sc.nextLine();
        System.out.println("Enter the word to replace ");
        String wordtoreplace=sc.nextLine();
        System.out.println("Enter the replacement word ");
        String replaceword=sc.nextLine();
        String result=str.replace(wordtoreplace,replaceword);
        System.out.println("Final string is "+result);
    }
}
