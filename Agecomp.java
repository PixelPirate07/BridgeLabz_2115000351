import java.util.*;
public class Agecomp{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter height Amar:");
        int amar=sc.nextInt();
        System.out.println("Enter height Akhbar:");
        int akhbar=sc.nextInt();
        System.out.println("Enter height Anthony:");
        int anthony=sc.nextInt();
        if(amar>akhbar && amar>anthony){
            System.out.println("Amar is tallest");
        }
        else if(akhbar>amar && akhbar>anthony){
            System.out.println("Akhbar is tallest");
        }
        else if(anthony>amar && anthony>akhbar){
            System.out.println("Anthony is tallest");
        }
        if(amar<akhbar && amar<anthony){
            System.out.println("Amar is youngest");
        }
        else if(akhbar<amar && akhbar<anthony){
            System.out.println("Akhbar is youngest");
        }
        else if(anthony<amar && anthony<akhbar){
            System.out.println("Anthony is youngest");
        }
        if(amar>akhbar && amar>anthony){
            System.out.println("Amar is tallest");
        }
        else if(akhbar>amar && akhbar>anthony){
            System.out.println("Akhbar is tallest");
        }
        else{
            System.out.println("All are equal");
        }
    }
}
