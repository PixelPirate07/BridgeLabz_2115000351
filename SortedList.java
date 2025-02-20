import java.util.*;
public class SortedList{
    public static List<Integer> convertToSortedList(Set<Integer> set){
        List<Integer> sortedList=new ArrayList<>(set);
        Collections.sort(sortedList);
        return sortedList;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of elements in the set ");
        int n=sc.nextInt();
        Set<Integer> set=new HashSet<>();
        System.out.println("Enter the elements of the set");
        for(int i=0;i<n;i++){
            set.add(sc.nextInt());
        }
        List<Integer> sortedList=convertToSortedList(set);
        System.out.println("Sorted List "+sortedList);
    }
}
