import java.util.*;
public class NumberChecker3{
    public static int Count(int num){
        int c=0;
        while(num>0){
            num/=10;
            c++;
        }
        return c;
    }
    public static int[] Store(int num){
        int[] digits=new int[Count(num)];
        int i=digits.length-1;
        while(num>0){
            digits[i]=num%10;
            num/=10;
            i--;
        }
        return digits;
    }
    public static int[] Reverse(int[] digits){
        int[] reversed=new int[digits.length];
        for (int i=0;i<digits.length;i++) {
            reversed[i]=digits[digits.length-1-i];
        }
        return reversed;
    }
    public static boolean AreArraysEqual(int[] arr1,int[] arr2){
        if(arr1.length!=arr2.length){
            return false;
        }
        for(int i=0;i<arr1.length;i++){
            if(arr1[i]!=arr2[i]){
                return false;
            }
        }
        return true;
    }
    public static boolean IsPalindrome(int num){
        int[] digits=Store(num);
        int[] reversed=Reverse(digits);
        return AreArraysEqual(digits,reversed);
    }
    public static boolean IsDuckNumber(int num){
        int[] digits=Store(num);
        for(int i=0;i<digits.length;i++){
            if(digits[i]==0){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number ");
        int n = sc.nextInt();
        System.out.println("Count of digits: "+Count(n));
        System.out.println("Digits array " +Arrays.toString(Store(n)));
        int[] digits=Store(n);
        System.out.println("Reversed digits array "+Arrays.toString(Reverse(digits)));
        System.out.println("Is palindrome? "+(IsPalindrome(n)?"Yes":"No"));
        System.out.println("Is duck number? "+(IsDuckNumber(n)?"Yes":"No"));
    }
}
