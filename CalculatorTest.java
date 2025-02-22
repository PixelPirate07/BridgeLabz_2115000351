import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
public class CalculatorTest{
    Calculator calculator=new Calculator();
    @Test
    void testAddition(){
        assertEquals(5,calculator.add(2,3));
    }
    @Test
    void testSubtraction(){
        assertEquals(2,calculator.subtract(5,3));
    }
    @Test
    void testMultiplication(){
        assertEquals(6,calculator.multiply(2,3));
    }
    @Test
    void testDivision(){
        assertEquals(2,calculator.divide(6,3));
    }
    @Test
    void testDivisionByZero(){
        Exception exception=assertThrows(ArithmeticException.class,()->calculator.divide(5,0));
        assertEquals("Cannot divide by zero",exception.getMessage());
    }
}
