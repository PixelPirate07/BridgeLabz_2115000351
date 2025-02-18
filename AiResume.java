import java.util.*;
abstract class JobRole{
    abstract void processResume();
}
class SoftwareEngineer extends JobRole{
    @Override
    void processResume(){
        System.out.println("Processing Resume for Software Engineer");
    }
}
class DataScientist extends JobRole{
    @Override
    void processResume(){
        System.out.println("Processing Resume for Data Scientist");
    }
}
class ProductManager extends JobRole{
    @Override
    void processResume(){
        System.out.println("Processing Resume for Product Manager");
    }
}
class Resume<T extends JobRole>{
    private T jobRole;
    public Resume(T jobRole){
        this.jobRole=jobRole;
    }
    public void process(){
        jobRole.processResume();
    }
}
class ResumeScreening{
    public static void processResumes(List<? extends JobRole> resumes){
        for(JobRole resume:resumes){
            resume.processResume();
        }
    }
}
public class AiResume{
    public static void main(String[] args){
        Resume<SoftwareEngineer> seResume=new Resume<>(new SoftwareEngineer());
        Resume<DataScientist> dsResume=new Resume<>(new DataScientist());
        Resume<ProductManager> pmResume=new Resume<>(new ProductManager());
        seResume.process();
        dsResume.process();
        pmResume.process();
        List<JobRole> resumeList=new ArrayList<>();
        resumeList.add(new SoftwareEngineer());
        resumeList.add(new DataScientist());
        resumeList.add(new ProductManager());
        ResumeScreening.processResumes(resumeList);
    }
}
