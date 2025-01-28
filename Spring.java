import java.util.*;
public class Spring{
    public boolean Springseason(int month,int day){
        if(month==3){
            if(day>=20){
                return true;
            }
        }
        if(month==6){
            if(day<=20){
                return true;
            }
        }
        if(month>3 && month<6){
            return true;
        }
        return false;
    }
	public static void main(String[] args){
	    Scanner sc=new Scanner(System.in);
	    Spring obj=new Spring();
	    System.out.println("Enter month");
	    int m=sc.nextInt();
	    System.out.println("Enter day");
	    int d=sc.nextInt();
	    boolean result=obj.Springseason(m,d);
	    System.out.println("Springseason is "+result);
	}
}
