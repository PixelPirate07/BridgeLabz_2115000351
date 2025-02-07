class BankAccount{
    String accountNumber;
    double balance;
    BankAccount(String accountNumber,double balance){
        this.accountNumber=accountNumber;
        this.balance=balance;
    }
    void displayInfo(){
        System.out.println("Account Number is "+accountNumber);
        System.out.println("Balance is "+balance);
    }
}
class SavingsAccount extends BankAccount{
    double interestRate;
    SavingsAccount(String accountNumber,double balance,double interestRate){
        super(accountNumber,balance);
        this.interestRate=interestRate;
    }
    @Override
    void displayInfo(){
        super.displayInfo();
        System.out.println("Interest Rate is "+interestRate);
        displayAccountType();
    }
    void displayAccountType(){
        System.out.println("Account Type is Savings Account");
    }
}
class CheckingAccount extends BankAccount{
    double withdrawalLimit;
    CheckingAccount(String accountNumber,double balance,double withdrawalLimit){
        super(accountNumber,balance);
        this.withdrawalLimit=withdrawalLimit;
    }
    @Override
    void displayInfo(){
        super.displayInfo();
        System.out.println("Withdrawal Limit is " + withdrawalLimit);
        displayAccountType();
    }
    void displayAccountType() {
        System.out.println("Account Type is Checking Account");
    }
}
class FixedDepositAccount extends BankAccount{
    int depositTerm;
    FixedDepositAccount(String accountNumber,double balance,int depositTerm){
        super(accountNumber,balance);
        this.depositTerm=depositTerm;
    }
    @Override
    void displayInfo(){
        super.displayInfo();
        System.out.println("Deposit Term is "+depositTerm);
        displayAccountType();
    }
    void displayAccountType(){
        System.out.println("Account Type is Fixed Deposit Account");
    }
}
public class BankSystem{
    public static void main(String[] args){
        BankAccount savings=new SavingsAccount("123456777",20000,6.5);
        BankAccount checking=new CheckingAccount("987876532",10000,5000);
        BankAccount fixedDeposit=new FixedDepositAccount("92737233",50000,12);
        System.out.println("Savings Account Details are");
        savings.displayInfo();
        System.out.println();
        System.out.println("Checking Account Details are");
        checking.displayInfo();
        System.out.println();
        System.out.println("Fixed Deposit Account Details are");
        fixedDeposit.displayInfo();
    }
}
