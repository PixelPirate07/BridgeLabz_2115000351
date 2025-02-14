import java.util.*;
public class MergeSort{
    public static void Sorting(int[] arr,int left,int right){
        if(left<right){
            int mid=left+(right-left)/2;
            Sorting(arr,left,mid);
            Sorting(arr,mid+1,right);
            merge(arr,left,mid,right);
        }
    }
    public static void merge(int[] arr,int left,int mid,int right){
        int n1=mid-left+1;
        int n2=right-mid;
        int[] leftArr=new int[n1];
        int[] rightArr=new int[n2];
        for(int i=0;i<n1;i++){
            leftArr[i]=arr[left+i];
        }
        for(int j=0;j<n2;j++){
            rightArr[j]=arr[mid+1+j];
        }
        int i=0,j=0;
        int k=left;
        while (i < n1 && j < n2) {
            if(leftArr[i]<=rightArr[j]){
                arr[k]=leftArr[i];
                i++;
            } 
            else{
                arr[k]=rightArr[j];
                j++;
            }
            k++;
        }
        while(i<n1){
            arr[k]=leftArr[i];
            i++;
            k++;
        }
        while(j<n2){
            arr[k]=rightArr[j];
            j++;
            k++;
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of book prices ");
        int n=sc.nextInt();
        int[] prices=new int[n];
        System.out.println("Enter price");
        for(int i=0;i<n;i++){
            prices[i]=sc.nextInt();
        }
        System.out.println("Book prices before sorting");
        for(int i=0;i<n;i++){
            System.out.print(prices[i]+" ");
        }
        Sorting(prices,0,n-1);
        System.out.println("\nBook prices after sorting");
        for(int i=0;i<n;i++){
            System.out.print(prices[i]+" ");
        }
    }
}
