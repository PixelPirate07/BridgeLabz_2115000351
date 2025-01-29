import java.util.*;
public class Checker{
    public static boolean isPalindrome(String str){
        String str2="";
		char c;
		for(int i=str.length()-1;i>=0;i--){
		    c=str.charAt(i);
		    str2=str2+c;
		}
		if(str.equals(str2)){
		    return true;
		}
		else{
		    return false;
		}
    }
    public static void displayResult(String result){
        System.out.println(result);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter string ");
        String s=sc.nextLine();
        if (isPalindrome(s)) {
            displayResult(s+ " is palindrome.");
        } else {
            displayResult(s+ " is not palindrome.");
        }
    }
}
