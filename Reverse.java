import java.util.*;
public class Reverse{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int c=0;
        int temp=n;
        while(temp>0){
            c++;
            temp=temp/10;
        }
        int i=0;
        int[] arr=new int[c];
        while(n>0){
            int d=n%10;
            arr[i]=d;
            n=n/10;
            i++;
        }
        for(int j=0;j<c;j++){
            System.out.println(arr[j]);
        }
    }
}