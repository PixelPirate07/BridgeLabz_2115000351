import java.util.*;
public class BinarySearchPeak{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no. of elements");
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            System.out.println("Enter element");
            arr[i]=sc.nextInt();
        }
        int peakIndex=findPeakElement(arr);
        System.out.println(peakIndex);
    }
    public static int findPeakElement(int[] arr){
        int left=0,right=arr.length-1;
        while(left<right){
            int mid=left+(right-left)/2;
            if(arr[mid]>arr[mid+1]){
                right=mid;
            } 
            else{
                left=mid+1;
            }
        }
        return left;
    }
}
