import java.util.*;
public class NumberChecker2{
    public static int Count(int num){
        int c=0;
        while(num>0){
            num/=10;
            c++;
        }
        return c;
    }
    public static int[] Store(int num) {
        int[] digits=new int[Count(num)];
        int i=digits.length-1;
        while(num>0){
            digits[i]=num % 10;
            num/=10;
            i--;
        }
        return digits;
    }
    public static int SumOfDigits(int num){
        int[] digits=Store(num);
        int s=0;
        for (int i=0;i<digits.length;i++){
            s+=i;
        }
        return s;
    }
    public static int SumOfSquaresOfDigits(int num){
        int[] digits = Store(num);
        int s=0;
        for (int i=0;i<digits.length;i++){
            s+=Math.pow(i,2);
        }
        return s;
    }
    public static boolean IsHarshad(int num){
        int s=SumOfDigits(num);
        return num%s==0;
    }
    public static int[][] FrequencyOfDigits(int num){
        int[] digits=Store(num);
        int[][] frequency = new int[10][2];
        for(int i=0;i<10;i++) {
            frequency[i][0] = i;
        }
        for(int digit : digits) {
            frequency[digit][1]++;
        }
        return frequency;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number ");
        int n=sc.nextInt();
        System.out.println("Count of digits "+Count(n));
        System.out.println("Digits array "+Arrays.toString(Store(n)));
        System.out.println("Sum of digits "+SumOfDigits(n));
        System.out.println("Sum of squares of digits "+SumOfSquaresOfDigits(n));
        System.out.println("Is Harshad number? "+(IsHarshad(n)?"Yes":"No"));
        int[][] frequency=FrequencyOfDigits(n);
        System.out.println("Frequency of digits:");
        for(int i=0;i<10;i++){
            if(frequency[i][1]>0){
                System.out.println("Digit: "+frequency[i][0]+", Frequency: "+frequency[i][1]);
            }
        }
    }
}
