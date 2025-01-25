import java.util.*;
public class Largest{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number");
        int n=sc.nextInt();
        int maxdigit=10;
        int[] digit=new int[maxdigit];
        int index=0;
        while(n!=0){
            if(index==maxdigit){
                break;
            }
            digit[index]=n%10;
            n/=10;
            index++;
        }
        int largest=0;
        int secondlargest=0;
        for(int i=0;i<index;i++){
            if(digit[i]>largest){
                secondlargest=largest;
                largest=digit[i];
            } 
            else if(digit[i]>secondlargest && digit[i]!=largest){
                secondlargest=digit[i];
            }
        }
        System.out.println("The largest digit is "+largest);
        System.out.println("The second largest digit is "+secondlargest);
    }
}
