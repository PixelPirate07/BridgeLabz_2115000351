import java.util.regex.*;
import java.util.*;
public class IPAddressValidator{
    public static boolean isValidIPAddress(String ip){
        String ipPattern="^(25[0-5]|2[0-4][0-9]|1?[0-9][0-9]?)\\." +
                           "(25[0-5]|2[0-4][0-9]|1?[0-9][0-9]?)\\." +
                           "(25[0-5]|2[0-4][0-9]|1?[0-9][0-9]?)\\." +
                           "(25[0-5]|2[0-4][0-9]|1?[0-9][0-9]?)$";
        return ip.matches(ipPattern);
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter IP address ");
        String ip=sc.nextLine();
        if(isValidIPAddress(ip)){
            System.out.println("Valid IP address.");
        }else{
            System.out.println("Invalid IP address.");
        }
    }
}