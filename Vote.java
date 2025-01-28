import java.util.*;
public class Vote{
    public static boolean canvote(int age) {
        if(age<0){
            return false;
        }
        return age>=18;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] arr=new int[10];
        for(int i=0;i<arr.length;i++){
            System.out.println("Enter age for student "+(i+1));
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<arr.length;i++){
            boolean can=canvote(arr[i]);
            if(arr[i]<0){
                System.out.println("Student "+(i+1)+" has an invalid age and cannot vote");
            }else{
                if(can==true){
                    System.out.println("Student "+(i+1)+" can vote");
                }
                else{
                    System.out.println("Student "+(i+1)+" cannot vote");
                }
            }
        }
    }
}
