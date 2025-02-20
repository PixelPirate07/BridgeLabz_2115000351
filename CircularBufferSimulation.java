import java.util.*;
class CircularBuffer{
    private int[] buffer;
    private int head,tail,size,capacity;
    public CircularBuffer(int capacity){
        this.capacity=capacity;
        this.buffer=new int[capacity];
        this.head=0;
        this.tail=0;
        this.size=0;
    }
    public void enqueue(int value){
        buffer[tail]=value;
        tail=(tail+1)%capacity;
        if(size<capacity){
            size++;
        } 
        else{
            head=(head+1)%capacity;
        }
    }
    public List<Integer> getBufferContents(){
        List<Integer> contents=new ArrayList<>();
        for(int i=0;i<size;i++){
            contents.add(buffer[(head+i)%capacity]);
        }
        return contents;
    }
}
public class CircularBufferSimulation{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter buffer size ");
        int size=sc.nextInt();
        CircularBuffer buffer=new CircularBuffer(size);
        while (true){
            System.out.print("Enter a number to insert -1 to stop ");
            int num=sc.nextInt();
            if(num==-1) break;
            buffer.enqueue(num);
            System.out.println("Buffer is "+buffer.getBufferContents());
        }
    }
}
