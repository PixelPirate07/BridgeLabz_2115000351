import java.util.*;
public class Frequent{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string ");
        String str=sc.nextLine();
        str=str.toLowerCase();
        int[] count=new int[256];
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            count[ch]++;
        }
        int maxcount=-1;
        char maxchar=' ';
        for(int i=0;i<256;i++){
            if(count[i]>maxcount){
                maxcount=count[i];
                maxchar=(char)i;
            }
        }
        System.out.println("The most frequent character is "+maxchar);
    }
}
