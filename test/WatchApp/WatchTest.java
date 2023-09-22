package tdd;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class WatchTest {

    @Test
    public void testConvertMinutesToSeconds() {
        Watch rolex = new Watch();
        rolex.setMinutes(3);
        Assertions.assertEquals(180, rolex.getSeconds());
    }

    @Test
    public void testCannotTakeNegative() {
        Watch rolex = new Watch();
        rolex.setMinutes(-20);
        Assertions.assertEquals(0, rolex.getSeconds());
    }

    @Test
    public void testConvertMinutesToDays() {
        Watch rolex = new Watch();
        rolex.setMinutes(2880);
        Assertions.assertEquals(2, rolex.getDays());
    }

    @Test
    public void testConvertMinutesToYears() {
        Watch rolex = new Watch();
        rolex.setMinutes(1051200);
        Assertions.assertEquals(2, rolex.getYears());
    }
}
