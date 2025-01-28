import java.util.*;
public class Grade{
    public static double[][] generate(int n){
        Random random=new Random();
        double[][] scores=new double[n][3];
        for(int i=0;i<n;i++){
            scores[i][0]=random.nextInt(91)+10;
            scores[i][1]=random.nextInt(91)+10;
            scores[i][2]=random.nextInt(91)+10;
        }
        return scores;
    }
    public static double[][] calculate(double[][] score){
        int n=score.length;
        double[][] result=new double[n][3];
        for(int i=0;i<n;i++){
            double total=score[i][0]+score[i][1]+score[i][2];
            double av=total/3;
            double percent=Math.round((total/300)*100*100)/100;
            result[i][0]=total;
            result[i][1]=Math.round(av*100)/100;
            result[i][2]=percent;
        }
        return result;
    }
    public static void display(double[][] score, double[][] result){
        System.out.println("Student\tMaths\tPhysics\tChemistry\tTotal\tAverage\tPercentage");
        for (int i=0;i<score.length;i++) {
            System.out.println((i + 1)+"\t"+score[i][0]+"\t"+score[i][1]+"\t"+score[i][2]+"\t\t"+result[i][0]+"\t"+result[i][1]+"\t"+result[i][2]);
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of students ");
        int n=sc.nextInt();
        double[][] score=generate(n);
        double[][] result=calculate(score);
        display(score,result);
    }
}
