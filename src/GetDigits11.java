import java.util.ArrayList;
import java.util.List;

public class GetDigits11 {
    public static List<Integer> getDigits(int number) {
        List<Integer> digitList = new ArrayList<>();
        String numberString = String.valueOf(number);

        for (int i = 0; i < numberString.length(); i++) {
            int digit = Character.getNumericValue(numberString.charAt(i));
            digitList.add(digit);
        }

        return digitList;
    }

    public static void main(String[] args) {
        int number = 2342;
        List<Integer> digitList = getDigits(number);
        System.out.println(digitList);
    }
}
