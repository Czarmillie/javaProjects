import java.util.ArrayList;
import java.util.List;

public class EvenPosition5 {
    public static List<Integer> EvenPositions(List<Integer> list) {
        List<Integer> evenPositions = new ArrayList<>();
        for (int num = 1; num < list.size(); num += 2) {
            evenPositions.add(list.get(num));
        }
        return evenPositions;
    }
}
