import java.util.*;
public class Freqcount{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a no. ");
        int n=sc.nextInt();
        int[] freq=new int[10];
        while(n>0){
            int d=n%10;
            freq[d]++;
            n=n/10;
        }
        for(int i=0;i<10;i++){
            if(freq[i]>0){
                System.out.println("Digit "+i+" occurs "+freq[i]+" times");
            }
        }
    }
}