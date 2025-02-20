import java.util.*;
public class FindElement{
    public static <T> T findNthFromEnd(LinkedList<T> list,int n){
        Iterator<T> first=list.iterator();
        Iterator<T> second=list.iterator();
        for(int i=0;i<n;i++){
            if(!first.hasNext()){
                throw new IllegalArgumentException("N is larger than the list size");
            }
            first.next();
        }
        while(first.hasNext()){
            first.next();
            second.next();
        }
        
        return second.next();
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of elements ");
        int n=sc.nextInt();
        sc.nextLine();
        LinkedList<String> list=new LinkedList<>();
        System.out.println("Enter the elements");
        for(int i=0;i<n;i++){
            list.add(sc.nextLine());
        }
        System.out.print("Enter position from the end ");
        int position=sc.nextInt();
        try{
            String result=findNthFromEnd(list,position);
            System.out.println("element from the end "+result);
        } 
        catch(IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
    }
}
