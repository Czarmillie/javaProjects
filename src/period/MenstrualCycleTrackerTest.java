//package MenstrualCycle;
//
//import org.junit.Test;
//import java.util.Calendar;
//import java.util.Date;
//import java.util.GregorianCalendar;
//
//import static org.junit.Assert.assertEquals;
//
//public class MenstrualCycleTrackerTest {
//
//    @Test
//    public void testCalculateNextPeriodDate() {
//        int cycleLength = 28;
//        Calendar calendar = Calendar.getInstance();
//        calendar.add(Calendar.DAY_OF_YEAR, cycleLength);
//
//        Date expected = calendar.getTime();
//        Date actual = MenstrualCycleTracker.calculateNextPeriodDate(cycleLength);
//
//        assertEquals(expected, actual);
//    }
//
//    @Test
//    public void testCalculateOvulationDate() {
//        int cycleLength = 28;
//        Calendar calendar = Calendar.getInstance();
//        calendar.add(Calendar.DAY_OF_YEAR, cycleLength / 2);
//
//        Date expected = calendar.getTime();
//        Date actual = MenstrualCycleTracker.calculateOvulationDate(cycleLength);
//
//        assertEquals(expected, actual);
//    }
//
//    @Test
//    public void testCalculateSafePeriods() {
//        int cycleLength = 28;
//
//        Calendar expectedStartCalendar = new GregorianCalendar();
//        expectedStartCalendar.add(Calendar.DAY_OF_YEAR, cycleLength / 2 - 4);
//        int expectedStartDayOfYear = expectedStartCalendar.get(Calendar.DAY_OF_YEAR);
//
//        Calendar expectedEndCalendar = new GregorianCalendar();
//        expectedEndCalendar.add(Calendar.DAY_OF_YEAR, cycleLength / 2 + 4);
//        int expectedEndDayOfYear = expectedEndCalendar.get(Calendar.DAY_OF_YEAR);
//
//        Date[] actual = MenstrualCycleTracker.calculateSafePeriods(cycleLength);
//
//        Calendar actualStartCalendar = Calendar.getInstance();
//        actualStartCalendar.setTime(actual[0]);
//        assertEquals(expectedStartDayOfYear, actualStartCalendar.get(Calendar.DAY_OF_YEAR));
//
//        Calendar actualEndCalendar = Calendar.getInstance();
//        actualEndCalendar.setTime(actual[1]);
//        assertEquals(expectedEndDayOfYear, actualEndCalendar.get(Calendar.DAY_OF_YEAR));
//    }
//}
//
