import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class BankAccountTest{
    private BankAccount account;
    @BeforeEach
    void setUp(){
        account=new BankAccount(100.0);
    }
    @Test
    void testDeposit(){
        account.deposit(50.0);
        assertEquals(150.0,account.getBalance());
    }
    @Test
    void testWithdraw_ValidAmount(){
        account.withdraw(30.0);
        assertEquals(70.0,account.getBalance());
    }
    @Test
    void testWithdraw_InsufficientFunds(){
        Exception exception=assertThrows(IllegalArgumentException.class, () -> account.withdraw(200.0));
        assertEquals("Insufficient funds or invalid amount", exception.getMessage());
    }
    @Test
    void testWithdraw_NegativeAmount(){
        Exception exception=assertThrows(IllegalArgumentException.class,()->account.withdraw(-10.0));
        assertEquals("Insufficient funds or invalid amount", exception.getMessage());
    }
    @Test
    void testDeposit_NegativeAmount(){
        account.deposit(-20.0);
        assertEquals(100.0, account.getBalance());
    }
}
