import java.util.*;
public class QuickSort{
    public static void Sorting(int[] arr,int low,int high){
        if(low<high){
            int pivotIndex=partition(arr,low,high);
            Sorting(arr,low,pivotIndex-1);
            Sorting(arr,pivotIndex+1,high);
        }
    }
    public static int partition(int[] arr,int low,int high){
        int pivot=arr[high];
        int i=low-1;
        for(int j=low;j<high;j++){
            if(arr[j]<pivot){
                i++;
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
        int temp=arr[i+1];
        arr[i+1]=arr[high];
        arr[high]=temp;
        return i+1;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of product prices ");
        int n=sc.nextInt();
        int[] prices=new int[n];
        System.out.println("Enter product price");
        for(int i=0;i<n;i++){
            prices[i]=sc.nextInt();
        }
        System.out.println("Product prices before sorting");
        for(int i=0;i<n;i++){
            System.out.print(prices[i]+" ");
        }
        Sorting(prices,0,n-1);
        System.out.println("\nProduct prices after sorting");
        for(int i=0;i<n;i++){
            System.out.print(prices[i]+" ");
        }
    }
}
