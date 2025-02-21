import java.io.*;
public class ReadLargeFile{
    public static void main(String[] args){
        String fileName="input.txt";
        try(BufferedReader rd=new BufferedReader(new FileReader(fileName))){
            String line;
            while((line=rd.readLine())!=null){
                if(line.toLowerCase().contains("error")){
                    System.out.println(line);
                }
            }
        }catch(IOException e){
            System.out.println("Error "+e.getMessage());
        }
    }
}
