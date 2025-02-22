import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
public class DateFormatterTest{
    private DateFormatter dateFormatter;
    @BeforeEach
    void setUp(){
        dateFormatter=new DateFormatter();
    }
    @Test
    void testValidDate(){
        assertEquals("15-08-2024", dateFormatter.formatDate("2024-08-15"));
        assertEquals("01-01-2000", dateFormatter.formatDate("2000-01-01"));
    }
    @Test
    void testInvalidDateFormat(){
        assertEquals("Invalid date format", dateFormatter.formatDate("15/08/2024"));
        assertEquals("Invalid date format", dateFormatter.formatDate("2024.08.15"));
        assertEquals("Invalid date format", dateFormatter.formatDate("08-15-2024"));
    }
    @Test
    void testInvalidDate(){
        assertEquals("Invalid date format", dateFormatter.formatDate("2024-02-30"));
        assertEquals("Invalid date format", dateFormatter.formatDate("abcd-ef-gh"));
    }
    @Test
    void testEmptyAndNullInput(){
        assertEquals("Invalid date format", dateFormatter.formatDate(""));
        assertEquals("Invalid date format", dateFormatter.formatDate(null));
    }
}
