import java.util.*;
public class MaxFinder{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        Map<String,Integer> map=new HashMap<>();
        System.out.println("Enter the number of entries");
        int n=sc.nextInt();
        sc.nextLine(); 
        for(int i=0;i<n;i++){
            System.out.println("Enter key String ");
            String key=sc.nextLine();
            System.out.println("Enter value Integer ");
            int value=sc.nextInt();
            sc.nextLine();
            map.put(key,value);
        }
        String maxKey=findMaxKey(map);
        System.out.println("Key with the highest value "+maxKey);
    }
    public static String findMaxKey(Map<String,Integer> map){
        return Collections.max(map.entrySet(), Map.Entry.comparingByValue()).getKey();
    }
}
