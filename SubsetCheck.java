import java.util.*;
public class SubsetCheck{
    public static <T> boolean isSubset(Set<T> subset,Set<T> superset){
        return superset.containsAll(subset);
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of elements in Set1 ");
        int n1=sc.nextInt();
        Set<Integer> set1=new HashSet<>();
        System.out.println("Enter the elements of Set1");
        for(int i=0;i<n1;i++){
            set1.add(sc.nextInt());
        }
        System.out.print("Enter the number of elements in Set2 ");
        int n2=sc.nextInt();
        Set<Integer> set2=new HashSet<>();
        System.out.println("Enter the elements of Set2");
        for(int i=0;i<n2;i++){
            set2.add(sc.nextInt());
        }
        boolean result=isSubset(set1,set2);
        System.out.println("Is Set1 a subset of Set2 "+result);
    }
}