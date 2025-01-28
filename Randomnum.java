import java.util.*;
public class Randomnum{
    public static int[] generate(int size){
        int[] randomnumbers=new int[size];
        for(int i=0;i<size;i++){
            randomnumbers[i]=1000+(int)(Math.random()*9000);
        }
        return randomnumbers;
    }
    public static double[] findAverage(int[] num){
        int min=num[0];
        int max=num[0];
        int s=0;
        for(int n:num){
            s+=n;
            min=Math.min(min,n);
            max=Math.max(max,n);
        }
        double av=(double)s/num.length;
        return new double[]{av,min,max};
    }

    public static void main(String[] args) {
        int[] randomnumbers=generate(5);
        double[] result=findAverage(randomnumbers);
        System.out.println("Random Numbers are "+Arrays.toString(randomnumbers));
        System.out.printf("Average is "+result[0]+",Min is "+result[1]+",Max is "+result[2]);
    }
}
