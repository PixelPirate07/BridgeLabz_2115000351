import java.util.*;
public class ListRotator{
    public static <T> void rotateList(List<T> list,int positions){
        int size=list.size();
        positions=positions%size;
        if(positions<0) positions+=size;
        Collections.rotate(list,-positions);
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
        System.out.print("Enter the number of positions to rotate ");
        int positions=sc.nextInt();
        rotateList(intList,positions);
        System.out.println("Rotated List"+intList);
    }
}
