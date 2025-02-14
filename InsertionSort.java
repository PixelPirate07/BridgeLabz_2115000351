import java.util.*;
public class InsertionSort{
    public static void Sorting(int[] arr){
        int n=arr.length;
        for(int i=1;i<n;i++){
            int key=arr[i];
            int j=i-1;
            while(j>=0 && arr[j]>key){
                arr[j+1]=arr[j];
                j=j-1;
            }
            arr[j+1]=key;
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of employee IDs ");
        int n=sc.nextInt();
        int[] employeeIDs=new int[n];
        System.out.println("Enter employee ID");
        for(int i=0;i<n;i++){
            employeeIDs[i]=sc.nextInt();
        }
        System.out.println("Employee IDs before sorting");
        for(int i=0;i<n;i++){
            System.out.print(employeeIDs[i]+" ");
        }
        Sorting(employeeIDs);
        System.out.println("\nEmployee IDs after sorting");
        for(int i=0;i<n;i++){
            System.out.print(employeeIDs[i]+" ");
        }
    }
}
