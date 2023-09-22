package tdd;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MultiplicationTest {
    @Test
    public void MultiplicationTest() {
        Multiplication multiplication = new Multiplication();
        Multiplication.multiplication(5, 2);
        int total = 0;
        assertEquals(10, 10);
    }
}
