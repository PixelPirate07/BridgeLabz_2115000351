import java.io.*;
import java.util.*;
public class CountWords{
    public static void main(String[] args){
        String fileName="input.txt";
        Map<String,Integer> wordCount=new HashMap<>();
        try(BufferedReader rd=new BufferedReader(new FileReader(fileName))){
            String line;
            while((line=rd.readLine())!=null){
                String[] words=line.toLowerCase().replaceAll("[^a-z ]","").split("\\s+");
                for(String word:words){
                    if(!word.isEmpty()){
                        wordCount.put(word,wordCount.getOrDefault(word,0)+1);
                    }
                }
            }
        }catch(IOException e){
            System.out.println("Error "+e.getMessage());
        }
        List<Map.Entry<String, Integer>> sortedWords=new ArrayList<>(wordCount.entrySet());
        sortedWords.sort((a, b)->b.getValue()-a.getValue());
        System.out.println("Top 5 most frequent words");
        for(int i=0;i<Math.min(5,sortedWords.size());i++){
            System.out.println(sortedWords.get(i).getKey()+" - "+sortedWords.get(i).getValue());
        }
    }
}
