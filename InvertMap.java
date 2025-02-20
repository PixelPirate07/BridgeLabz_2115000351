import java.util.*;
public class InvertMap{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        Map<String,Integer> inputMap=new HashMap<>();
        System.out.println("Enter the number of entries");
        int n=sc.nextInt();
        sc.nextLine(); 
        for(int i=0;i<n;i++){
            System.out.println("Enter key String ");
            String key=sc.nextLine();
            System.out.println("Enter value Integer ");
            int value=sc.nextInt();
            sc.nextLine();
            inputMap.put(key,value);
        }
        Map<Integer, List<String>> invertedMap=invertMap(inputMap);
        System.out.println("Inverted Map "+invertedMap);
    }
    public static <K,V> Map<V,List<K>> invertMap(Map<K,V> map){
        Map<V,List<K>> inverted=new HashMap<>();
        for(Map.Entry<K, V> entry:map.entrySet()){
            inverted.computeIfAbsent(entry.getValue(),k->new ArrayList<>()).add(entry.getKey());
        }
        return inverted;
    }
}

