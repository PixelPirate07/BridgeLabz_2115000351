import java.io.*;
public class DataStream{
    public static void main(String[] args){
        String fileName="students.dat";
        try(DataOutputStream dos=new DataOutputStream(new FileOutputStream(fileName))){
            dos.writeInt(1);
            dos.writeUTF("Jon");
            dos.writeDouble(3.8);
            dos.writeInt(2);
            dos.writeUTF("Snow");
            dos.writeDouble(3.6);
            System.out.println("Student data saved");
        }catch(IOException e){
            System.out.println("Error "+e.getMessage());
        }
        try(DataInputStream dis=new DataInputStream(new FileInputStream(fileName))){
            while(dis.available()>0){
                int rollNumber=dis.readInt();
                String name=dis.readUTF();
                double gpa=dis.readDouble();
                System.out.println(rollNumber+" | "+name+" | "+gpa);
            }
        }catch(IOException e){
            System.out.println("Error "+e.getMessage());
        }
    }
}
