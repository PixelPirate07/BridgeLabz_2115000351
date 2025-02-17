import java.util.*;
public class BubbleMergeQuickSort{
    public static void bubbleSort(int[] arr){
        int n = arr.length;
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
    public static void mergeSort(int[] arr){
        if(arr.length<2) return;
        int mid=arr.length/2;
        int[] left= new int[mid];
        int[] right= new int[arr.length-mid];
        System.arraycopy(arr,0,left,0,mid);
        System.arraycopy(arr,mid,right,0,arr.length-mid);
        mergeSort(left);
        mergeSort(right);
        merge(arr,left,right);
    }
    public static void merge(int[] arr,int[] left,int[] right){
        int i=0,j=0,k=0;
        while(i<left.length && j<right.length){
            if(left[i]<=right[j]){
                arr[k++]=left[i++];
            } 
            else{
                arr[k++]=right[j++];
            }
        }
        while(i<left.length){
            arr[k++]=left[i++];
        }
        while(j<right.length){
            arr[k++]=right[j++];
        }
    }
    public static void quickSort(int[] arr,int low,int high){
        if(low<high){
            int pi=partition(arr,low,high);
            quickSort(arr,low,pi-1);
            quickSort(arr,pi+1,high);
        }
    }
    public static int partition(int[] arr,int low,int high){
        int pivot=arr[high];
        int i=low-1;
        for(int j=low;j<high;j++){
            if(arr[j]<pivot){
                i++;
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
        int temp=arr[i+1];
        arr[i+1]=arr[high];
        arr[high]=temp;
        return i+1;
    }
    public static int[] generateDataset(int size){
        Random rand=new Random();
        int[] dataset=new int[size];
        for(int i=0;i<size;i++){
            dataset[i]=rand.nextInt();
        }
        return dataset;
    }
    public static void main(String[] args){
        int[] sizes={1000,10000,1000000};
        for(int size:sizes){
            int[] dataset=generateDataset(size);
            long startTime=System.nanoTime();
            bubbleSort(dataset.clone());
            long endTime=System.nanoTime();
            System.out.println("Bubble Sort for size "+size+"is "+(endTime-startTime)/1000000.0);
            dataset=generateDataset(size);
            startTime=System.nanoTime();
            mergeSort(dataset.clone());
            endTime=System.nanoTime();
            System.out.println("Merge Sort for size "+size+"is "+(endTime-startTime)/1000000.0);
            dataset=generateDataset(size);
            startTime=System.nanoTime();
            quickSort(dataset.clone(),0,dataset.length-1);
            endTime=System.nanoTime();
            System.out.println("Quick Sort for size "+size+"is "+(endTime-startTime)/1000000.0);
            if(size==100000){
                System.out.println("Too big dataset for Bubble Sort");
                System.exit(0);
            }
        }
    }
}
