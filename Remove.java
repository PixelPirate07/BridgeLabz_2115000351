import java.util.*;
public class Remove{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a string ");
        String str=sc.nextLine();
        System.out.print("Enter the character to remove ");
        char remove=sc.next().charAt(0);
        String result=str.replaceAll(String.valueOf(remove), "");
        System.out.println("After removing string is " +result);
    }
}
