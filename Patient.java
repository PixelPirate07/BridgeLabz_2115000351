import java.util.*;
class Patient{
    static String hospitalName = "ABC Hospital";
    static int totalPatients=0;
    int patientID;
    String name;
    int age;
    String ailment;
    public Patient(final int patientID,String name,int age,String ailment){
        this.name=name;
        this.age=age;
        this.ailment=ailment;
        this.patientID=patientID;
        totalPatients++;
    }
    static int getTotalPatients(){
        return totalPatients;
    }
    public void viewDetails(){
        System.out.println("Patient ID "+patientID);
        System.out.println("Name "+name);
        System.out.println("Age "+age);
        System.out.println("Ailment "+ailment);
        System.out.println("Hospital "+hospitalName);
        System.out.println("Total Patients are "+totalPatients);
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter PatientID ");
        int patientID=sc.nextInt();
        sc.nextLine();
        System.out.println("Enter Name ");
        String name=sc.nextLine();
        System.out.println("Enter Age ");
        int age=sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Ailment ");
        String ailment=sc.nextLine();
        Patient patient=new Patient(patientID,name,age,ailment);
        if(patient instanceof Patient){
            patient.viewDetails();
        }
    }
}
