import java.util.*;
public class FizzBuzz{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number");
        int num=sc.nextInt();
        String[] arr=new String[num];
        if(num>0){
            for(int i=1;i<=num;i++){
                if(i%3==0 && i%5==0){
                    arr[i-1]="FizzBuzz";
                }
                else if(i%3==0){
                    arr[i-1]="Fizz";
                }
                else if(i%5==0){
                    arr[i-1]="Buzz";
                }
                else{
                    arr[i-1]=String.valueOf(i);
                }    
            }    
        }
        else{
            System.out.println("Enter positive integer");
        }
        for(int i=1;i<=num;i++){
            System.out.println("Position "+i+"= "+arr[i-1]);
        }
        
    }
}