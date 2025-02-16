import java.io.*;
public class ReadingFile{
    public static void main(String[] args){
        String fileName="input.txt";
        try (BufferedReader rd=new BufferedReader(new FileReader(fileName))){
            String line;
            while((line=rd.readLine())!=null){
                System.out.println(line);
            }
        } 
        catch (IOException e){
            System.err.println("Error reading file "+e.getMessage());
        }
    }
}
