//package MenstrualCycle;
//
//import java.text.SimpleDateFormat;
//import java.util.Calendar;
//import java.util.Date;
//
//public class MenstrualCycleTracker {
//
//    public static Date calculateNextPeriodDate(int cycleLength) {
//        Calendar calendar = Calendar.getInstance();
//        calendar.add(Calendar.DAY_OF_YEAR, cycleLength);
//        return calendar.getTime();
//    }
//
//    public static Date calculateOvulationDate(int cycleLength) {
//        Calendar calendar = Calendar.getInstance();
//        calendar.add(Calendar.DAY_OF_YEAR, cycleLength / 2);
//        return calendar.getTime();
//    }
//
//    public static Date[] calculateSafePeriods(int cycleLength) {
//        Calendar calendar = Calendar.getInstance();
//        calendar.add(Calendar.DAY_OF_YEAR, cycleLength / 2 - 4);
//        Date safePeriodStart = calendar.getTime();
//
//        calendar.add(Calendar.DAY_OF_YEAR, 8);
//        Date safePeriodEnd = calendar.getTime();
//
//        return new Date[]{safePeriodStart, safePeriodEnd};
//    }
//
//    public static void main(String[] args) {
//        int cycleLength = 28;
//
//        Date nextPeriodDate = calculateNextPeriodDate(cycleLength);
//        Date ovulationDate = calculateOvulationDate(cycleLength);
//        Date[] safePeriods = calculateSafePeriods(cycleLength);
//
//        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
//        System.out.println("Safe period starts on: " + dateFormat.format(safePeriods[0]));
//        System.out.println("Safe period ends on: " + dateFormat.format(safePeriods[1]));
//        System.out.println("Ovulation date: " + dateFormat.format(ovulationDate));
//        System.out.println("Next expected period date: " + dateFormat.format(nextPeriodDate));
//    }
//}