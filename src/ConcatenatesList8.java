import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ConcatenatesList8 {
    public static List<Object> concatenateLists(List<Object> list1, List<Object> list2) {
        List<Object> result = new ArrayList<>();
        result.addAll(list1);
        result.addAll(list2);
        return result;
    }

    public static void main(String[] args) {
        List<Object> list1 = new ArrayList<>(Arrays.asList("a", "b", "c"));
        List<Object> list2 = new ArrayList<>(Arrays.asList(1, 2, 3));
        List<Object> concatenatedList = concatenateLists(list1, list2);
        System.out.println(concatenatedList);
    }
}