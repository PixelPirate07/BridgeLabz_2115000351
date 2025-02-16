import java.util.*;
public class BinarySearchMatrix{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no. of rows");
        int rows=sc.nextInt();
        System.out.println("Enter no. of columns");
        int cols=sc.nextInt();
        int[][] arr=new int[rows][cols];
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                System.out.println("Enter element");
                arr[i][j]=sc.nextInt();
            }
        }
        System.out.println("Enter target");
        int target=sc.nextInt();
        boolean found=searchArr(arr,target);
        System.out.println(found);
    }
    public static boolean searchArr(int[][] arr,int target){
        int rows=arr.length,cols=arr[0].length;
        int left=0,right=rows*cols-1;
        while(left<=right){
            int mid=left+(right-left)/2;
            int midValue=arr[mid/cols][mid%cols];
            if(midValue==target){
                return true;
            } 
            else if(midValue<target){
                left=mid+1;
            } 
            else{
                right=mid-1;
            }
        }
        return false;
    }
}
