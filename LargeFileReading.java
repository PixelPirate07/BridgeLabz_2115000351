import java.io.*;
public class LargeFileReading{
    public static void main(String[] args){
        String[] filePaths={"1MBfile.txt","100MBfile.txt","500MBfile.txt"};
        for(String filePath:filePaths){
            long startTime=System.nanoTime();
            try(FileReader fileReader=new FileReader(filePath)){
                char[] buffer=new char[8192];
                while(fileReader.read(buffer)!=-1){}
            } 
            catch(IOException e){
                e.printStackTrace();
            }
            long endTime=System.nanoTime();
            System.out.println("FileReader time for "+filePath+" is "+(endTime-startTime)/1000000.0);
            startTime=System.nanoTime();
            try(InputStreamReader inputStreamReader=new InputStreamReader(new FileInputStream(filePath))){
                char[] buffer=new char[8192];
                while(inputStreamReader.read(buffer)!=-1){}
            } 
            catch(IOException e){
                e.printStackTrace();
            }
            endTime=System.nanoTime();
            System.out.println("InputStreamReader time for "+filePath+" is "+(endTime-startTime)/1000000.0);
        }
    }
}
