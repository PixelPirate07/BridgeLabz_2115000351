import java.util.*;
public class QueueUsingStack{
    Stack<Integer> stack1=new Stack<>();
    Stack<Integer> stack2=new Stack<>();
    public void enqueue(int data){
        stack1.push(data);
    }
    public void dequeue(){
        if(stack1.isEmpty() && stack2.isEmpty()){
            System.out.println("Queue is Empty");
        }
        else{
            while(!stack1.isEmpty()){
                stack2.push(stack1.pop());
            }
        }
        System.out.println("At first Queue is "+stack2);
        System.out.println("DeQueued element is "+stack2.pop());
        System.out.println("Final Queue is "+stack2);
    }
    public static void main(String args[]){
        QueueUsingStack queue=new QueueUsingStack();
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.dequeue();
    }
}