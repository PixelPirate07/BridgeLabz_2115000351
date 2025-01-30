import java.util.*;
public class Remove{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a string ");
        String str=sc.nextLine();
        System.out.print("Enter the character to remove ");
        char remove=sc.next().charAt(0);
        String str2="";
        for(int i=0;i<str.length();i++) {
            if (str.charAt(i)!=remove){
                str2=str2+str.charAt(i);
            }
        }
        System.out.println("Final string is "+str2);
    }
}
