import java.util.*;
public class Prime{
    public static boolean Prime(int num){
        if(num==2){
            return true;
        }
        int c=0;
        for(int i=2;i<=num;i++){
            c++;
        }
        if(c==0){
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number ");
        int n=sc.nextInt();
        boolean r=Prime(n);
        System.out.println("Number is "+(r?"Prime":"Not Prime"));
    }
}
