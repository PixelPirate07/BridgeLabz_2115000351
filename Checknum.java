import java.util.*;
public class Checknum{
    public static boolean isPositive(int num){
        return num>=0;
    }
    public static boolean isEven(int num){
        return num%2==0;
    }
    public static int compare(int num1,int num2){
        if(num1>num2){
            return 1;
        }
        else if(num1==num2){
            return 0;
        }
        else{
            return -1;
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] num=new int[5];
        for(int i=0;i<5;i++){
            System.out.println("Enter no. "+(i+1));
            num[i]=sc.nextInt();
        }
        for(int i=0;i<5;i++){
            if(isPositive(num[i])){
                System.out.print("Number "+num[i]+ " is positive and ");
                if(isEven(num[i])){
                    System.out.println("Even");
                }
                else{
                    System.out.println("Odd");
                }
            }else{
                System.out.println("Number "+num[i]+" is negative");
            }
        }
        int comparison=compare(num[0],num[4]);
        if(comparison==1){
            System.out.println("The first element is larger");
        } 
        else if(comparison==0){
            System.out.println("They are equal");
        } 
        else{
            System.out.println("The first element is smaller");
        }
    }
}
