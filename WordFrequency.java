import java.io.*;
import java.util.*;
public class WordFrequency{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter file path ");
        String filePath=sc.nextLine();
        Map<String,Integer> wordCount=new HashMap<>();
        try(BufferedReader reader=new BufferedReader(new FileReader(filePath))){
            String line;
            while((line=reader.readLine())!=null){
                line=line.replaceAll("[^a-zA-Z ]", "").toLowerCase();
                String[] words=line.split("\\s+");
                for(String word:words){
                    if(!word.isEmpty()){
                        wordCount.put(word,wordCount.getOrDefault(word,0)+1);
                    }
                }
            }
        } 
        catch(IOException e){
            System.out.println("Error reading file "+e.getMessage());
            return;
        }
        System.out.println("Word Frequencies "+wordCount);
    }
}
