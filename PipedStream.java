import java.io.*;
class WriterThread extends Thread{
    private PipedOutputStream pos;
    public WriterThread(PipedOutputStream pos){
        this.pos=pos;
    }
    public void run(){
        try{
            String message="Hello";
            pos.write(message.getBytes());
            pos.close();
        }catch(IOException e){
            System.out.println("Writer Error "+e.getMessage());
        }
    }
}
class ReaderThread extends Thread{
    private PipedInputStream pis;
    public ReaderThread(PipedInputStream pis){
        this.pis=pis;
    }
    public void run(){
        try{
            int data;
            while((data=pis.read())!=-1){
                System.out.print((char)data);
            }
            pis.close();
        }catch(IOException e){
            System.out.println("Reader Error "+e.getMessage());
        }
    }
}
public class PipedStream{
    public static void main(String[] args){
        try{
            PipedOutputStream pos=new PipedOutputStream();
            PipedInputStream pis=new PipedInputStream(pos);
            Thread wt=new WriterThread(pos);
            Thread rd=new ReaderThread(pis);
            wt.start();
            rd.start();
        }catch(IOException e){
            System.out.println("Error "+e.getMessage());
        }
    }
}
