package tdd;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CarApplicationTest {
    @Test
    public void ifCarIsOnTest() {
        CarApplication bugatti = new CarApplication("Bugatti", "2022", 185_000_000);
        boolean status = bugatti.getIsOn();
        assertEquals(false, status);

        bugatti.setIsOn(true);
        boolean newStatus = bugatti.getIsOn();
        assertEquals(true, newStatus);
    }

    @Test
    public void ifCarIsOffTest() {
        CarApplication bugatti = new CarApplication("Bugatti", "2022", 185_000_000);
        bugatti.setIsOn(true);
        boolean status = bugatti.getIsOn();
        assertEquals(true, status);

        bugatti.setIsOn(false);
        boolean newStatus = bugatti.getIsOn();
        assertEquals(false, newStatus);
    }

    @Test
    public void GearOneTest() {
        CarApplication bugatti = new CarApplication("Bugatti", "2022", 185_000_000);
        bugatti.setIsOn(true);
        boolean status = bugatti.getIsOn();
        assertEquals(true, status);

        bugatti.setGear(1);
        int carGear = bugatti.getGear();
        assertEquals(1, carGear);
    }

    @Test
    public void GearTwoTest() {
        CarApplication bugatti = new CarApplication("Bugatti", "2022", 185_000_000);
        bugatti.setIsOn(true);
        boolean status = bugatti.getIsOn();
        assertEquals(true, status);

        bugatti.setGear(2);
        int carGear = bugatti.getGear();
        assertEquals(2, carGear);
    }

    @Test
    public void AccelerationTest(){
        CarApplication bugatti = new CarApplication("Bugatti", "2022", 185_000_000);
        bugatti.setIsOn(true);
        boolean status = bugatti.getIsOn();
        assertEquals(true, status);

        bugatti.setAcceleration(45);
        int bugattiAcceleration = bugatti.getAcceleration();
        assertEquals(46, bugattiAcceleration);

    }

    @Test
    public void DecelerationTest(){
        CarApplication bugatti = new CarApplication("Bugatti", "2022", 185_000_000);
        bugatti.setIsOn(true);
        boolean status = bugatti.getIsOn();
        assertEquals(true, status);

        bugatti.setDeceleration(45);
        int bugattiDeceleration = bugatti.getDeceleration();
        assertEquals(44, bugattiDeceleration);
    }

}
