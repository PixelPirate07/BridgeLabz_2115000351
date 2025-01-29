import java.util.*;
public class Palindrome{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter string ");
		String str=sc.nextLine();
		String str2="";
		char c;
		for(int i=str.length()-1;i>=0;i--){
		    c=str.charAt(i);
		    str2=str2+c;
		}
		if(str.equals(str2)){
		    System.out.println("Palindrome String");
		}
		else{
		    System.out.println("Not Palindrome");
		}
	}
}
