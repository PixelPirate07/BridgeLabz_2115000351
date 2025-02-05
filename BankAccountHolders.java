import java.util.*; 
class Bank{ 
    String name; 
    ArrayList<Customer> customers; 
    public Bank(String name){ 
        this.name=name; 
        this.customers=new ArrayList<>(); 
    } 
    public void openAccount(String customerName,int initialBalance){ 
        Customer customer=new Customer(customerName,this,initialBalance); 
        customers.add(customer); 
        System.out.println("Account opened "); 
    } 
    public void displayCustomers(){ 
        System.out.println("Bank is "+name); 
        for(Customer customer:customers){ 
            customer.viewBalance(); 
        } 
    } 
} 
class Customer{ 
    String name; 
    Bank bank; 
    int balance; 
    public Customer(String name,Bank bank,int balance){ 
        this.name=name; 
        this.bank=bank; 
        this.balance=balance; 
    } 
    public void viewBalance(){ 
        System.out.println("Customer is "+name+", Bank is "+bank.name+", Balance is "+balance); 
    } 
} 
public class BankAccountHolders{ 
    public static void main(String[] args){ 
        Scanner sc=new Scanner(System.in); 
        System.out.print("Enter bank name "); 
        String bankName=sc.nextLine(); 
        Bank bank=new Bank(bankName); 
        System.out.print("Enter number of customers "); 
        int numCustomers=sc.nextInt(); 
        sc.nextLine(); 
        for(int i=0;i<numCustomers;i++){ 
            System.out.print("Enter customer name "); 
            String customerName=sc.nextLine(); 
            System.out.print("Enter initial balance "); 
            int balance=sc.nextInt(); 
            sc.nextLine(); 
            bank.openAccount(customerName,balance); 
        }
        bank.displayCustomers(); 
    } 
}