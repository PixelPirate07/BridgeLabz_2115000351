import java.util.*;
public class Wordcount{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter string: ");
        String str=sc.nextLine().toLowerCase();
        String[] words=str.split(" ");
        boolean[] visited=new boolean[words.length];
        for (int i = 0; i < words.length; i++) {
            if(visited[i]){
                continue;
            }    
            int count=1;
            for(int j=i+1;j<words.length;j++) {
                if(words[i].equals(words[j])) {
                    count++;
                    visited[j]=true;
                }
            }
            System.out.println("Count of word "+words[i]+" is " +count);
        }
    }
}
