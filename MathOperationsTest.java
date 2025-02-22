import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
public class MathOperationsTest{
    MathOperations mathOperations=new MathOperations();
    @Test
    void testDivideByZero(){
        Exception exception=assertThrows(ArithmeticException.class,()->mathOperations.divide(10,0));
        assertEquals("Cannot divide by zero",exception.getMessage());
    }
    @Test
    void testValidDivision(){
        assertEquals(5,mathOperations.divide(10,2));
        assertEquals(-3,mathOperations.divide(-9,3));
    }
}
