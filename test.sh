import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Scanner;
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class MainTest {
    private static final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private static final PrintStream originalOut = System.out;
    
    @BeforeEach
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }
    @AfterEach
    public void restoreStreams() {
        System.setOut(originalOut);
    }

    @Test
    public void testKeywordMatch() {
        String input = "Tell me about the Scrum methodology";
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        Scanner scan = new Scanner(System.in);
        Main.main(new String[]{});
        assertTrue(outContent.toString().contains("Found keyword match, scrum"));
    }

    @Test
    public void testKeywordNoMatch() {
        String input = "Can you tell me about programming languages?";
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        Scanner scan = new Scanner(System.in);
        Main.main(new String[]{});
        assertFalse(outContent.toString().contains("Found keyword match"));
    }

    @Test
    public void testMultipleKeywordMatch() {
        String input = "What is the difference between Agile and Lean methodologies?";
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        Scanner scan = new Scanner(System.in);
        Main.main(new String[]{});
        assertTrue(outContent.toString().contains("Found keyword match, agile") && outContent.toString().contains("Found keyword match, lean"));
    }

}    


