import java.util.*;
class Hospital{
    String name;
    List<Doctor> doctors;
    List<Patient> patients;
    public Hospital(String name){
        this.name=name;
        this.doctors=new ArrayList<>();
        this.patients=new ArrayList<>();
    }
    public void addDoctor(Doctor doctor){
        doctors.add(doctor);
    }
    public void addPatient(Patient patient){
        patients.add(patient);
    }
}
class Doctor{
    String name;
    List<Patient> patients;
    public Doctor(String name){
        this.name=name;
        this.patients=new ArrayList<>();
    }
    public void consult(Patient patient){
        if(!patients.contains(patient)){
            patients.add(patient);
            patient.addDoctor(this);
        }
        System.out.println("Doctor "+name+" is consulting Patient "+patient.name);
    }
}
class Patient{
    String name;
    List<Doctor> doctors;
    public Patient(String name){
        this.name=name;
        this.doctors=new ArrayList<>();
    }
    public void addDoctor(Doctor doctor){
        if(!doctors.contains(doctor)){
            doctors.add(doctor);
        }
    }
}
public class HospitalInfo{
    public static void main(String[] args){
        Hospital hospital=new Hospital("ABC Hospital");
        Doctor doctor1=new Doctor("Dr. Banerjee");
        Doctor doctor2=new Doctor("Dr. Anil");
        Patient patient1=new Patient("Patient1");
        Patient patient2=new Patient("Patient2");
        hospital.addDoctor(doctor1);
        hospital.addDoctor(doctor2);
        hospital.addPatient(patient1);
        hospital.addPatient(patient2);
        doctor1.consult(patient1);
        doctor1.consult(patient2);
        doctor2.consult(patient1);
        System.out.println("\n"+patient1.name+" consulted by");
        for(Doctor doctor:patient1.doctors){
            System.out.println("  - "+doctor.name);
        }
        System.out.println("\n"+doctor1.name+" consulted:");
        for (Patient patient:doctor1.patients){
            System.out.println("  - "+patient.name);
        }
    }
}
