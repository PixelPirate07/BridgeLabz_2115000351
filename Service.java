import java.util.*;
public class Service{
    public static double[][] generateSalaryandService(){
        double[][] data=new double[10][2];
        for(int i=0;i<10;i++){
            data[i][0]=Math.random()*90000+10000;
            data[i][1]=Math.random()*10;
        }
        return data;
    }
    public static double[][] calculate(double[][] data){
        double[][] result=new double[10][2];
        for(int i=0;i<10;i++){
            double percent;
            if(data[i][1]>5){
                percent=0.05;
            }
            else{
                percent=0.02;
            }
            result[i][0]=data[i][0]*percent; 
            result[i][1]=data[i][0]+result[i][0];
        }
        return result;
    }
    public static void DisplaySummary(double[][] data, double[][] newSalaryAndBonus){
        double totaloldsalary=0,totalnewsalary=0,totalbonus=0;
        for(int i=0;i<10;i++){
            double oldsalary=data[i][0];
            double years=data[i][1];
            double bonus=newSalaryAndBonus[i][0];
            double newsalary=newSalaryAndBonus[i][1];
            totaloldsalary+=oldsalary;
            totalnewsalary+=newsalary;
            totalbonus+=bonus;
            System.out.println("Employee "+(i+1));
            System.out.println("Old Salary  "+oldsalary);
            System.out.println("Years of Service "+years);
            System.out.println("Bonus "+bonus);
            System.out.println("New Salary "+newsalary);
            System.out.println();
        }
        System.out.println("Total Old Salary "+totaloldsalary);
        System.out.println("Total New Salary "+totalnewsalary);
        System.out.println("Total Bonus Amount "+totalbonus);
    }
    public static void main(String args[]){
        double[][] data=generateSalaryandService();
        double[][] newSalaryAndBonus=calculate(data);
        DisplaySummary(data,newSalaryAndBonus);
    }
}