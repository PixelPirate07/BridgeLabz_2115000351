import java.util.*;
public class Toggle{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter string ");
        String str=sc.nextLine();
        String str2="";
        for(int i=0;i<str.length();i++) {
           char c=str.charAt(i);
           if((int)c>=97 && (int)c<=122){
               char c1=(char)((int)c-32);
               str2=str2+c1;
           }
           if((int)c>=65 && (int)c<=90){
               char c1=(char)((int)c+32);
               str2=str2+c1;
           }
        }
        System.out.println("After "+str2);
    }
}
