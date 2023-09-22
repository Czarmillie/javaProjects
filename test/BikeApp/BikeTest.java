package tdd;

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
        ducatti.setAcceleration(19);
        int bikeAcceleration = ducatti.getAcceleration();
        assertEquals(19, bikeAcceleration);

        ducatti.setGear(1);

        ducatti.increaseAcceleration();
        int newBikeAcceleration = ducatti.getAcceleration();
        assertEquals(20, newBikeAcceleration);

    }

    @Test
    public void GearTwoTest() {
        Bike ducatti = new Bike();
        ducatti.setIsOn(true);
        boolean status = ducatti.getIsOn();
        assertEquals(true, status);
        ducatti.setAcceleration(28);
        int bikeAcceleration = ducatti.getAcceleration();
        assertEquals(28, bikeAcceleration);

        ducatti.setGear(2);

        ducatti.increaseAcceleration();
        int newBikeAcceleration = ducatti.getAcceleration();
        assertEquals(30, newBikeAcceleration);

    }

    @Test
    public void GearThreeTest() {
        Bike ducatti = new Bike();
        ducatti.setIsOn(true);
        boolean status = ducatti.getIsOn();
        assertEquals(true, status);
        ducatti.setAcceleration(37);
        int bikeAcceleration = ducatti.getAcceleration();
        assertEquals(37, bikeAcceleration);

        ducatti.setGear(3);

        ducatti.increaseAcceleration();
        int newBikeAcceleration = ducatti.getAcceleration();
        assertEquals(40, newBikeAcceleration);

    }

    @Test
    public void GearFourTest() {
        Bike ducatti = new Bike();
        ducatti.setIsOn(true);
        boolean status = ducatti.getIsOn();
        assertEquals(true, status);
        ducatti.setAcceleration(46);
        int bikeAcceleration = ducatti.getAcceleration();
        assertEquals(46, bikeAcceleration);

        ducatti.setGear(4);

        ducatti.increaseAcceleration();
        int newBikeAcceleration = ducatti.getAcceleration();
        assertEquals(50, newBikeAcceleration);
    }

    @Test
    public void GearOneDecelerationTest() {
        Bike ducatti = new Bike();
        ducatti.setIsOn(true);
        boolean status = ducatti.getIsOn();
        assertEquals(true, status);
        ducatti.setDeceleration(20);
        int bikeDeceleration = ducatti.getDeceleration();;
        assertEquals(20, bikeDeceleration);

        ducatti.setGear(1);

        ducatti.decreaseDeceleration();
        int newBikeDeceleration = ducatti.getDeceleration();
        assertEquals(19, newBikeDeceleration);
    }

    @Test
    public void GearTwoDecelerationTest() {
        Bike ducatti = new Bike();
        ducatti.setIsOn(true);
        boolean status = ducatti.getIsOn();
        assertEquals(true, status);
        ducatti.setDeceleration(30);
        int bikeDeceleration = ducatti.getDeceleration();;
        assertEquals(30, bikeDeceleration);

        ducatti.setGear(2);

        ducatti.decreaseDeceleration();
        int newBikeDeceleration = ducatti.getDeceleration();
        assertEquals(28, newBikeDeceleration);
    }

    @Test
    public void GearThreeDecelerationTest() {
        Bike ducatti = new Bike();
        ducatti.setIsOn(true);
        boolean status = ducatti.getIsOn();
        assertEquals(true, status);
        ducatti.setDeceleration(40);
        int bikeDeceleration = ducatti.getDeceleration();;
        assertEquals(40, bikeDeceleration);

        ducatti.setGear(3);

        ducatti.decreaseDeceleration();
        int newBikeDeceleration = ducatti.getDeceleration();
        assertEquals(37, newBikeDeceleration);
    }

    @Test
    public void GearFourDecelerationTest() {
        Bike ducatti = new Bike();
        ducatti.setIsOn(true);
        boolean status = ducatti.getIsOn();
        assertEquals(true, status);
        ducatti.setDeceleration(50);
        int bikeDeceleration = ducatti.getDeceleration();;
        assertEquals(50, bikeDeceleration);

        ducatti.setGear(4);

        ducatti.decreaseDeceleration();
        int newBikeDeceleration = ducatti.getDeceleration();
        assertEquals(46, newBikeDeceleration);
    }

}


