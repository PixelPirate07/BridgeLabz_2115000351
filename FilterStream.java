import java.io.*;
public class FilterStream{
    public static void main(String[] args){
        String sourceFile="source.txt";
        String destinationFile="final.txt";
        try(
            BufferedReader rd=new BufferedReader(new FileReader(sourceFile));
            BufferedWriter wt=new BufferedWriter(new FileWriter(destinationFile))
        ){
            int ch;
            while((ch=rd.read())!=-1){
                wt.write(Character.toLowerCase(ch));
            }
            System.out.println("File converted successfully");
        }catch(IOException e){
            System.out.println("Error "+e.getMessage());
        }
    }
}
