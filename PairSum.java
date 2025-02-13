import java.util.*;
public class PairSum{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of the array ");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter the elements of the array");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.print("Enter the target sum ");
        int target=sc.nextInt();
        if(findPairWithGivenSum(arr,target)){
            System.out.println("Pair with given sum found");
        } 
        else{
            System.out.println("No pair found");
        }
    }
    public static boolean findPairWithGivenSum(int[] arr,int target){
        HashMap<Integer,Boolean> map=new HashMap<>();
        for(int num:arr){
            int complement=target-num;
            if(map.containsKey(complement)){
                System.out.println("Pair found ("+complement+", "+num+")");
                return true;
            }
            map.put(num,true);
        }
        return false;
    }
}
