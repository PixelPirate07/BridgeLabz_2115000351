import java.util.*;
class BankAccount{
    public String accountNumber;
    protected String accountHolder;
    private double balance;
    public BankAccount(String accountNumber,String accountHolder,double balance) {
        this.accountNumber=accountNumber;
        this.accountHolder=accountHolder;
        this.balance=balance;
    }
    public double getBalance(){
        return balance;
    }
    public void setBalance(double balance){
        this.balance=balance;
    }
    public void displayAccountDetails(){
        System.out.println("Account Number is "+accountNumber);
        System.out.println("Account Holder is "+accountHolder);
        System.out.println("Balance is "+balance);
    }
}
class SavingsAccount extends BankAccount {
    public SavingsAccount(String accountNumber,String accountHolder,double balance){
        super(accountNumber,accountHolder,balance);
    }
    public void displaySavingsAccountDetails(){
        System.out.println("Savings Account Details are");
        System.out.println("Account Number is "+accountNumber);
        System.out.println("Account Holder: "+accountHolder);
        System.out.println("Balance is "+getBalance());
    }
}
public class Bankaccount{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter account number ");
        String accountNumber=sc.nextLine();
        System.out.print("Enter account holder's name ");
        String accountHolder=sc.nextLine();
        System.out.print("Enter initial balance");
        double balance=sc.nextDouble();
        BankAccount obj=new BankAccount(accountNumber,accountHolder,balance);
        obj.displayAccountDetails();
        System.out.print("\nEnter new balance ");
        double newBalance=sc.nextDouble();
        obj.setBalance(newBalance);
        System.out.println("\nUpdated Account Details after modifying balance");
        obj.displayAccountDetails();
        System.out.print("\nEnter account number for Savings Account ");
        sc.nextLine();
        String savingsAccountNumber=sc.nextLine();
        System.out.print("Enter account holder's name for Savings Account ");
        String savingsAccountHolder=sc.nextLine();
        System.out.print("Enter initial balance for Savings Account");
        double savingsBalance=sc.nextDouble();
        SavingsAccount obj1=new SavingsAccount(savingsAccountNumber,savingsAccountHolder,savingsBalance);
        obj1.displaySavingsAccountDetails();
    }
}
