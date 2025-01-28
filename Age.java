import java.util.*;
public class Age{
    public static String Youngest(String[] name,int[] age) {
        int minAge=0;
        for(int i=1;i<age.length;i++) {
            if(age[i]<age[minAge]) {
                minAge=i;
            }
        }
        return name[minAge];
    }
    public static String Tallest(String[] name,double[] height){
        int maxHeight=0;
        for(int i=1;i<height.length;i++){
            if(height[i]>height[maxHeight]){
                maxHeight=i;
            }
        }
        return name[maxHeight];
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String[] name={"Amar","Akbar","Anthony"};
        int[] age=new int[3];
        double[] height=new double[3];
        for(int i=0;i<name.length;i++){
            System.out.println("Enter age for "+name[i]);
            age[i]=sc.nextInt();
            System.out.println("Enter height for "+name[i]);
            height[i]=sc.nextDouble();
        }
        String young=Youngest(name,age);
        String tall=Tallest(name,height);
        System.out.println("youngest is "+young);
        System.out.println("tallest is "+tall);
    }
}
