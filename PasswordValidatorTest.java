import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
public class PasswordValidatorTest{
    private PasswordValidator passwordValidator;
    @BeforeEach
    void setUp(){
        passwordValidator=new PasswordValidator();
    }
    @Test
    void testValidPassword(){
        assertTrue(passwordValidator.isValid("StrongPass1"));
        assertTrue(passwordValidator.isValid("HelloWorld2"));
    }
    @Test
    void testInvalidPassword_TooShort(){
        assertFalse(passwordValidator.isValid("Short1"));
    }
    @Test
    void testInvalidPassword_NoUppercase(){
        assertFalse(passwordValidator.isValid("weakpassword1"));
    }
    @Test
    void testInvalidPassword_NoDigit(){
        assertFalse(passwordValidator.isValid("NoNumbersHere"));
    }
    @Test
    void testInvalidPassword_Null(){
        assertFalse(passwordValidator.isValid(null));
    }
    @Test
    void testInvalidPassword_Empty(){
        assertFalse(passwordValidator.isValid(""));
    }
}
