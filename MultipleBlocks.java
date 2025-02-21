import java.util.*;
public class MultipleBlocks{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        try{
            System.out.print("Enter the size of the array ");
            int size=sc.nextInt();
            Integer[] array=new Integer[size];
            System.out.println("Enter array elements ");
            for(int i=0;i<size;i++){
                array[i]=sc.nextInt();
            }
            System.out.print("Enter index to retrieve ");
            int index=sc.nextInt();
            System.out.println("Value at index "+index+": "+array[index]);
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Invalid index");
        }catch(NullPointerException e){
            System.out.println("Array is not initialized");
        }catch(InputMismatchException e){
            System.out.println("Please enter a valid number");
        }
    }
}
