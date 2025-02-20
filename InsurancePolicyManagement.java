import java.util.*;
import java.text.SimpleDateFormat;
class InsurancePolicy implements Comparable<InsurancePolicy>{
    private String policyNumber;
    private String policyholderName;
    private Date expiryDate;
    private String coverageType;
    private double premiumAmount;
    public InsurancePolicy(String policyNumber,String policyholderName,Date expiryDate,String coverageType,double premiumAmount){
        this.policyNumber=policyNumber;
        this.policyholderName=policyholderName;
        this.expiryDate=expiryDate;
        this.coverageType=coverageType;
        this.premiumAmount=premiumAmount;
    }
    public String getPolicyNumber(){
        return policyNumber;
    }
    public Date getExpiryDate(){
        return expiryDate;
    }
    public String getCoverageType(){
        return coverageType;
    }
    @Override
    public boolean equals(Object o){
        if(this==o) return true;
        if(o==null || getClass()!=o.getClass()) return false;
        InsurancePolicy that=(InsurancePolicy) o;
        return policyNumber.equals(that.policyNumber);
    }
    @Override
    public int hashCode(){
        return Objects.hash(policyNumber);
    }
    @Override
    public int compareTo(InsurancePolicy other){
        return this.expiryDate.compareTo(other.expiryDate);
    }
    @Override
    public String toString(){
        return policyNumber+" - "+policyholderName+" - "+coverageType+" - "+premiumAmount+" - Expiry "+expiryDate;
    }
}
public class InsurancePolicyManagement{
    private Set<InsurancePolicy> hashSetPolicies=new HashSet<>();
    private Set<InsurancePolicy> linkedHashSetPolicies=new LinkedHashSet<>();
    private Set<InsurancePolicy> treeSetPolicies=new TreeSet<>();
    public void addPolicy(InsurancePolicy policy){
        hashSetPolicies.add(policy);
        linkedHashSetPolicies.add(policy);
        treeSetPolicies.add(policy);
    }
    public void displayAllPolicies(){
        System.out.println("All Policies ");
        for (InsurancePolicy policy:hashSetPolicies){
            System.out.println(policy);
        }
    }
    public void displayPoliciesExpiringSoon(){
        System.out.println("Policies Expiring Soon");
        Date today=new Date();
        Calendar calendar=Calendar.getInstance();
        calendar.setTime(today);
        calendar.add(Calendar.DAY_OF_YEAR,30);
        Date threshold=calendar.getTime();
        for(InsurancePolicy policy:treeSetPolicies){
            if(policy.getExpiryDate().before(threshold)){
                System.out.println(policy);
            }
        }
    }    
    public void displayPoliciesByCoverageType(String coverageType){
        System.out.println("Policies with Coverage Type "+coverageType);
        for(InsurancePolicy policy:hashSetPolicies){
            if(policy.getCoverageType().equalsIgnoreCase(coverageType)){
                System.out.println(policy);
            }
        }
    }
    public void displayDuplicatePolicies(){
        Set<String> seen=new HashSet<>();
        Set<InsurancePolicy> duplicates=new HashSet<>();
        for (InsurancePolicy policy:hashSetPolicies){
            if(!seen.add(policy.getPolicyNumber())){
                duplicates.add(policy);
            }
        }
        System.out.println("Duplicate Policies");
        for(InsurancePolicy policy:duplicates){
            System.out.println(policy);
        }
    }
    public static void main(String[] args) throws Exception{
        InsurancePolicyManagement management=new InsurancePolicyManagement();
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
        management.addPolicy(new InsurancePolicy("P001","Jon",sdf.parse("2025-05-10"),"Health",5000));
        management.addPolicy(new InsurancePolicy("P002","Watson",sdf.parse("2024-07-15"),"Auto",3000));
        management.addPolicy(new InsurancePolicy("P003","Sherlock",sdf.parse("2024-08-01"),"Home",7000));
        management.addPolicy(new InsurancePolicy("P002","Kohli",sdf.parse("2024-07-15"),"Auto",3000));
        management.displayAllPolicies();
        management.displayPoliciesExpiringSoon();
        management.displayPoliciesByCoverageType("Auto");
        management.displayDuplicatePolicies();
    }
}
