import java.util.*;
public class Longest{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter string ");
		String str=sc.nextLine();
		String[] words=str.split(" ");
		String longest="";
		for(String word:words){
		   if(word.length()>longest.length()){
		       longest=word;
		   }
		}
		System.out.println("Longest word is "+longest);
	}
}
