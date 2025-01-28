import java.util.*;
public class Find{
    public void findSmallestAndLargest(int number1,int number2,int number3){
        int largest=0,smallest=0;
        if(number1<number2 && number1<number3){
            smallest=number1;
        }
        if(number2<number1 && number2<number3){
            smallest=number2;
        }
        if(number3<number2 && number3<number1){
            smallest=number3;
        }
        if(number1>number2 && number1>number3){
            largest=number1;
        }
        if(number2>number1 && number2>number3){
            largest=number2;
        }
        if(number3>number2 && number3>number1){
            largest=number3;
        }
        System.out.println("Smallest is "+smallest);
        System.out.println("Largest is "+largest);
    }
	public static void main(String[] args){
	    Scanner sc=new Scanner(System.in);
	    Find obj=new Find();
	    System.out.println("Enter number 1 ");
	    int n1=sc.nextInt();
	    System.out.println("Enter number 2 ");
	    int n2=sc.nextInt();
	    System.out.println("Enter number 3 ");
	    int n3=sc.nextInt();
	    obj.findSmallestAndLargest(n1,n2,n3);
	}
}
