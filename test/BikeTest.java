import org.junit.jupiter.api.Test;
import tdd.AirCondition;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BikeTest {
    @Test
    public void ifBikeIsOnTest() {
        Bike ducatti = new Bike();
        boolean status = ducatti.getIsOn();
        assertEquals(false, status);

        ducatti.setIsOn(true);
        boolean newStatus = ducatti.getIsOn();
        assertEquals(true, newStatus);
    }

    @Test
    public void ifBikeCanBeOffTest() {
        Bike ducatti = new Bike();
        ducatti.setIsOn(true);
        boolean status = ducatti.getIsOn();
        assertEquals(true, status);

        ducatti.setIsOn(false);

        boolean newStatus = ducatti.getIsOn();
        assertEquals(false, newStatus);
    }

    @Test
    public void GearOneTest() {
        Bike ducatti = new Bike();
        ducatti.setIsOn(true);
        boolean status = ducatti.getIsOn();
        assertEquals(true, status);
        ducatti.setAcceleration(15);
        int bikeAcceleration = ducatti.getAcceleration();
        assertEquals(15, bikeAcceleration);

        ducatti.setGear(1);

        ducatti.increaseAcceleration();
        int newBikeAcceleration = ducatti.getAcceleration();
        assertEquals(16, newBikeAcceleration);

    }

    @Test
    public void GearTwoTest() {
        Bike ducatti = new Bike();
        ducatti.setIsOn(true);
        boolean status = ducatti.getIsOn();
        assertEquals(true, status);
        ducatti.setAcceleration(24);
        int bikeAcceleration = ducatti.getAcceleration();
        assertEquals(24, bikeAcceleration);

        ducatti.setGear(2);

        ducatti.increaseAcceleration();
        int newBikeAcceleration = ducatti.getAcceleration();
        assertEquals(26, newBikeAcceleration);

    }

    @Test
    public void GearThreeTest() {
        Bike ducatti = new Bike();
        ducatti.setIsOn(true);
        boolean status = ducatti.getIsOn();
        assertEquals(true, status);
        ducatti.setAcceleration(35);
        int bikeAcceleration = ducatti.getAcceleration();
        assertEquals(35, bikeAcceleration);

        ducatti.setGear(3);

        ducatti.increaseAcceleration();
        int newBikeAcceleration = ducatti.getAcceleration();
        assertEquals(38, newBikeAcceleration);

    }

    @Test
    public void GearFourTest() {
        Bike ducatti = new Bike();
        ducatti.setIsOn(true);
        boolean status = ducatti.getIsOn();
        assertEquals(true, status);
        ducatti.setAcceleration(44);
        int bikeAcceleration = ducatti.getAcceleration();
        assertEquals(44, bikeAcceleration);

        ducatti.setGear(4);

        ducatti.increaseAcceleration();
        int newBikeAcceleration = ducatti.getAcceleration();
        assertEquals(48, newBikeAcceleration);
    }
}


