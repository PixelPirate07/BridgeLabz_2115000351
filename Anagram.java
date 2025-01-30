import java.util.*;
public class Anagram{
    public static boolean areAnagrams(String str,String str2){
        if (str.length()!=str2.length()){
            return false;
        }
        int[] c1=new int[256];
        int[] c2=new int[256];
        for(int i=0;i<str.length();i++){
            c1[str.charAt(i)]++;
            c2[str2.charAt(i)]++;
        }
        for(int i=0;i<256;i++){
            if(c1[i]!=c2[i]){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter string ");
        String str=sc.nextLine();
        System.out.println("Enter string ");
        String str2=sc.nextLine();
        if(areAnagrams(str,str2)){
            System.out.println("Anagram");
        } else {
            System.out.println("Not Anagram");
        }
    }
}
