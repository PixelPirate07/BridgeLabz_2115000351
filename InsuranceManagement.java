import java.util.*;
import java.text.SimpleDateFormat;
class InsurancePolicy{
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
    public String getPolicyholderName(){
        return policyholderName;
    }
    public Date getExpiryDate(){
        return expiryDate;
    }
    @Override
    public String toString(){
        return policyNumber+" | "+policyholderName+" | "+expiryDate+" | "+coverageType+" | "+premiumAmount;
    }
}
public class InsuranceManagement{
    private Map<String,InsurancePolicy> hashMapPolicies=new HashMap<>();
    private Map<String,InsurancePolicy> linkedHashMapPolicies=new LinkedHashMap<>();
    private Map<Date,InsurancePolicy> treeMapPolicies=new TreeMap<>();
    public void addPolicy(InsurancePolicy policy){
        hashMapPolicies.put(policy.getPolicyNumber(),policy);
        linkedHashMapPolicies.put(policy.getPolicyNumber(),policy);
        treeMapPolicies.put(policy.getExpiryDate(),policy);
    }
    public InsurancePolicy getPolicyByNumber(String policyNumber){
        return hashMapPolicies.get(policyNumber);
    }
    public List<InsurancePolicy> getPoliciesExpiringSoon(){
        List<InsurancePolicy> expiringPolicies=new ArrayList<>();
        Date today=new Date();
        Calendar calendar=Calendar.getInstance();
        calendar.setTime(today);
        calendar.add(Calendar.DAY_OF_YEAR, 30);
        Date threshold=calendar.getTime();
        for (Map.Entry<Date,InsurancePolicy> entry:treeMapPolicies.entrySet()){
            if (entry.getKey().before(threshold)) {
                expiringPolicies.add(entry.getValue());
            } else {
                break;
            }
        }
        return expiringPolicies;
    }
    public List<InsurancePolicy> getPoliciesByHolder(String policyholderName){
        List<InsurancePolicy> policies=new ArrayList<>();
        for(InsurancePolicy policy:hashMapPolicies.values()){
            if(policy.getPolicyholderName().equalsIgnoreCase(policyholderName)){
                policies.add(policy);
            }
        }
        return policies;
    }
    public void removeExpiredPolicies(){
        Date today=new Date();
        treeMapPolicies.entrySet().removeIf(entry->entry.getKey().before(today));
    }
    public static void main(String[] args){
        InsuranceManagement system=new InsuranceManagement();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of policies");
        int n=sc.nextInt();
        sc.nextLine();
        for(int i=0;i<n;i++){
            System.out.println("Enter policy number");
            String policyNumber=sc.nextLine();
            System.out.println("Enter policyholder name");
            String policyholderName=sc.nextLine();
            System.out.println("Enter expiry date yyyy-MM-dd");
            String dateStr=sc.nextLine();
            System.out.println("Enter coverage type");
            String coverageType=sc.nextLine();
            System.out.println("Enter premium amount");
            double premiumAmount=sc.nextDouble();
            sc.nextLine();
            try{
                Date expiryDate=new SimpleDateFormat("yyyy-MM-dd").parse(dateStr);
                InsurancePolicy policy=new InsurancePolicy(policyNumber,policyholderName,expiryDate,coverageType,premiumAmount);
                system.addPolicy(policy);
            } 
            catch(Exception e){
                System.out.println("Invalid date format");
            }
        }
        System.out.println("Enter policy number to search");
        String searchNumber=sc.nextLine();
        InsurancePolicy foundPolicy=system.getPolicyByNumber(searchNumber);
        System.out.println(foundPolicy!=null?foundPolicy:"Policy not found");
        System.out.println("Policies expiring soon");
        for(InsurancePolicy policy:system.getPoliciesExpiringSoon()){
            System.out.println(policy);
        }
        System.out.println("Enter policyholder name to list policies");
        String holderName=sc.nextLine();
        for(InsurancePolicy policy:system.getPoliciesByHolder(holderName)){
            System.out.println(policy);
        }
        system.removeExpiredPolicies();
        System.out.println("Expired policies removed");
    }
}
