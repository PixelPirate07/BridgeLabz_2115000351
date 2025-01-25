import java.util.*;
public class Bmi{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no. of persons");
        int n=sc.nextInt();
        double[] weight=new double[n];
        double[] height=new double[n];
        for(int i=0;i<n;i++){
            System.out.println("Enter weight:");
            weight[i]=sc.nextDouble();
            System.out.println("Enter height:");
            height[i]=sc.nextDouble();
        }
        double[] bmi=new double[n];
        for(int i=0;i<n;i++){
            bmi[i]=weight[i]/((height[i]*0.01)*(height[i]*0.01));
            if(bmi[i]<=18.4){
                System.out.println("Person "+(i+1)+" is Underweight");
            }
            else if(bmi[i]>=18.5 && bmi[i]<=24.9){
                System.out.println("Person "+(i+1)+" is Normal");
            }
            else if(bmi[i]>=25 && bmi[i]<=39.9){
                System.out.println("Person "+(i+1)+" is Overweight");
            }
            else if(bmi[i]>=40){
                System.out.println("Person "+(i+1)+" is Obese");
            }
        }
    }
}