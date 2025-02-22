import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
public class StringUtilsTest{
    StringUtils utils=new StringUtils();
    @Test
    void testReverse(){
        assertEquals("dcba",utils.reverse("abcd"));
        assertEquals("987654321",utils.reverse("123456789"));
        assertEquals("",utils.reverse(""));
    }
    @Test
    void testIsPalindrome(){
        assertTrue(utils.isPalindrome("madam"));
        assertTrue(utils.isPalindrome("racecar"));
        assertFalse(utils.isPalindrome("hello"));
    }
    @Test
    void testToUpperCase(){
        assertEquals("HELLO",utils.toUpperCase("hello"));
        assertEquals("WORLD",utils.toUpperCase("world"));
        assertEquals("",utils.toUpperCase(""));
    }
}
