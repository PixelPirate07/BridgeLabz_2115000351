import java.util.*;
public class Reversestring{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String input=sc.nextLine();
        StringBuilder sb=new StringBuilder(input);
        System.out.println(sb.reverse().toString());
    }
}
