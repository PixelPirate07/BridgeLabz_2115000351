abstract class Patient{
    private int patientId;
    private String name;
    private int age;
    Patient(int patientId,String name,int age){
        this.patientId=patientId;
        this.name=name;
        this.age=age;
    }
    public int getPatientId(){
        return patientId;
    }
    public void setPatientId(int patientId){
        this.patientId=patientId;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
    public int getAge(){
        return age;
    }
    public void setAge(int age){
        this.age=age;
    }
    public abstract double calculateBill();
    public void getPatientDetails(){
        System.out.println("Patient ID is "+patientId);
        System.out.println("Name is "+name);
        System.out.println("Age is "+age);
    }
}
interface MedicalRecord{
    void addRecord(String record);
    void viewRecords();
}
class InPatient extends Patient implements MedicalRecord{
    private int daysAdmitted;
    private String diagnosis;
    private String medicalHistory;
    InPatient(int patientId,String name,int age,int daysAdmitted,String diagnosis){
        super(patientId,name,age);
        this.daysAdmitted=daysAdmitted;
        this.diagnosis=diagnosis;
        this.medicalHistory="No previous medical records";
    }
    @Override
    public double calculateBill(){
        return daysAdmitted*1000;
    }
    @Override
    public void addRecord(String record){
        this.medicalHistory=record;
    }
    @Override
    public void viewRecords(){
        System.out.println("Diagnosis is "+diagnosis);
        System.out.println("Medical History is "+medicalHistory);
    }
    @Override
    public void getPatientDetails() {
        super.getPatientDetails();
        System.out.println("Days Admitted are "+daysAdmitted);
        System.out.println("Diagnosis is "+diagnosis);
    }
}
class OutPatient extends Patient implements MedicalRecord{
    private String treatment;
    private String medicalHistory;
    OutPatient(int patientId,String name,int age,String treatment){
        super(patientId,name,age);
        this.treatment=treatment;
        this.medicalHistory = "No previous medical records";
    }
    @Override
    public double calculateBill(){
        return 500;
    }
    @Override
    public void addRecord(String record){
        this.medicalHistory=record;
    }
    @Override
    public void viewRecords(){
        System.out.println("Treatment is "+treatment);
        System.out.println("Medical History is "+medicalHistory);
    }
    @Override
    public void getPatientDetails(){
        super.getPatientDetails();
        System.out.println("Treatment is "+treatment);
    }
}
public class HospitalSystem{
    public static void main(String[] args){
        Patient inPatient=new InPatient(1,"Jon",45,5,"Pneumonia");
        Patient outPatient=new OutPatient(2,"Steve",30,"Routine Checkup");
        Patient[] patients={inPatient, outPatient};
        for (Patient patient:patients){
            patient.getPatientDetails();
            System.out.println("Bill Amount is "+patient.calculateBill()+"\n");
        }
        InPatient ip=(InPatient)inPatient;
        ip.addRecord("Patient is improving,pneumonia under control");
        ip.viewRecords();
        OutPatient op=(OutPatient)outPatient;
        op.addRecord("Routine checkup completed,no issues found");
        op.viewRecords();
    }
}
