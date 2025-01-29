import java.util.*;
public class Dictionary{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter string 1 ");
        String str=sc.nextLine();
        System.out.println("Enter string 2 ");
        String str1=sc.nextLine();
        str=str.toLowerCase();
        str1=str1.toLowerCase();
        int minlen=Math.min(str.length(), str1.length());
        int i=0;
        while(i<minlen){
            char c1=str.charAt(i);
            char c2=str1.charAt(i);
            if(c1<c2){
                System.out.println(str+" comes before "+str1);
                return;
            }
            else if(c1>c2){
                System.out.println(str1+" comes before "+str);
                return;
            }
            i++;
        }
        if(str.length()<str1.length()){
            System.out.println(str+" comes before " +str1);
        } 
        else if(str.length()>str1.length()){
            System.out.println(str1+" comes before "+str);
        } 
        else{
            System.out.println("Both strings are equal");
        }
    }
}
