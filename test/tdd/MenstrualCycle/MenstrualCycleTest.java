package tdd;

import MenstrualCycle.MenstrualCycle;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

import java.util.Date;

public class MenstrualCycleTest {

    @Test
    public void testGetStartDateAndSetStartDate() {
        Date startDate = new Date();
        Date newStartDate = new Date();
        MenstrualCycle cycle = new MenstrualCycle(startDate, new Date(), 3, "Cramps", "Happy");
        assertEquals(startDate, cycle.getStartDate());

        cycle.setStartDate(newStartDate);
        assertEquals(newStartDate, cycle.getStartDate());
    }

    @Test
    public void testGetEndDateAndSetEndDate() {
        Date endDate = new Date();
        Date newEndDate = new Date();
        MenstrualCycle cycle = new MenstrualCycle(new Date(), endDate, 3, "Cramps", "Happy");
        assertEquals(endDate, cycle.getEndDate());

        cycle.setEndDate(newEndDate);
        assertEquals(newEndDate, cycle.getEndDate());
    }

    @Test
    public void testGetFlowIntensityAndSetFlowIntensity() {
        int flowIntensity = 3;
        int newFlowIntensity = 4;
        MenstrualCycle cycle = new MenstrualCycle(new Date(), new Date(), flowIntensity, "Cramps", "Happy");
        assertEquals(flowIntensity, cycle.getFlowIntensity());

        cycle.setFlowIntensity(newFlowIntensity);
        assertEquals(newFlowIntensity, cycle.getFlowIntensity());
    }

    @Test
    public void testGetSymptomsAndSetSymptoms() {
        String symptoms = "Cramps";
        String newSymptoms = "Headache";
        MenstrualCycle cycle = new MenstrualCycle(new Date(), new Date(), 3, symptoms, "Happy");
        assertEquals(symptoms, cycle.getSymptoms());

        cycle.setSymptoms(newSymptoms);
        assertEquals(newSymptoms, cycle.getSymptoms());
    }

    @Test
    public void testGetMoodAndSetMood() {
        String mood = "Happy";
        String newMood = "Sad";
        MenstrualCycle cycle = new MenstrualCycle(new Date(), new Date(), 3, "Cramps", mood);
        assertEquals(mood, cycle.getMood());

        cycle.setMood(newMood);
        assertEquals(newMood, cycle.getMood());
    }
}
