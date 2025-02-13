import java.util.*;
public class ZeroSum{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of the array ");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter the elements of the array");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        findZeroSumSubarrays(arr);
    }
    public static void findZeroSumSubarrays(int[] arr){
        Map<Integer,Integer> map=new HashMap<>();
        int sum = 0;
        System.out.println("Subarrays with zero sum");
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
            if(sum==0){
                printSubarray(arr,0,i);
            }
            if(map.containsKey(sum)){
                printSubarray(arr,map.get(sum)+1,i);
            }
            map.put(sum,i);
        }
    }
    public static void printSubarray(int[] arr,int start,int end){
        System.out.print("[");
        for(int i=start;i<=end;i++){
            System.out.print(arr[i]+(i==end?"":","));
        }
        System.out.println("]");
    }
}
