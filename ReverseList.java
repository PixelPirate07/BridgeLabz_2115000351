import java.util.*;
public class ReverseList{
    public static <T> void reverseList(List<T> list){
        int left=0,right=list.size()-1;
        while(left<right){
            T temp=list.get(left);
            list.set(left,list.get(right));
            list.set(right,temp);
            left++;
            right--;
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of elements");
        int n=sc.nextInt();
        List<Integer> list=new ArrayList<>();
        System.out.println("Enter the elements:");
        for(int i=0;i<n;i++){
            list.add(sc.nextInt());
        }
        System.out.println("Original List is "+list);
        reverseList(list);
        System.out.println("Reversed List is "+list);
    }
}