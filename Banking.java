import java.util.*;
public class Banking{
    private Map<Integer,Double> accounts=new HashMap<>();
    private Queue<Integer> withdrawalQueue=new LinkedList<>();
    public void createAccount(int accountNumber,double balance){
        accounts.put(accountNumber,balance);
    }
    public void deposit(int accountNumber,double amount){
        accounts.put(accountNumber,accounts.getOrDefault(accountNumber,0.0)+amount);
    }
    public void requestWithdrawal(int accountNumber){
        if(accounts.containsKey(accountNumber)){
            withdrawalQueue.add(accountNumber);
        }
    }
    public void processWithdrawals(double amount){
        while(!withdrawalQueue.isEmpty()){
            int accountNumber=withdrawalQueue.poll();
            if(accounts.get(accountNumber)>=amount){
                accounts.put(accountNumber,accounts.get(accountNumber)-amount);
                System.out.println("Withdrawal of "+amount+" from Account "+accountNumber+" successful");
            } 
            else{
                System.out.println("Insufficient funds in Account "+accountNumber);
            }
        }
    }
    public void displaySortedByBalance(){
        TreeMap<Integer,Double> sortedAccounts=new TreeMap<>(Comparator.comparingDouble(accounts::get));
        sortedAccounts.putAll(accounts);
        System.out.println("Accounts Sorted by Balance");
        for(Map.Entry<Integer, Double> entry:sortedAccounts.entrySet()){
            System.out.println("Account "+entry.getKey()+" - Balance is "+entry.getValue());
        }
    }
    public static void main(String[] args){
        Banking bank=new Banking();
        bank.createAccount(101,5000);
        bank.createAccount(102,2500);
        bank.createAccount(103,8000);
        bank.createAccount(104,1200);
        bank.deposit(101,1000);
        bank.deposit(104,500);
        bank.requestWithdrawal(101);
        bank.requestWithdrawal(103);
        bank.requestWithdrawal(104);
        bank.processWithdrawals(2000);
        bank.displaySortedByBalance();
    }
}
