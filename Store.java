import java.util.*;
public class Store{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		double num[]=new double[10];
		double total=0;
		int i=0;
		System.out.println("Enter 0 or negative to stop otherwise enter");
		while(true){
			System.out.println("Enter number");
			double input=sc.nextDouble();
			if(input<=0){
				break;
			}
			num[i]=input;
			i++;
			if(i==10){
				break;
			}
		}	
		for(int j=0;j<i;j++){
			total=total+num[j];
		}	
		for(int j=0;j<i;j++){
			System.out.println(num[j]);
		}
		System.out.println("Total is "+total);
	}
}	