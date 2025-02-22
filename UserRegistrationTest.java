import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
public class UserRegistrationTest{
    private UserRegistration userRegistration;
    @BeforeEach
    void setUp(){
        userRegistration=new UserRegistration();
    }
    @Test
    void testValidUserRegistration(){
        assertEquals("User registered successfully",userRegistration.registerUser("validUser", "user@example.com", "StrongPass1"));
    }
    @Test
    void testInvalidUsername(){
        Exception exception=assertThrows(IllegalArgumentException.class, () -> {
            userRegistration.registerUser("usr","user@example.com","StrongPass1");
        });
        assertEquals("Invalid username: must be at least 5 characters long",exception.getMessage());
    }
    @Test
    void testInvalidEmail(){
        Exception exception=assertThrows(IllegalArgumentException.class, () -> {
            userRegistration.registerUser("validUser", "invalid-email", "StrongPass1");
        });
        assertEquals("Invalid email format",exception.getMessage());
    }
    @Test
    void testInvalidPassword(){
        Exception exception=assertThrows(IllegalArgumentException.class, () -> {
            userRegistration.registerUser("validUser", "user@example.com", "short");
        });
        assertEquals("Invalid password: must be at least 8 characters long", exception.getMessage());
    }
    @Test
    void testNullInputs(){
        assertThrows(IllegalArgumentException.class, () -> userRegistration.registerUser(null, "user@example.com", "StrongPass1"));
        assertThrows(IllegalArgumentException.class, () -> userRegistration.registerUser("validUser", null, "StrongPass1"));
        assertThrows(IllegalArgumentException.class, () -> userRegistration.registerUser("validUser", "user@example.com", null));
    }
}
