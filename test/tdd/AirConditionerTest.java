package tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AirConditionerTest {
    @Test
    public void ifAirConditionIsOnTest() {
        AirCondition hisense = new AirCondition();
        boolean status = hisense.getIsOn();
        assertEquals(false, status);

        hisense.setIsOn(true);
        boolean newStatus = hisense.getIsOn();
        assertEquals(true, newStatus);
    }

    @Test
    public void ifAirConditionCanBeOff() {
        AirCondition hisense = new AirCondition();
        hisense.setIsOn(true);
        boolean status = hisense.getIsOn();
        assertEquals(true, status);

        hisense.setIsOn(false);

        boolean newStatus = hisense.getIsOn();
        assertEquals(false, newStatus);
    }

    @Test
    public void canTemperatureIncreaseTest() {
        AirCondition hisense = new AirCondition();
        hisense.setIsOn(true);
        boolean status = hisense.getIsOn();
        assertEquals(true, status);
        hisense.setTemperature(16);
        int acTemperature = hisense.getTemperature();
        assertEquals(16, acTemperature);

        hisense.increaseTemperature();
        int newAcTemperature = hisense.getTemperature();
        assertEquals(17, newAcTemperature);

    }

    @Test
    public void canTemperatureDecreaseTest() {
        AirCondition hisense = new AirCondition();
        hisense.setIsOn(true);
        boolean status = hisense.getIsOn();
        assertEquals(true, status);
        hisense.setTemperature(17);
        int acTemperature = hisense.getTemperature();
        assertEquals(17, acTemperature);

        hisense.decreaseTemperature();
        int newAcTemperature = hisense.getTemperature();
        assertEquals(16, newAcTemperature);
    }

    @Test
    public void canTemperatureIncreaseBeyondTest() {
        AirCondition hisense = new AirCondition();
        hisense.setIsOn(true);
        boolean status = hisense.getIsOn();
        assertEquals(true, status);
        hisense.setTemperature(30);
        int acTemperature = hisense.getTemperature();
        assertEquals(30, acTemperature);

        hisense.increaseTemperature();
        int newAcTemperature = hisense.getTemperature();
        assertEquals(30, newAcTemperature);
    }

    @Test
    public void canTemperatureDecreaseBelowTest() {
        AirCondition hisense = new AirCondition();
        hisense.setIsOn(true);
        boolean status = hisense.getIsOn();
        assertEquals(true, status);
        hisense.setTemperature(16);
        int acTemperature = hisense.getTemperature();
        assertEquals(16, acTemperature);

        hisense.decreaseTemperature();
        int newAcTemperature = hisense.getTemperature();
        assertEquals(16, newAcTemperature);
    }
}
