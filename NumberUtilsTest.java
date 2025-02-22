import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
public class NumberUtilsTest{
    private final NumberUtils numberUtils=new NumberUtils();
    @ParameterizedTest
    @ValueSource(ints={2,4,6,8,10})
    void testIsEven_TrueForEvenNumbers(int number){
        assertTrue(numberUtils.isEven(number));
    }
    @ParameterizedTest
    @ValueSource(ints={1,3,5,7,9})
    void testIsEven_FalseForOddNumbers(int number){
        assertFalse(numberUtils.isEven(number));
    }
}
