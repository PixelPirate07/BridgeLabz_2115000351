import java.util.*;
public class Abundant{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n=sc.nextInt();
        int s=0;
        for(int i=1;i<n;i++){
            if(n%i==0){  
                s+=i; 
            }
        }
        if(s>n){
            System.out.println(n+" is an Abundant Number.");
        }else{
            System.out.println(n+" is Not an Abundant Number.");
        }
    }
}
