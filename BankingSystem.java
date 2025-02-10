abstract class BankAccount{
    private String accountNumber;
    private String holderName;
    private double balance;
    BankAccount(String accountNumber,String holderName,double balance){
        this.accountNumber=accountNumber;
        this.holderName=holderName;
        this.balance=balance;
    }
    public String getAccountNumber(){
        return accountNumber;
    }
    public void setAccountNumber(String accountNumber){
        this.accountNumber=accountNumber;
    }
    public String getHolderName(){
        return holderName;
    }
    public void setHolderName(String holderName){
        this.holderName=holderName;
    }
    public double getBalance(){
        return balance;
    }
    public void setBalance(double balance){
        this.balance=balance;
    }
    public void deposit(double amount){
        balance+=amount;
    }
    public void withdraw(double amount){
        if(balance>=amount){
            balance-=amount;
        } 
        else{
            System.out.println("Insufficient funds");
        }
    }
    public abstract double calculateInterest();
    public void displayDetails(){
        System.out.println("Account Number is "+accountNumber);
        System.out.println("Holder Name is "+holderName);
        System.out.println("Balance is "+balance);
    }
}
interface Loanable{
    void applyForLoan(double loanAmount);
    double calculateLoanEligibility();
}
class SavingsAccount extends BankAccount implements Loanable{
    private double interestRate;
    SavingsAccount(String accountNumber,String holderName,double balance,double interestRate){
        super(accountNumber,holderName,balance);
        this.interestRate=interestRate;
    }
    @Override
    public double calculateInterest(){
        return getBalance()*interestRate;
    }
    @Override
    public void applyForLoan(double loanAmount){
        System.out.println("Loan Application for Savings Account is "+loanAmount);
    }
    @Override
    public double calculateLoanEligibility(){
        return getBalance()*3;
    }
    @Override
    public void displayDetails(){
        super.displayDetails();
        System.out.println("Interest Rate is "+interestRate);
    }
}
class CurrentAccount extends BankAccount implements Loanable{
    private double overdraftLimit;
    CurrentAccount(String accountNumber,String holderName,double balance,double overdraftLimit){
        super(accountNumber,holderName,balance);
        this.overdraftLimit=overdraftLimit;
    }
    @Override
    public double calculateInterest(){
        return getBalance()*0.02;
    }
    @Override
    public void applyForLoan(double loanAmount){
        if(loanAmount<=(getBalance()+overdraftLimit)){
            System.out.println("Loan Application is approved");
        } 
        else{
            System.out.println("Loan Application is denied");
        }
    }
    @Override
    public double calculateLoanEligibility(){
        return getBalance()+overdraftLimit;
    }
    @Override
    public void displayDetails(){
        super.displayDetails();
        System.out.println("Overdraft Limit is "+overdraftLimit);
    }
}
public class BankingSystem{
    public static void main(String[] args){
        BankAccount savingsAccount=new SavingsAccount("12345","David Warner",10000,0.05);
        BankAccount currentAccount=new CurrentAccount("67890","Steve Smith",5000,3000);
        BankAccount[] accounts={savingsAccount,currentAccount};
        for (BankAccount account:accounts){
            account.displayDetails();
            double interest=account.calculateInterest();
            System.out.println("Interest is "+interest);
            if (account instanceof Loanable){
                Loanable loanableAccount=(Loanable) account;
                loanableAccount.applyForLoan(10000);
                double loanEligibility = loanableAccount.calculateLoanEligibility();
                System.out.println("Loan Eligibility is "+loanEligibility+"\n");
            }
        }
    }
}
