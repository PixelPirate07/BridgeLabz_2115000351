import java.io.*;
public class ConsoleFile{
    public static void main(String[] args){
        String fileName="abc.txt";
        try (BufferedReader rd=new BufferedReader(new InputStreamReader(System.in));
             BufferedWriter wt=new BufferedWriter(new FileWriter(fileName))){
            String line;
            System.out.println("Enter text (type 'exit' to stop)");
            while(!(line=rd.readLine()).equalsIgnoreCase("exit")){
                wt.write(line);
                wt.newLine();
            }
        } 
        catch(IOException e){
            System.err.println("Error handling input/output "+e.getMessage());
        }
    }
}
