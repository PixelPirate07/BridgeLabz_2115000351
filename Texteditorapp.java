class TextState{
    String text;
    TextState next;
    TextState prev;
    public TextState(String text){
        this.text=text;
        this.next=null;
        this.prev=null;
    }
}
class TextEditor{
    TextState head;
    TextState current;
    int size;
    int maxSize;
    public TextEditor(int maxSize){
        this.head=null;
        this.current=null;
        this.size=0;
        this.maxSize=maxSize;
    }
    public void addState(String text){
        TextState newState=new TextState(text);
        if(size==maxSize){
            head=head.next;
            head.prev=null;
            size--;
        }
        if(current!=null){
            current.next=newState;
            newState.prev=current;
            current=current.next;
        } 
        else{
            head=newState;
            current=head;
        }
        size++;
    }
    public void undo(){
        if(current!=null && current.prev!=null){
            current=current.prev;
            System.out.println("Undo "+current.text);
        } else {
            System.out.println("No more undo steps");
        }
    }
    public void redo(){
        if(current!=null && current.next!=null){
            current=current.next;
            System.out.println("Redo "+current.text);
        } 
        else{
            System.out.println("No more redo steps");
        }
    }
    public void displayCurrentState(){
        if(current!=null){
            System.out.println("Current state is "+current.text);
        } 
        else{
            System.out.println("No text yet");
        }
    }
}
public class Texteditorapp{
    public static void main(String[] args){
        TextEditor editor=new TextEditor(10);
        editor.addState("Hey");
        editor.addState("Hello World");
        editor.addState("Hello Everyone");
        editor.displayCurrentState();
        editor.undo();
        editor.undo();
        editor.redo();
        editor.addState("Hello Again");
        editor.displayCurrentState();
    }
}
