import java.util.*;
public class BubbleSort{
    public static void Sorting(int[] arr){
        int n=arr.length;
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of students ");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter "+n+" marks");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Marks before sorting");
        for(int num:arr){
            System.out.print(num+" ");
        }
        Sorting(arr);
        System.out.println("\nafter sorting");
        for(int num:arr){
            System.out.print(num+" ");
        }
    }
}
