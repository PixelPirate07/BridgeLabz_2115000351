import java.util.*;
public class MergeMaps{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        Map<String,Integer> map1=readMap(sc,"first");
        Map<String,Integer> map2=readMap(sc,"second");
        Map<String,Integer> mergedMap=mergeMaps(map1,map2);
        System.out.println("Merged Map "+mergedMap);
    }
    public static Map<String, Integer> readMap(Scanner sc,String mapName){
        Map<String, Integer> map=new HashMap<>();
        System.out.println("Enter the number of entries for "+mapName+" map");
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
        return map;
    }
    public static Map<String,Integer> mergeMaps(Map<String,Integer> map1,Map<String,Integer> map2){
        Map<String, Integer> mergedMap=new HashMap<>(map1);
        for(Map.Entry<String,Integer> entry:map2.entrySet()){
            mergedMap.merge(entry.getKey(),entry.getValue(),Integer::sum);
        }
        return mergedMap;
    }
}
