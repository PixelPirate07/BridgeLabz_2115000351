import java.util.*;
public class Duplicate{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter string ");
		String str=sc.nextLine();
		StringBuilder s=new StringBuilder(str);
		StringBuilder str2=new StringBuilder();
		char c1,c2;
		s=s.reverse();
		for(int i=0;i<s.length();i++){
		    c1=s.charAt(i);
		    int count=0;
		    for(int j=i+1;j<s.length();j++){
		       c2=s.charAt(j);
		       if(c1==c2){
		           count++;
		       }
		    }
		    if(count==0){
		        str2=str2.append(c1);
		    }
		}
		str2=str2.reverse();
		System.out.println("After removing duplicates string is "+str2);
	}
}
