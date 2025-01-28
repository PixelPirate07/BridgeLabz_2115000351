import java.util.*;
public class NumberChecker4{
    public static boolean IsPrime(int num){
        if (num<=1){
            return false;
        }    
        for(int i=2;i<=Math.sqrt(num);i++){
            if(num%i==0){
                return false;
            } 
        }
        return true;
    }
    public static boolean IsNeonNumber(int num){
        int square=num*num;
        int sumOfDigits=0;
        while(square>0){
            sumOfDigits+=square%10;
            square/=10;
        }
        return sumOfDigits==num;
    }
    public static boolean IsSpyNumber(int num){
        int s=0,p=1;
        while(num>0){
            int digit=num%10;
            s+=digit;
            p*=digit;
            num/=10;
        }
        return s==p;
    }
    public static boolean IsAutomorphicNumber(int num){
        int square=num*num;
        String numStr=String.valueOf(num);
        String squareStr=String.valueOf(square);
        return squareStr.endsWith(numStr);
    }
    public static boolean IsBuzzNumber(int num) {
        return num%7==0||num%10==7;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number ");
        int n=sc.nextInt();
        System.out.println("Is prime number? "+(IsPrime(n)?"Yes":"No"));
        System.out.println("Is neon number? "+(IsNeonNumber(n)?"Yes":"No"));
        System.out.println("Is spy number? "+(IsSpyNumber(n)?"Yes":"No"));
        System.out.println("Is automorphic number? "+(IsAutomorphicNumber(n)?"Yes":"No"));
        System.out.println("Is buzz number? "+(IsBuzzNumber(n)?"Yes":"No"));
    }
}
