import java.util.*;
class Patient implements Comparable<Patient>{
    private String name;
    private int severity;
    public Patient(String name,int severity){
        this.name=name;
        this.severity=severity;
    }
    public String getName(){
        return name;
    }
    @Override
    public int compareTo(Patient other){
        return Integer.compare(other.severity,this.severity);
    }
}
public class HospitalTriage{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        PriorityQueue<Patient> triageQueue=new PriorityQueue<>();
        System.out.print("Enter the number of patients ");
        int numPatients=sc.nextInt();
        sc.nextLine();
        for(int i=0;i<numPatients;i++){
            System.out.print("Enter patient name ");
            String name=sc.nextLine();
            System.out.print("Enter severity level ");
            int severity=sc.nextInt();
            sc.nextLine();
            triageQueue.add(new Patient(name,severity));
        }
        System.out.println("\nTreatment Order");
        while(!triageQueue.isEmpty()){
            System.out.println(triageQueue.poll().getName());
        }
    }
}
