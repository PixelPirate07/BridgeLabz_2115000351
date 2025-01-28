import java.util.*;
public class Handshake2{
    public int Maxhandshake(int n){
        return (n*(n-1))/2;
    }
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    Handshake obj=new Handshake();
	    System.out.println("number");
	    int num=sc.nextInt();
	    int handshake=obj.Maxhandshake(num);
	    System.out.println("Max no. of handshakes is "+handshake);
	}
}
