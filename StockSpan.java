import java.util.*;
public class StockSpan{
    public static int[] CalculateSpan(int[] price){
        int n=price.length;
        int[] span=new int[n];
        Stack<Integer> stack=new Stack<Integer>();
        for(int i=0;i<n;i++){
            while(!stack.isEmpty() && price[stack.peek()]<=price[i]){
                stack.pop();
            }
            span[i]=(stack.isEmpty()?(i+1):(i-stack.peek()));
            stack.push(i);
        }
        return span;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("How many days span to be calculated?");
        int days=sc.nextInt();
        int[] price=new int[days];
        for(int i=0;i<days;i++){
            System.out.println("Enter price");
            price[i]=sc.nextInt();
        }
        int[] span=CalculateSpan(price);
        for(int i=0;i<price.length;i++){
            System.out.println("Span for day"+(i+1)+" is "+span[i]);
        }
    }
}