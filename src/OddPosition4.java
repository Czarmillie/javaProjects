import java.util.List;

public class OddPosition4 {
    public static void printOddPositions(List<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            if (i % 2 == 0) {
                System.out.println(list.get(i));
            }
        }
    }
}
