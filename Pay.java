import java.util.*;
public class Pay{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    double[] sal=new double[10];
	    double[] year=new double[10];
	    double oldsal=0;
	    double newsals=0;
	    double totalbonus=0;
	    for(int i=0;i<10;i++){
	        System.out.println("Enter salary");
	        sal[i]=sc.nextDouble();
	        System.out.println("Enter years");
	        year[i]=sc.nextDouble();
	        if(sal[i]<0 || year[i]<0){
	            System.out.println("Enter again");
	            i--;
	            continue;
	        }
	    }
	    double[] bonus=new double[10];
	    double[] newsal=new double[10];
	    for(int i=0;i<10;i++){
	        double bonuspercent;
	        if(year[i]>5){
	            bonuspercent=0.05;
	        }
	        else{
	            bonuspercent=0.02;
	        }
	        bonus[i]=sal[i]*bonuspercent;
	        newsal[i]=bonus[i]+sal[i];
	        totalbonus+=bonus[i];
	        oldsal+=sal[i];
	        newsals+=newsal[i];  
	    }
	    System.out.println("Total Old salary is "+oldsal);
	    System.out.println("Total New salary is "+newsal);
	    System.out.println("Total bonus is "+bonus);	
	}
}
