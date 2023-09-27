import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class NamesTest {

    @Test
    public void testGetInitialsAndLastName() {
        String input = "Daniel Mark Carter";
        String expectedOutput = "D. M. Carter";
        String result = Names.getInitialsAndLastName(expectedOutput);
        assertEquals(expectedOutput, result);
    }
}
