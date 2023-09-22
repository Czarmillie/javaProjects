package tdd;

import MenstrualCycle.HealthData;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HealthDataTest {

    private static final double maxDifference = 0.0001;

    @Test
    public void testGetWeightAndSetWeight() {
        double weight = 65.5;
        double newWeight = 70.0;
        HealthData healthData = new HealthData(weight, "Jogging", "Balanced diet");
        assertEquals(weight, healthData.getWeight(), maxDifference);

        healthData.setWeight(newWeight);
        assertEquals(newWeight, healthData.getWeight(), maxDifference);
    }

    @Test
    public void testGetExerciseRoutineAndSetExerciseRoutine() {
        String exerciseRoutine = "Jogging";
        String newExerciseRoutine = "Yoga";
        HealthData healthData = new HealthData(65.5, exerciseRoutine, "Balanced diet");
        assertEquals(exerciseRoutine, healthData.getExerciseRoutine());

        healthData.setExerciseRoutine(newExerciseRoutine);
        assertEquals(newExerciseRoutine, healthData.getExerciseRoutine());
    }

    @Test
    public void testGetDietaryHabitsAndSetDietaryHabits() {
        String dietaryHabits = "Balanced diet";
        String newDietaryHabits = "Vegetarian diet";
        HealthData healthData = new HealthData(65.5, "Jogging", dietaryHabits);
        assertEquals(dietaryHabits, healthData.getDietaryHabits());

        healthData.setDietaryHabits(newDietaryHabits);
        assertEquals(newDietaryHabits, healthData.getDietaryHabits());
    }
}