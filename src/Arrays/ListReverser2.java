import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListReverser2 {
    public static List<Integer> reverseList(List<Integer> list) {
        List<Integer> reversedList = new ArrayList<>(list);
        Collections.reverse(reversedList);
        return reversedList;
    }
}