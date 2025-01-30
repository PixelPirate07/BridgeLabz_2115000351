import java.util.*;
public class Replacement{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a string ");
        String str=sc.nextLine();
        System.out.println("Enter the word to replace ");
        String wordtoreplace=sc.nextLine();
        System.out.println("Enter the replacement word ");
        String replaceword=sc.nextLine();
        String result="";
        int i=0;
        while(i<str.length()){
            boolean match=true;
            if(i+wordtoreplace.length()<=str.length()){
                for(int j=0;j<wordtoreplace.length();j++){
                    if(str.charAt(i+j)!=wordtoreplace.charAt(j)){
                        match=false;
                        break;
                    }
                }
            }else{
                match=false;
            }
            if(match){
                result+=replaceword;
                i+=wordtoreplace.length();
            }else{
                result+=str.charAt(i);
                i++;
            }
        }
        System.out.println("Final string is- "+result);
    }
}
