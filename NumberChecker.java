import java.util.*;
public class NumberChecker{
	public static int Count(int num){
		int temp=num;
		int c=0;
		while(temp>0){
			int d=temp%10;
			c++;
			temp=temp/10;
		}
		return c;
	}
	public static int[] Store(int num){
		int temp=num;
		int[] digits=new int[Count(num)];
		int i=0;
		while(temp>0){
			int d=temp%10;
			digits[i]=d;
			temp=temp/10;
			i++;
		}
		return digits;
	}
	public static boolean Duck(int num){
		int[] digit=Store(num);
		int flag=0;
		for(int i=0;i<digit.length;i++){
			if(digit[i]==0){
				flag=1;
				break;
			}	
		}
		if(flag==1){
			return true;
		}
		else{
			return false;
		}	
	}
	public static boolean Armstrong(int num){
		int[] digit=Store(num);
		int count=Count(num);
		int temp=num,sum=0;
		while(temp>0){
			int d=temp%10;
			sum=sum+(int)Math.pow(d,count);
			temp=temp/10;
		}
		if(sum==num){
			return true;
		}
		else{
			return false;
		}	
	}
	public static int[] findLargest(int num){
		int[] digit=Store(num);
		int largest=Integer.MIN_VALUE;
		int secondlargest=Integer.MIN_VALUE;
		Arrays.sort(digit);
		largest=digit[digit.length-1];
		secondlargest=digit[digit.length-2];
		return new int[] {largest,secondlargest};
	}
	public static int[] findSmallest(int num){
		int[] digit=Store(num);
		int smallest=Integer.MAX_VALUE;
		int secondsmallest=Integer.MAX_VALUE;
		for(int i=0;i<digit.length;i++){
			if(digit[i]<smallest){
				smallest=digit[i];
			}	
		}
		for(int i=0;i<digit.length;i++){
			if(digit[i]<secondsmallest && digit[i]>smallest){
				secondsmallest=digit[i];
			}	
		}
		return new int[] {smallest,secondsmallest};	
	}
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number");
		int n=sc.nextInt();
		int r1=Count(n);
		boolean r2=Duck(n);
		boolean r3=Armstrong(n);
		int[] r4=findLargest(n);
		int[] r5=findSmallest(n);
		System.out.println("Count is "+r1);
		System.out.println("Number is "+(r2?"Duck":"Not Duck"));
		System.out.println("Count is "+(r3?"Armstrong":"Not Armstrong"));
		System.out.println("Largest is "+r4[0]+" SecondLargest is "+r4[1]);
		System.out.println("Smallest is "+r5[0]+" SecondSmallest is "+r5[1]);
	}
}	