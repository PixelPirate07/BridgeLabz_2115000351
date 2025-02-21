import java.io.*;
public class ReadUserInput{
    public static void main(String[] args){
        try(
            BufferedReader rd=new BufferedReader(new InputStreamReader(System.in));
            FileWriter wt=new FileWriter("userdata.txt")
        ){
            System.out.print("Enter your name ");
            String name=rd.readLine();
            System.out.print("Enter your age ");
            String age=rd.readLine();
            System.out.print("Enter your favorite language ");
            String language=rd.readLine();
            wt.write("Name "+name+"\n");
            wt.write("Age "+age+"\n");
            wt.write("Favorite Language "+language+"\n");
            System.out.println("Data saved");
        }catch(IOException e){
            System.out.println("Error "+e.getMessage());
        }
    }
}
