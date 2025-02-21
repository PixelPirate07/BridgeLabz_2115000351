import java.io.*;
public class AutoClosing{
    public static void main(String[] args){
        try(BufferedReader br=new BufferedReader(new FileReader("info.txt"))){
            String firstLine=br.readLine();
            if(firstLine!=null){
                System.out.println("First line "+firstLine);
            }
            else{
                System.out.println("File is empty");
            }
        }catch(IOException e){
            System.out.println("Error reading file");
        }
    }
}
