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
        assertTrue(outContent.toString().contains("Sure, I can tell you about Scrum! Scrum is an agile method framework used by teams to develop projects. In Scrum, work is divided into small, manageable chunks called sprints, which are typically two to four weeks long. Each sprint begins with a planning meeting where the team selects a set of items from the product backlog to work on. Throughout the sprint, the team meets daily in a short stand-up meeting to discuss progress and identify any roadblocks. At the end of each sprint, the team holds a sprint review meeting to demonstrate the work completed and receive feedback, and a sprint retrospective meeting to review the process and identify areas for improvement."));
    }

    @Test
    public void testKeywordNoMatch() {
        String input = "Can you tell me about programming languages?";
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        Scanner scan = new Scanner(System.in);
        Main.main(new String[]{});
        assertFalse(outContent.toString().contains("My apologies, I do not seem to have any knowledge on what you are asking. May you give me one keyword of the terminology you are looking for so that my creator can add its definition in the future?"));
    }

    @Test
    public void testMultipleKeywordMatch() {
        String input = "What is the difference between Scrum and Crystal methodologies?";
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        Scanner scan = new Scanner(System.in);
        Main.main(new String[]{});
        assertTrue(outContent.toString().contains("Sure, I can tell you about Scrum! Scrum is an agile method framework used by teams to develop projects. In Scrum, work is divided into small, manageable chunks called sprints, which are typically two to four weeks long. Each sprint begins with a planning meeting where the team selects a set of items from the product backlog to work on. Throughout the sprint, the team meets daily in a short stand-up meeting to discuss progress and identify any roadblocks. At the end of each sprint, the team holds a sprint review meeting to demonstrate the work completed and receive feedback, and a sprint retrospective meeting to review the process and identify areas for improvement.") && outContent.toString().contains("Certainly! Crystal is an agile methodology for software development is designed to be adaptable to the needs of the project team, and it is often used on small to medium-sized projects based on the size of the team. There are several variations of the Crystal methodology, ranging from Crystal Clear for the smallest projects, to Crystal Orange and Crystal Red for larger, more complex projects. The different variations of the methodology share the same core values and principles, but provide different guidance on how to implement them."));
    }

}    


