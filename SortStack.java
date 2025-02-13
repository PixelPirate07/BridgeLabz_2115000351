import java.util.*;
public class SortStack{
    public void InsertCorrect(Stack<Integer> stack,int element){
        if(stack.isEmpty() || element>stack.peek()){
            stack.push(element);
        }
        else{
            int temp=stack.pop();
            InsertCorrect(stack,element);
            stack.push(temp);
        }
    }
    public void Sorting(Stack<Integer> stack){
        if(!stack.isEmpty()){
            int temp=stack.pop();
            Sorting(stack);
            InsertCorrect(stack,temp);
        }
    }
    public static void main(String args[]){
        Stack<Integer> stack=new Stack<>();
        stack.push(3);
        stack.push(1);
        stack.push(4);
        stack.push(2);
        System.out.println("Original is "+stack);
        SortStack sorter=new SortStack();
        sorter.Sorting(stack);
        System.out.println("After sorting is "+stack);
    }
}