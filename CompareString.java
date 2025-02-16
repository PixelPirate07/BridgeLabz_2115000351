import java.io.*;
import java.nio.charset.StandardCharsets;
public class CompareString{
    public static void main(String[] args){
        int iterations=1000000;
        String sampleText="hello";
        long startTime=System.nanoTime();
        StringBuffer stringBuffer=new StringBuffer();
        for(int i=0;i<iterations;i++){
            stringBuffer.append(sampleText);
        }
        long bufferTime=System.nanoTime()-startTime;
        startTime=System.nanoTime();
        StringBuilder stringBuilder=new StringBuilder();
        for(int i=0;i<iterations;i++){
            stringBuilder.append(sampleText);
        }
        long builderTime=System.nanoTime()-startTime;
        System.out.println("StringBuffer time in ns "+bufferTime);
        System.out.println("StringBuilder time in ns "+builderTime);
        String fileName="abc.txt";
        countWordsUsingFileReader(fileName);
        countWordsUsingInputStreamReader(fileName);
    }
    private static void countWordsUsingFileReader(String fileName){
        long startTime=System.nanoTime();
        int wordCount=0;
        try(BufferedReader rd=new BufferedReader(new FileReader(fileName))){
            String line;
            while((line=rd.readLine())!=null){
                wordCount+=line.split("\\s+").length;
            }
        } 
        catch(IOException e){
            System.err.println("Error reading file "+e.getMessage());
        }
        long elapsedTime=System.nanoTime()-startTime;
        System.out.println("FileReader word count "+wordCount+", Time "+elapsedTime+" ns");
    }
    private static void countWordsUsingInputStreamReader(String fileName){
        long startTime=System.nanoTime();
        int wordCount=0;
        try(BufferedReader rd=new BufferedReader(new InputStreamReader(new FileInputStream(fileName),StandardCharsets.UTF_8))){
            String line;
            while((line=rd.readLine())!=null){
                wordCount+=line.split("\\s+").length;
            }
        } 
        catch(IOException e){
            System.err.println("Error reading file "+e.getMessage());
        }
        long elapsedTime=System.nanoTime()-startTime;
        System.out.println("InputStreamReader word count "+wordCount+", Time "+elapsedTime+" ns");
    }
}
