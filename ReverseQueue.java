import java.util.*;
public class ReverseQueue{
    public static void reverseQueue(Queue<Integer> queue){
        if(queue.isEmpty()){
            return;
        }
        int front=queue.poll();
        reverseQueue(queue);
        queue.offer(front);
    }
    public static void main(String[] args){
        Queue<Integer> queue=new LinkedList<>();
        queue.offer(10);
        queue.offer(20);
        queue.offer(30);
        System.out.println("Original Queue "+queue);
        reverseQueue(queue);
        System.out.println("Reversed Queue "+queue);
    }
}
