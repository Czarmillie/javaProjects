import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CombineList9 {
    public static List<Object> combineLists(List<Object> list1, List<Object> list2) {
        List<Object> combinedList = new ArrayList<>();
        int length = Math.min(list1.size(), list2.size());

        for (int i = 0; i < length; i++) {
            combinedList.add(list1.get(i));
            combinedList.add(list2.get(i));
        }

        combinedList.addAll(list1.subList(length, list1.size()));
        combinedList.addAll(list2.subList(length, list2.size()));

        return combinedList;
    }

    public static void main(String[] args) {
        List<Object> list1 = new ArrayList<>(Arrays.asList("a", "b", "c"));
        List<Object> list2 = new ArrayList<>(Arrays.asList(1, 2, 3));
        List<Object> combinedList = combineLists(list1, list2);
        System.out.println(combinedList);
    }
}