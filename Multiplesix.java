import java.util.*;
public class Multiplesix{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int arr[]=new int[10];
		if(num>=6 && num<=9){
			for(int i=1;i<=10;i++){
				arr[i-1]=num*i;
				System.out.println(num+" * "+i+" = "+arr[i-1]);
			}
		}
		else{
			System.out.println("Enter between 6 and 9");
		}	
	}
}	