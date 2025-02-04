import java.util.*;
class BankAccount{
    static String bankName="Abc Bank";
    static int totalAccounts=0;
    final int accountNumber;
    String accountholderName;
    static int getTotalAccounts(){
        return totalAccounts;
    }
    public BankAccount(String accountholderName,int accountNumber){
        this.accountholderName=accountholderName;
        this.accountNumber=accountNumber;
        totalAccounts++;
    }
    public void View(){
        System.out.println("Bank Name is "+bankName);
        System.out.println("Name is "+accountholderName);
        System.out.println("Account number is "+accountNumber);
        System.out.println("Total accounts are "+totalAccounts);
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Account holder name");
        String accountholderName=sc.nextLine();
        System.out.println("Enter Account number");
        int accountNumber=sc.nextInt();
        BankAccount account1=new BankAccount(accountholderName,accountNumber);
        BankAccount account2=new BankAccount(accountholderName,accountNumber);
        if(account1 instanceof BankAccount && account2 instanceof BankAccount){
            account1.View();
            account2.View();
        }
    }
}
