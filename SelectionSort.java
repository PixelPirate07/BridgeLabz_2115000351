import java.util.*;
public class SelectionSort{
    public static void Sorting(int[] arr){
        int n=arr.length;
        for(int i=0;i<n-1;i++){
            int minIndex=i;
            for(int j=i+1;j<n;j++){
                if(arr[j]<arr[minIndex]){
                    minIndex=j;
                }
            }
            int temp=arr[minIndex];
            arr[minIndex]=arr[i];
            arr[i]=temp;
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of exam scores ");
        int n=sc.nextInt();
        int[] scores=new int[n];
        System.out.println("Enter exam scores");
        for(int i=0;i<n;i++){
            scores[i]=sc.nextInt();
        }
        System.out.println("Exam scores before sorting");
        for(int i=0;i<n;i++){
            System.out.print(scores[i]+" ");
        }
        Sorting(scores);
        System.out.println("\nExam scores after sorting");
        for(int i=0;i<n;i++){
            System.out.print(scores[i]+" ");
        }
    }
}
