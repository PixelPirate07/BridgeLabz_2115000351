import java.util.*;
public class Otp{
    public static int generateOTP(){
        return (int)(Math.random()*900000)+100000;
    }
    public static boolean areUnique(int[] otps){
        HashSet<Integer> uniqueOTPs = new HashSet<>();
        for(int i=0;i<otps.length;i++){
            uniqueOTPs.add(otps[i]);
        }
        return uniqueOTPs.size()==otps.length;
    }
    public static void main(String[] args){
        int[] otps=new int[10];
        for(int i=0;i<10;i++){
            otps[i]=generateOTP();
        }
        System.out.println("Generated OTPs ");
        for (int i=0;i<otps.length;i++){
            System.out.println(otps[i]);
        }
        System.out.println("Are all OTPs unique? "+(areUnique(otps)?"Yes":"No"));
    }
}
