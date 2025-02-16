import java.util.*;
public class Concat{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no. of strings");
        int n=sc.nextInt();
        sc.nextLine();
        String[] strings=new String[n];
        for(int i=0;i<n;i++){
            System.out.println("Enter string");
            strings[i]=sc.nextLine();
        }
        StringBuffer sb=new StringBuffer();
        for(String str:strings){
            sb.append(str);
        }
        System.out.println(sb.toString());
    }
}
