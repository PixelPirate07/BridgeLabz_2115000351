public class IterativeRecursive{
    public static int fibonacciRecursive(int n){
        if(n<=1) return n;
        return fibonacciRecursive(n-1)+fibonacciRecursive(n-2);
    }
    public static int fibonacciIterative(int n){
        int a=0,b=1,sum;
        for(int i=2;i<=n;i++){
            sum=a+b;
            a=b;
            b=sum;
        }
        return b;
    }
    public static void main(String[] args){
        int[] fibonacciNumbers={10,30,50}; 
        for(int n:fibonacciNumbers){
            long startTime=System.nanoTime();
            int recursiveResult=fibonacciRecursive(n);
            long endTime=System.nanoTime();
            System.out.println("Recursive Fibonacci for "+n+" is "+(endTime-startTime)/1000000.0);
            startTime=System.nanoTime();
            int iterativeResult=fibonacciIterative(n);
            endTime=System.nanoTime();
            System.out.println("Iterative Fibonacci for "+n+" is "+(endTime-startTime)/1000000.0);
        }
    }
}
