package tdd;

import org.junit.jupiter.api.Assertions;
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
        Assertions.assertTrue(casio.isOn());
    }

    @Test
    public void testThatCalculatorIsOff() {
        Calculator casio = new Calculator();
        casio.power();
        Assertions.assertTrue(casio.isOn());

        casio.power();
        Assertions.assertFalse(casio.isOn);
    }

    @Test
    public void testThatCalculatorCanAddNumbers() {
        Calculator casio = new Calculator();
        casio.power();
        Assertions.assertTrue(casio.isOn());

        int add = casio.getAdd();
        casio.add(17, 17);
        Assertions.assertEquals(34, casio.getResult());
    }

    @Test
    public void testThatCalculatorCanSubtractNumbers() {
        Calculator casio = new Calculator();
        casio.power();
        Assertions.assertTrue(casio.isOn());

        int subtract = casio.getSubtract();
        casio.subtract(15, 10);
        Assertions.assertEquals(5, casio.getResult());
    }
}
