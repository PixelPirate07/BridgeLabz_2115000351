class SimpleHashMap{
    static class Node{
        int key,value;
        Node next;
        Node(int key,int value){
            this.key=key;
            this.value=value;
            this.next=null;
        }
    }
    private final int SIZE=10;
    private Node[] buckets;
    public SimpleHashMap(){
        buckets=new Node[SIZE];
    }
    private int hash(int key){
        return key%SIZE;
    }
    public void put(int key,int value){
        int index=hash(key);
        Node head=buckets[index];
        while(head!=null){
            if(head.key==key){  
                head.value=value;
                return;
            }
            head=head.next;
        }
        Node newNode=new Node(key,value);
        newNode.next=buckets[index];
        buckets[index]=newNode;
    }
    public int get(int key){
        int index=hash(key);
        Node head=buckets[index];
        while(head!=null){
            if(head.key==key){
                return head.value;
            }
            head=head.next;
        }
        return -1;
    }
    public void remove(int key){
        int index=hash(key);
        Node head=buckets[index];
        Node prev=null;
        while(head!=null){
            if(head.key==key){
                if(prev==null){
                    buckets[index]=head.next;
                } 
                else{
                    prev.next=head.next;
                }
                return;
            }
            prev=head;
            head=head.next;
        }
    }
    public static void main(String[] args){
        SimpleHashMap map=new SimpleHashMap();
        map.put(1,100);
        map.put(2,200);
        map.put(12,1200);
        System.out.println("Value for key 1 is "+map.get(1));
        System.out.println("Value for key 12 is "+map.get(12));
        map.remove(12);
        System.out.println("Value for key 12 after removal "+map.get(12));
    }
}
