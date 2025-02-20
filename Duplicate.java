import java.util.*;
public class Duplicate{
    public static <T> List<T> removeDuplicates(List<T> list){
        Set<T> seen=new HashSet<>();
        List<T> result=new ArrayList<>();
        for(T item:list){
            if(seen.add(item)){
                result.add(item);
            }
        }
        return result;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of elements ");
        int n=sc.nextInt();
        sc.nextLine();
        List<Integer> intList=new ArrayList<>();
        System.out.println("Enter the elements");
        for(int i=0;i<n;i++){
            intList.add(sc.nextInt());
        }
        List<Integer> uniqueList=removeDuplicates(intList);
        System.out.println("List after removing duplicates "+uniqueList);
    }
}