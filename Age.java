import java.util.*;
public class Age{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    String[] name={"Amar","Akbar","Anthony"};
	    int[] age=new int[3];
	    int[] height=new int[3];
	    for(int i=0;i<3;i++){
	       System.out.println("Enter age:- ");
	       age[i]=sc.nextInt();
	       System.out.println("Enter height:- ");
	       height[i]=sc.nextInt();
	    }
	    int young=0;
	    int tall=0;
	    for(int i=0;i<3;i++){
	       if(age[i]<age[young]){
	           young=i;
	       }
	       if(height[i]>height[tall]){
	           tall=i;
	       }
	    }
	    System.out.println("Tallest is "+name[tall]);
	    System.out.println("Youngest is "+name[young]);
	}
}
