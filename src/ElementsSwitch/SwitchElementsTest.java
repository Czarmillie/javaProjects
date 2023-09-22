package tdd;

import ElementsSwitch.SwitchElements;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class SwitchElementsTest {

    @Test
    public void TestToSwitchElements(){
        int[] numbers = {1, 2, 3, 4, 5, 6};
        SwitchElements.switchElements(numbers);
        int[] expected = {2, 1, 4, 3, 6, 5};
        assertArrayEquals(expected, numbers);
    }
}
