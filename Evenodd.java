import java.util.*;
public class Evenodd{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int num=sc.nextInt();
		int oddnum[]=new int[(num/2)+1];
		int evennum[]=new int[(num/2)+1];
		int eveni=0,oddi=0;
		for(int i=1;i<=num;i++){
			if(i%2==0){
				evennum[eveni]=i;
				eveni++;
			}
			else{
				oddnum[oddi]=i;
				oddi++;
			}
		}
		System.out.println("Odd numbers are: ");
		for(int i=0;i<oddi;i++){
			System.out.println(oddnum[i]);
		}
		System.out.println("Even numbers are: ");
		for(int i=0;i<eveni;i++){
			System.out.println(evennum[i]);
		}
	}
}	
		
				
				