import java.util.*;
public class MultiBmi{
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter number of persons:");
        int n=sc.nextInt();
        double[][] person=new double[n][3];
        String[] status=new String[n];
        for (int i=0;i<n;i++) {
            System.out.println("Enter weight");
            double weight=sc.nextDouble();
            while(weight<=0){
                System.out.println("Enter positive weight");
                weight=sc.nextDouble();
            }
            person[i][0]=weight;
            System.out.println("Enter height");
            double height = sc.nextDouble();
            while(height<=0){
                System.out.println("Enter positive height");
                height=sc.nextDouble();
            }
            person[i][1]=height;
            double bmi=weight/((height*0.01)*(height*0.01)); 
            person[i][2]=bmi;
            if(bmi<=18.4){
                status[i]="Underweight";
            } 
            else if(bmi>=18.5 && bmi<=24.9){
                status[i]="Normal";
            } 
            else if (bmi >= 25 && bmi <= 39.9){
                status[i]="Overweight";
            } 
            else{
                status[i]="Obese";
            }
        }
        for (int i=0;i<n;i++) {
            System.out.println("Person "+(i + 1)+" data is ");
            System.out.println("Weight= "+person[i][0]);
            System.out.println("Height= "+person[i][1]);
            System.out.println("BMI= "+person[i][2]);
            System.out.println("Status= "+status[i]);
            System.out.println();
        }
    }
}
