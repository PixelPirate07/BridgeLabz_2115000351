import java.util.*;
public class Factors{
    public static int[] findFactors(int num){
        int c=0;
        for(int i=1;i<=num;i++){
            if (num%i==0){
                c++;
            }
        }
        int[] factors = new int[c];
        int index=0;
        for(int i=1;i<=num;i++) {
            if(num%i==0){
                factors[index++]=i;
            }
        }
        return factors;
    }
    public static int sumFactors(int[] factors){
        int s=0;
        for(int factor:factors){
            s=s+factor;
        }
        return s;
    }
    public  static long productFactors(int[] factors){
        long p=1;
        for(int factor:factors){
            p=p*factor;
        }
        return p;
    }
    public static int sumofsquare(int[] factors) {
        int sum=0;
        for(int factor:factors) {
            sum=sum+(int)Math.pow(factor,2);
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number ");
        int n=sc.nextInt();

        int[] factors = findFactors(n);

        System.out.print("Factors are ");
        for (int factor:factors) {
            System.out.print(factor + " ");
        }
        int sum=sumFactors(factors);
        long product=productFactors(factors);
        int sumsquares=sumofsquare(factors);
        System.out.println("Sum of Factors is "+sum);
        System.out.println("Product of Factors is "+product);
        System.out.println("Sum of Square of Factors is "+sumsquares);
    }
}
