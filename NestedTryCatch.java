import java.util.*;
public class NestedTryCatch{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        try{
            System.out.print("Enter the size of the array ");
            int size=sc.nextInt();
            int[] arr=new int[size];
            System.out.println("Enter array elements ");
            for(int i=0;i<size;i++){
                arr[i]=sc.nextInt();
            }
            System.out.print("Enter index to access ");
            int index=sc.nextInt();
            try{
                System.out.print("Enter divisor ");
                int divisor=sc.nextInt();
                int result=arr[index]/divisor;
                System.out.println("Result "+result);
            }catch(ArithmeticException e){
                System.out.println("Cannot divide by zero");
            }
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Invalid array index");
        }catch(InputMismatchException e){
            System.out.println("Error Please enter a valid number");
        }
    }
}
