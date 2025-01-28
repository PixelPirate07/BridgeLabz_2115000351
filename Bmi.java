import java.util.*;
public class Bmi{
    public static double calculate(double weight,double height){
        height/=100;
        return weight/(height*height);
    }
    public static String status(double bmi){
        if(bmi<=18.4){
            return "Underweight";
        } 
        else if(bmi>=18.5 && bmi<=24.9){
            return "Normal";
        } 
        else if(bmi>=25 && bmi<=39.9){
            return "Overweight";
        } 
        else{
            return "Obese";
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double[][] data=new double[10][3];
        String[] status=new String[10];
        for(int i=0;i<10;i++){
            System.out.println("Enter weight for "+(i+1));
            data[i][0]=sc.nextDouble();
            System.out.println("Enter height (cm) for person "+(i+1));
            data[i][1]=sc.nextDouble();
            data[i][2]=calculate(data[i][0],data[i][1]);
            status[i]=status(data[i][2]);
        }
        for(int i=0;i<10;i++){
            System.out.println("Person " +(i+1)+":- Height = "+data[i][1]+", Weight = "+data[i][0]+", BMI = "+data[i][2]+",status = "+status[i]);
        }
    }
}
