import java.util.*;
public class BinaryNumGenerator{
    public static void generateBinaryNumbers(int n){
        Queue<String> queue=new LinkedList<>();
        queue.add("1");
        for(int i=0;i<n;i++){
            String current=queue.poll();
            System.out.print(current+" ");
            queue.add(current+"0");
            queue.add(current+"1");
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the value of n ");
        int n=sc.nextInt();
        generateBinaryNumbers(n);
    }
}
