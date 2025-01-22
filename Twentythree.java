import java.util.*;
public class Twentythree{
    public static void main(String[] args) {
        int n1,n2,temp;
        Scanner sc=new Scanner(System.in);
        n1=sc.nextInt();
        n2=sc.nextInt();
        temp=n1;
        n1=n2;
        n2=temp;
        System.out.println("The swapped numbers are "+n1+" and "+n2);
    }
}
