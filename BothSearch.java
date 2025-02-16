import java.util.*;
public class BothSearch{
    public static int findFirstMissingPositive(int[] nums){
        int n=nums.length;
        for(int i=0;i<n;i++){
            while(nums[i]>0 && nums[i]<=n && nums[nums[i]-1]!=nums[i]){
                int temp=nums[i];
                nums[i]=nums[temp-1];
                nums[temp-1]=temp;
            }
        }
        for(int i=0;i<n;i++){
            if(nums[i]==i+1){
                return i+1;
            }
        }
        return n+1;
    }
    public static int binarySearch(int[] nums,int target){
        int left=0,right=nums.length-1;
        while(left<=right){
            int mid=left+(right-left)/2;
            if(nums[mid]==target){
                return mid;
            }
            else if(nums[mid]<target){
                left=mid+1;
            } 
            else{
                right=mid-1;
            }
        }
        return -1;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of the array ");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter the elements of the array");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("First missing positive integer "+findFirstMissingPositive(arr));
        System.out.print("Enter the size of the sorted array ");
        int m=sc.nextInt();
        int[] sortedArr=new int[m];
        System.out.println("Enter the elements of the sorted array");
        for(int i=0;i<m;i++){
            sortedArr[i]=sc.nextInt();
        }
        System.out.print("Enter the target element ");
        int target=sc.nextInt();
        int result=binarySearch(sortedArr, target);
        if(result!=-1){
            System.out.println("Target found at index "+result);
        } 
        else{
            System.out.println("Target not found");
        }
    }
}
