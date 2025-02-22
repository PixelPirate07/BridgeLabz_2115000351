import java.util.regex.*;
import java.util.*;
public class HexColorValidator{
    public static boolean isValidHexColor(String color){
        return color.matches("^#[0-9A-Fa-f]{6}$");
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter hex color code ");
        String color=sc.nextLine();
        if(isValidHexColor(color)){
            System.out.println("Valid hex color code");
        } 
        else{
            System.out.println("Invalid hex color code");
        }
    }
}
