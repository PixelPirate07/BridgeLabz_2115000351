import java.util.*;
public class LongestSequence{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of the array ");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter the elements of the array");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int longestLength=findLongestConsecutiveSequence(arr);
        System.out.println("Length of the longest consecutive sequence "+longestLength);
    }
    public static int findLongestConsecutiveSequence(int[] arr){
        if(arr.length==0) return 0;
        HashSet<Integer> set=new HashSet<>();
        for(int num:arr){
            set.add(num);
        }
        int longestStreak=0;
        for(int num:set){
            if(!set.contains(num-1)){
                int currentNum=num;
                int currentStreak=1;
                while(set.contains(currentNum+1)){
                    currentNum++;
                    currentStreak++;
                }
                longestStreak=Math.max(longestStreak,currentStreak);
            }
        }
        return longestStreak;
    }
}
