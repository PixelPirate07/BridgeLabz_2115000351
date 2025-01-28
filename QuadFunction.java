import java.util.*;
public class QuadFunction{
    public static double[] Roots(double a,double b,double c){
        double d=Math.pow(b,2)-4*a*c;
        if(d>0){
            double root1=(-b+Math.sqrt(d))/(2*a);
            double root2=(-b-Math.sqrt(d))/(2*a);
            return new double[]{root1,root2};
        } 
        else if(d==0){
            double root=-b/(2*a);
            return new double[]{root};
        } 
        else {
            return new double[]{};
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a ");
        double a=sc.nextDouble();
        System.out.println("Enter b ");
        double b=sc.nextDouble();
        System.out.println("Enter c");
        double c=sc.nextDouble();
        double[] roots=Roots(a,b,c);
        if(roots.length==2){
            System.out.printf("The equation has two roots are "+roots[0]+" "+roots[1]);
        } 
        else if(roots.length==1){
            System.out.printf("The equation has one root is "+roots[0]);
        } 
        else{
            System.out.println("The equation has no real roots");
        }
    }
}
