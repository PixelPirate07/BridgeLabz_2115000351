import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
public class FileProcessorTest{
    private final FileProcessor fileProcessor=new FileProcessor();
    private final String testFile="testfile.txt";
    @BeforeEach
    void setUp() throws IOException{
        Files.deleteIfExists(Path.of(testFile));
    }
    @AfterEach
    void tearDown() throws IOException{
        Files.deleteIfExists(Path.of(testFile));
    }
    @Test
    void testWriteAndReadFromFile() throws IOException{
        String content="Hello, JUnit";
        fileProcessor.writeToFile(testFile,content);
        assertTrue(Files.exists(Path.of(testFile)));
        assertEquals(content,fileProcessor.readFromFile(testFile));
    }
    @Test
    void testReadNonExistentFile_ShouldThrowIOException(){
        assertThrows(IOException.class,()->fileProcessor.readFromFile("nonexistent.txt"));
    }
}
