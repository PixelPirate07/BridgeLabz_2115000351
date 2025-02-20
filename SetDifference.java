import java.util.*;
public class SetDifference{
    public static <T> Set<T> symmetricDifference(Set<T> set1,Set<T> set2){
        Set<T> resultSet=new HashSet<>(set1);
        resultSet.addAll(set2);
        Set<T> intersectionSet=new HashSet<>(set1);
        intersectionSet.retainAll(set2);
        resultSet.removeAll(intersectionSet);
        return resultSet;
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
        Set<Integer> symmetricDifferenceSet=symmetricDifference(set1,set2);
        System.out.println("Difference is "+symmetricDifferenceSet);
    }
}