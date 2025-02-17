import java.util.*;
public class LinearBinary{
    public static int linearSearch(int[] arr,int target){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==target){
                return i;
            }
        }
        return -1;
    }
    public static int binarySearch(int[] arr,int target){
        int left=0,right=arr.length-1;
        while(left<=right){
            int mid=left+(right-left)/2;
            if(arr[mid]==target){
                return mid;
            } 
            else if(arr[mid]<target){
                left=mid+1;
            } 
            else{
                right=mid-1;
            }
        }
        return -1;
    }
    public static int[] generateDataset(int size){
        Random rand=new Random();
        int[] dataset=new int[size];
        for(int i=0;i<size;i++){
            dataset[i]=rand.nextInt();
        }
        return dataset;
    }
    public static void main(String[] args){
        int[] sizes={1000,10000,1000000};
        int target=500;
        for (int size:sizes){
            int[] dataset=generateDataset(size);
            long startTime=System.nanoTime();
            linearSearch(dataset,target);
            long endTime=System.nanoTime();
            long linearSearchTime=endTime-startTime;
            System.out.println("Linear Search for size "+size+"is "+linearSearchTime/1000000.0);
            Arrays.sort(dataset);
            startTime=System.nanoTime();
            binarySearch(dataset,target);
            endTime=System.nanoTime();
            long binarySearchTime=endTime-startTime;
            System.out.println("Binary Search for size "+size+"is "+binarySearchTime/1000000.0);
        }
    }
}
