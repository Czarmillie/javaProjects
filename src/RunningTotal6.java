import java.util.ArrayList;
import java.util.List;

public class RunningTotal6 {
    public static List<Integer> computeRunningTotal(List<Integer> inputList) {
        List<Integer> runningTotal = new ArrayList<>();
        int total = 0;

        for (int num : inputList) {
            total += num;
            runningTotal.add(total);
        }

        return runningTotal;
    }

    public static void main(String[] args) {
        List<Integer> myList = new ArrayList<>();
        myList.add(1);
        myList.add(2);
        myList.add(3);
        myList.add(4);
        myList.add(5);

        List<Integer> runningTotal = computeRunningTotal(myList);
        System.out.println(runningTotal);
    }
}