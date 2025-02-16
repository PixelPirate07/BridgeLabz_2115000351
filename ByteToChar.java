import java.io.*;
import java.nio.charset.StandardCharsets;
public class ByteToChar{
    public static void main(String[] args){
        String fileName="input.txt";
        try(BufferedReader rd=new BufferedReader(new InputStreamReader(new FileInputStream(fileName),StandardCharsets.UTF_8))){
            String line;
            while((line=rd.readLine())!=null){
                System.out.println(line);
            }
        } 
        catch(IOException e){
            System.err.println("Error reading file "+e.getMessage());
        }
    }
}
