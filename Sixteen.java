import java.util.*;
public class Sixteen{
    public static void main(String[] args) {
        int n;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int max=(n*(n-1))/2;
        System.out.println("The maximum number of handshakes among "+n+" students is "+max);
    }
}
