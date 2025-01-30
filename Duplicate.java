import java.util.*;
public class Duplicate{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string: ");
        String str=sc.nextLine();
        String rev="";
        for(int i=str.length()-1;i>=0;i--){
            rev+=str.charAt(i);
        }
        String result="";
        for(int i=0;i<rev.length();i++){
            char c=rev.charAt(i);
            boolean duplicate=false;
            for(int j=0;j<result.length();j++){
                if(result.charAt(j)==c){
                    duplicate=true;
                    break;
                }
            }
            if(!duplicate){
                result+=c;
            }
        }
        String str2="";
        for(int i =result.length()-1;i>=0;i--){
            str2+=result.charAt(i);
        }
        System.out.println("Final string is " +str2);
    }
}
