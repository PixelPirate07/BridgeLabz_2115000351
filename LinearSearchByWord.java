import java.util.*;
public class LinearSearchByWord{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no. of sentences");
        int n=Integer.parseInt(sc.nextLine());
        String[] sentences=new String[n];
        for(int i=0;i<n;i++){
            System.out.println("Enter sentence");
            sentences[i]=sc.nextLine();
        }
        System.out.println("Enter target word");
        String targetWord=sc.nextLine();
        String result="Not Found";
        for(int i=0;i<n;i++){
            if(sentences[i].contains(targetWord)){
                result=sentences[i];
                break;
            }
        }
        System.out.println(result);
    }
}
