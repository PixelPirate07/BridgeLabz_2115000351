import java.util.*;
public class DataStructureComparison{
    public static void main(String[] args) {
        int[] datasetSizes={1000,100000,1000000};
        for(int size:datasetSizes){
            Integer[] dataset=new Integer[size];
            for(int i=0;i<size;i++){
                dataset[i]=i;
            }
            long startTime = System.nanoTime();
            int arraySearchElement=size-1;
            for(int i=0;i<size;i++){
                if(dataset[i]==arraySearchElement) break;
            }
            long endTime=System.nanoTime();
            System.out.println("Array search for size "+size+" is "+(endTime-startTime)/1000000.0);
            HashSet<Integer> hashSet=new HashSet<>(Arrays.asList(dataset));
            startTime=System.nanoTime();
            hashSet.contains(arraySearchElement);
            endTime=System.nanoTime();
            System.out.println("HashSet search for size "+size+" is "+(endTime-startTime)/1000000.0);
            TreeSet<Integer> treeSet=new TreeSet<>(Arrays.asList(dataset));
            startTime=System.nanoTime();
            treeSet.contains(arraySearchElement);
            endTime=System.nanoTime();
            System.out.println("TreeSet search for size "+size+" is "+(endTime-startTime)/1000000.0);
        }
    }
}
