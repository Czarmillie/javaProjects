package Car;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CarTest {
    @Test
    public void TestThatTheCarIsOn(){
        Car car = new Car("Ferrari", "2022", 5.8);
        boolean status = car.getIsOn();
        assertEquals(true, status);

    }
}
