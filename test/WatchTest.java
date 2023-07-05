import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class WatchTest {

    @Test
    public void testConvertMinutesToSeconds() {
        Watch rolex = new Watch();
        rolex.setMinutes(3);
        assertEquals(180, rolex.getSeconds());
    }

    @Test
    public void testCannotTakeNegative() {
        Watch rolex = new Watch();
        rolex.setMinutes(-20);
        assertEquals(0, rolex.getSeconds());
    }

    @Test
    public void testConvertMinutesToDays() {
        Watch rolex = new Watch();
        rolex.setMinutes(2880);
        assertEquals(2, rolex.getDays());
    }

    @Test
    public void testConvertMinutesToYears() {
        Watch rolex = new Watch();
        rolex.setMinutes(1051200);
        assertEquals(2, rolex.getYears());
    }
}
