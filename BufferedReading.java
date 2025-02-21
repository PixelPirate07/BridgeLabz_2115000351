import java.io.*;
public class BufferedReading{
    public static void main(String[] args) {
        String sourceFile="file.txt";
        String destinationFile="copy.txt";
        long startTime=System.nanoTime();
        try(
            BufferedInputStream bis=new BufferedInputStream(new FileInputStream(sourceFile));
            BufferedOutputStream bos=new BufferedOutputStream(new FileOutputStream(destinationFile))
        ){
            byte[] buffer=new byte[4096];
            int bytesRead;
            while((bytesRead=bis.read(buffer))!=-1){
                bos.write(buffer,0,bytesRead);
            }
            System.out.println("File copied successfully");
        }catch(IOException e){
            System.out.println("Error "+e.getMessage());
        }
        long endTime=System.nanoTime();
        System.out.println("Execution Time is "+(endTime-startTime));
    }
}
