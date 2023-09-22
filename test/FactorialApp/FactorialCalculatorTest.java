package tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FactorialCalculatorTest {
    @Test
    public void calculateFactorialTest(){
        FactorialCalculator factorialCalculator = new FactorialCalculator();
        int factorial = factorialCalculator.calculateFactorial();
        assertEquals(120, factorial);

    }
}
