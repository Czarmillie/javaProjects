package tdd;

import ElementsSwitch.ConditionalElementSwitching;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
public class ConditionalElementSwitchingTest {

    @Test
    public void testConditionalSwitchElements() {
        int[] inputArray = {45, 52, 11, 33, 48, 25};
        int[] expectedArray = {52, 45, 33, 11, 48, 25};
        ConditionalElementSwitching.ConditionalSwitchElements(inputArray);
        assertArrayEquals(expectedArray, inputArray);
    }
}