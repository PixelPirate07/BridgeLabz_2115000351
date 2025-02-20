import java.util.*;
public class FrequencyCount{
    public static Map<String,Integer> countFrequency(List<String> list){
        Map<String,Integer> frequencyMap=new HashMap<>();
        for(String item:list){
            frequencyMap.put(item,frequencyMap.getOrDefault(item,0)+1);
        }
        return frequencyMap;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of elements ");
        int n=sc.nextInt();
        sc.nextLine();
        List<String> stringList=new ArrayList<>();
        System.out.println("Enter the elements");
        for(int i=0;i<n;i++){
            stringList.add(sc.nextLine());
        }
        Map<String,Integer> frequencyMap=countFrequency(stringList);
        System.out.println("Element Frequencies "+frequencyMap);
    }
}