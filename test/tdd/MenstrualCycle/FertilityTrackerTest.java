package tdd;

import MenstrualCycle.FertilityTracker;
import org.junit.Before;
import org.junit.Test;

import java.util.Date;

import static org.junit.Assert.assertEquals;

public class FertilityTrackerTest {

    private FertilityTracker fertilityTracker;

    @Before
    public void setUp() {
        Date ovulationDate = new Date();
        Date fertileWindowStart = new Date();
        Date fertileWindowEnd = new Date();

        fertilityTracker = new FertilityTracker(ovulationDate, fertileWindowStart, fertileWindowEnd);
    }

    @Test
    public void testGetOvulationDate() {
        assertEquals(fertilityTracker.getOvulationDate(), fertilityTracker.getOvulationDate());
    }

    @Test
    public void testGetFertileWindowStart() {
        assertEquals(fertilityTracker.getFertileWindowStart(), fertilityTracker.getFertileWindowStart());
    }

    @Test
    public void testGetFertileWindowEnd() {
        assertEquals(fertilityTracker.getFertileWindowEnd(), fertilityTracker.getFertileWindowEnd());
    }

    @Test
    public void testSetOvulationDate() {
        Date newOvulationDate = new Date();
        fertilityTracker.setOvulationDate(newOvulationDate);
        assertEquals(newOvulationDate, fertilityTracker.getOvulationDate());
    }

    @Test
    public void testSetFertileWindowStart() {
        Date newFertileWindowStart = new Date();
        fertilityTracker.setFertileWindowStart(newFertileWindowStart);
        assertEquals(newFertileWindowStart, fertilityTracker.getFertileWindowStart());
    }

    @Test
    public void testSetFertileWindowEnd() {
        Date newFertileWindowEnd = new Date();
        fertilityTracker.setFertileWindowEnd(newFertileWindowEnd);
        assertEquals(newFertileWindowEnd, fertilityTracker.getFertileWindowEnd());
    }
}
