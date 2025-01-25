import java.util.*;
public class Check{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int arr[]=new int[5];
		for(int i=0;i<5;i++){
			arr[i]=sc.nextInt();
			if(arr[i]>0){
				if(arr[i]%2==0){
					System.out.println("Positive and even");
				}
				else{
					System.out.println("Positive and odd");
				}
			}
			else if(arr[i]==0){
				System.out.println("Zero");
			}
			else if(arr[i]<0){
				System.out.println("Negative");
			}
		}
		if(arr[0]==arr[4]){
			System.out.println("First and last are equal");
		}
		if(arr[0]<arr[4]){
			System.out.println("First is smaller than last");
		}
		if(arr[0]>arr[4]){
			System.out.println("First is greater than last");
		}
	}
}	
		