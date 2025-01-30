import java.util.*;
public class Longest{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter string ");
        String str=sc.nextLine();
        String longest="";
        String word="";
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            if(ch!=' '){
                word+=ch;
            }else if(!word.equals("")){
                if(word.length()>longest.length()){
                    longest=word;
                }
                word="";
            }
        }
        if(!word.equals("") && word.length()>longest.length()){
            longest=word;
        }
        System.out.println("Longest word is "+longest);
    }
}
