import java.io.*;
import java.util.*;
public class WordCount{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter target word");
        String fileName="input.txt";
        String targetWord=sc.nextLine();
        int count=0;
        try(BufferedReader rd=new BufferedReader(new FileReader(fileName))){
            String line;
            while((line=rd.readLine())!=null){
                String[] words=line.split("\\s+");
                for(String word:words){
                    if(word.equals(targetWord)){
                        count++;
                    }
                }
            }
        } 
        catch (IOException e){
            System.err.println("Error reading file "+e.getMessage());
        }
        System.out.println("The word "+targetWord+" appears "+count+" times in the file");
    }
}
