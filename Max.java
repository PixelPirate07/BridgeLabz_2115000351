import java.util.*;
public class Max{
    public static void main(String[] args) {
        int n1=getinput("Enter the first number ");
        int n2=getinput("Enter the second number ");
        int n3=getinput("Enter the third number ");
        int max=findMax(n1,n2,n3);
        System.out.println("The maximum is "+max);
    }
    public static int getinput(String prompt) {
        Scanner sc=new Scanner(System.in);
        System.out.println(prompt);
        return sc.nextInt();
    }
    public static int findMax(int n1,int n2,int n3){
        int max=n1;
        if(n2>max){
            max=n2;
        }
        if(n3>max){
            max=n3;
        }
        return max;
    }
}
