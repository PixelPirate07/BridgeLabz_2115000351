import java.util.*;
public class Reverse{
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
		System.out.println("Reverse string is "+str2);
	}
}
