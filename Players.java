import java.util.*;
public class Players{
    public static int findSum(int[] arr){
        int s=0;
        for(int i=0;i<11;i++){
            s=s+arr[i];
        }
        return s;
    }
    public static int findMean(int[] arr){
        return findSum(arr)/11;
    }
    public static int findShortest(int[] arr){
        int shortest=arr[0];
        for(int i=0;i<11;i++){
            if(arr[i]<shortest){
                shortest=arr[i];
            }
        }
        return shortest;
    }
    public static int findTallest(int[] arr){
        int tallest=arr[0];
        for(int i=0;i<11;i++){
            if(arr[i]>tallest){
                tallest=arr[i];
            }
        }
        return tallest;
    }
	public static void main(String[] args) {
		int[] heights=new int[11];
		Random random=new Random();
		for(int i=0;i<11;i++){
		    heights[i]=150+random.nextInt(101);
		    System.out.println("Height of Player "+(i+1)+"is "+heights[i]);
		}
		int r1=findSum(heights);
		int r2=findMean(heights);
		int r3=findShortest(heights);
		int r4=findTallest(heights);
		System.out.println("Sum is "+r1);
		System.out.println("Mean is "+r2);
		System.out.println("Shortest is "+r3);
		System.out.println("Tallest is "+r4);
	}
}
