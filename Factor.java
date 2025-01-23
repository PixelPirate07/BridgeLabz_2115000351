import java.util.*;
public class Factor{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int greatfactor=1;
        for(int i=n-1;i>1;i--){
            if(n%i==0){
                greatfactor=i;
                break;
            }
        }
        System.out.println(greatfactor);
    }
}
