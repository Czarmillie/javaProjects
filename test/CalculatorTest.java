import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {

    @Test
    public void thatCalculatorExists() {
        Calculator casio = new Calculator();

        assertNotNull(casio);
    }

    @Test
    public void testThatCalculatorIsOn() {
        Calculator casio = new Calculator();
        casio.power();
        assertTrue(casio.isOn());
    }

    @Test
    public void testThatCalculatorIsOff() {
        Calculator casio = new Calculator();
        casio.power();
        assertTrue(casio.isOn());

        casio.power();
        assertFalse(casio.isOn);
    }

    @Test
    public void testThatCalculatorCanAddNumbers() {
        Calculator casio = new Calculator();
        casio.power();
        assertTrue(casio.isOn());

        int add = casio.getAdd();
        casio.add(17, 17);
        assertEquals(34, casio.getResult());
    }

    @Test
    public void testThatCalculatorCanSubtractNumbers() {
        Calculator casio = new Calculator();
        casio.power();
        assertTrue(casio.isOn());

        int subtract = casio.getSubtract();
        casio.subtract(15, 10);
        assertEquals(5, casio.getResult());
    }
}
