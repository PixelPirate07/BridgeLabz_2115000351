import java.io.*;
public class ByteArrayStream{
    public static void main(String[] args){
        String sourceImage="source.jpg";
        String outputImage="copy.jpg";
        try{
            FileInputStream fis=new FileInputStream(sourceImage);
            ByteArrayOutputStream baos=new ByteArrayOutputStream();
            byte[] buffer=new byte[4096];
            int bytesRead;
            while((bytesRead=fis.read(buffer))!=-1){
                baos.write(buffer,0,bytesRead);
            }
            fis.close();
            byte[] imageBytes=baos.toByteArray();
            ByteArrayInputStream bais=new ByteArrayInputStream(imageBytes);
            FileOutputStream fos=new FileOutputStream(outputImage);
            while ((bytesRead=bais.read(buffer))!=-1){
                fos.write(buffer,0,bytesRead);
            }
            fos.close();
            System.out.println("Image copied successfully");
        }catch(IOException e){
            System.out.println("Error "+e.getMessage());
        }
    }
}
