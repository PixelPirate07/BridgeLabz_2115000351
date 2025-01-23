import java.util.*;
public class Bmi{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter weight:");
        double weight=sc.nextDouble();
        System.out.println("Enter height:");
        double height=sc.nextDouble();
        double bmi=weight/(height*height*0.01*0.01);
        if(bmi<=18.4){
            System.out.println("Underweight");
        }
        else if(bmi>=18.5 && bmi<=24.9){
            System.out.println("Normal");
        }
        else if(bmi>=25 && bmi<=39.9){
            System.out.println("Overweight");
        }
        else if(bmi>=40){
            System.out.println("Obese");
        }
    }
}
