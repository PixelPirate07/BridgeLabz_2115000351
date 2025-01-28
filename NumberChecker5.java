import java.util.*;
public class NumberChecker5{
    public static int[] FindFactors(int num) {
        int c=0;
        for (int i=1;i<=num;i++){
            if (num % i == 0){
                c++;
            }    
        }
        int[] factors=new int[c];
        int index=0;
        for (int i=1;i<=num;i++) {
            if (num%i==0) {
                factors[index++]=i;
            }
        }
        return factors;
    }
    public static int GreatestFactor(int num){
        int[] factors=FindFactors(num);
        return factors[factors.length-2];
    }
    public static int SumOfFactors(int num){
        int[] factors = FindFactors(num);
        int s=0;
        for (int i=0;i<factors.length;i++){
            s+=factors[i];
        }
        return s;
    }
    public static int ProductOfFactors(int num){
        int[] factors=FindFactors(num);
        int p=1;
        for(int i=0;i<factors.length;i++){
            p*=factors[i];
        }
        return p;
    }
    public static long ProductOfCubesOfFactors(int num){
        int[] factors=FindFactors(num);
        long p=1;
        for(int i=0;i<factors.length;i++){
            p*=Math.pow(factors[i],3);
        }
        return p;
    }
    public static boolean IsPerfectNumber(int num){
        int[] factors=FindFactors(num);
        int s=0;
        for(int i=0;i<factors.length-1;i++){
            s+=factors[i];
        }
        return s==num;
    }
    public static boolean IsAbundantNumber(int num){
        int[] factors=FindFactors(num);
        int s=0;
        for (int i=0;i<factors.length-1;i++){
            s+=factors[i];
        }
        return s>num;
    }

    public static boolean IsDeficientNumber(int num){
        int[] factors=FindFactors(num);
        int s=0;
        for(int i=0;i<factors.length-1; i++){
            s+=factors[i];
        }
        return s<num;
    }
    public static boolean IsStrongNumber(int num) {
        int temp=num,s=0;
        while(temp>0) {
            int digit=temp%10;
            s+=Factorial(digit);
            temp/=10;
        }
        return s==num;
    }
    private static int Factorial(int num){
        int fact=1;
        for(int i=1;i<=num;i++) {
            fact*=i;
        }
        return fact;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number ");
        int n=sc.nextInt();
        System.out.println("Factors "+Arrays.toString(FindFactors(n)));
        System.out.println("Greatest factor: " +GreatestFactor(n));
        System.out.println("Sum of factors " +SumOfFactors(n));
        System.out.println("Product of factors " +ProductOfFactors(n));
        System.out.println("Product of cubes of factors " +ProductOfCubesOfFactors(n));
        System.out.println("Is perfect number? " +(IsPerfectNumber(n)?"Yes":"No"));
        System.out.println("Is abundant number? " +(IsAbundantNumber(n)?"Yes":"No"));
        System.out.println("Is deficient number? " +(IsDeficientNumber(n)?"Yes":"No"));
        System.out.println("Is strong number? "+(IsStrongNumber(n)?"Yes":"No"));
    }
}
import java.util.*;
public class NumberChecker5{
    public static int[] FindFactors(int num) {
        int c=0;
        for (int i=1;i<=num;i++){
            if (num % i == 0){
                c++;
            }    
        }
        int[] factors=new int[c];
        int index=0;
        for (int i=1;i<=num;i++) {
            if (num%i==0) {
                factors[index++]=i;
            }
        }
        return factors;
    }
    public static int GreatestFactor(int num){
        int[] factors=FindFactors(num);
        return factors[factors.length-2];
    }
    public static int SumOfFactors(int num){
        int[] factors = FindFactors(num);
        int s=0;
        for (int i=0;i<factors.length;i++){
            s+=factors[i];
        }
        return s;
    }
    public static int ProductOfFactors(int num){
        int[] factors=FindFactors(num);
        int p=1;
        for(int i=0;i<factors.length;i++){
            p*=factors[i];
        }
        return p;
    }
    public static long ProductOfCubesOfFactors(int num){
        int[] factors=FindFactors(num);
        long p=1;
        for(int i=0;i<factors.length;i++){
            p*=Math.pow(factors[i],3);
        }
        return p;
    }
    public static boolean IsPerfectNumber(int num){
        int[] factors=FindFactors(num);
        int s=0;
        for(int i=0;i<factors.length-1;i++){
            s+=factors[i];
        }
        return s==num;
    }
    public static boolean IsAbundantNumber(int num){
        int[] factors=FindFactors(num);
        int s=0;
        for (int i=0;i<factors.length-1;i++){
            s+=factors[i];
        }
        return s>num;
    }

    public static boolean IsDeficientNumber(int num){
        int[] factors=FindFactors(num);
        int s=0;
        for(int i=0;i<factors.length-1; i++){
            s+=factors[i];
        }
        return s<num;
    }
    public static boolean IsStrongNumber(int num) {
        int temp=num,s=0;
        while(temp>0) {
            int digit=temp%10;
            s+=Factorial(digit);
            temp/=10;
        }
        return s==num;
    }
    private static int Factorial(int num){
        int fact=1;
        for(int i=1;i<=num;i++) {
            fact*=i;
        }
        return fact;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number ");
        int n=sc.nextInt();
        System.out.println("Factors "+Arrays.toString(FindFactors(n)));
        System.out.println("Greatest factor: " +GreatestFactor(n));
        System.out.println("Sum of factors " +SumOfFactors(n));
        System.out.println("Product of factors " +ProductOfFactors(n));
        System.out.println("Product of cubes of factors " +ProductOfCubesOfFactors(n));
        System.out.println("Is perfect number? " +(IsPerfectNumber(n)?"Yes":"No"));
        System.out.println("Is abundant number? " +(IsAbundantNumber(n)?"Yes":"No"));
        System.out.println("Is deficient number? " +(IsDeficientNumber(n)?"Yes":"No"));
        System.out.println("Is strong number? "+(IsStrongNumber(n)?"Yes":"No"));
    }
}
