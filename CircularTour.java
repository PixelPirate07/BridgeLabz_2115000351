import java.util.*;
class PetrolPump{
    int petrol;
    int distance;
    public PetrolPump(int petrol,int distance){
        this.petrol=petrol;
        this.distance=distance;
    }
}
public class CircularTour{
    public static int findStartingPoint(PetrolPump[] pumps){
        int start=0;
        int end=1;
        int currentPetrol=pumps[start].petrol-pumps[start].distance;
        while(start!=end || currentPetrol<0){
            while(currentPetrol<0 && start!=end){
                currentPetrol-=pumps[start].petrol-pumps[start].distance;
                start=(start+1)%pumps.length;
                if(start==0){
                    return -1;
                }
            }
            currentPetrol+=pumps[end].petrol-pumps[end].distance;
            end=(end+1)%pumps.length;
        }
        return start;
    }
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter the number of petrol pumps ");
        int n=scanner.nextInt();
        PetrolPump[] pumps=new PetrolPump[n];
        for(int i=0;i<n;i++){
            System.out.print("Enter petrol for pump "+(i+1));
            int petrol=scanner.nextInt();
            System.out.print("Enter distance to next pump from pump "+(i+1));
            int distance=scanner.nextInt();
            pumps[i]=new PetrolPump(petrol,distance);
        }
        int startPoint=findStartingPoint(pumps);
        if(startPoint==-1){
            System.out.println("No solution exists");
        } 
        else{
            System.out.println("Start at petrol pump "+(startPoint+1));
        }
    }
}
