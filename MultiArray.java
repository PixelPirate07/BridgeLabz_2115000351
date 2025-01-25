import java.util.*;
public class MultiArray{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter rows");
        int row=sc.nextInt();
        System.out.println("Enter columns");
        int col=sc.nextInt();
        int[] oned=new int[row*col];
        int index=0;
        int[][] twod=new int[row][col];
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                System.out.println("Enter :-");
                twod[i][j]=sc.nextInt();
                oned[index]=twod[i][j];
                index++;
            }
        }
        for(int i=0;i<row*col;i++){
            System.out.println(oned[i]);
        }
        
    }
}