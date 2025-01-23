import java.util.*;
public class Mul{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n=sc.nextInt();
        for(int i=6;i<=9;i++){
            System.out.println(n+" * "+i+" = "+(n*i));
        }
    }
}
