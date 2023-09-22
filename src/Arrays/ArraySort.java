import java.util.Arrays;

public class ArraySort {
    public static void main(String[] args) {
        int[] numbers = {5, 2, 9, 1, 3};
        System.out.println("Original numerical array: " + Arrays.toString(numbers));

        Arrays.sort(numbers);
        System.out.println("Sorted numerical array: " + Arrays.toString(numbers));

        String[] fruits = {"banana", "apple", "pear", "orange"};
        System.out.println("Original string array: " + Arrays.toString(fruits));

        Arrays.sort(fruits);
        System.out.println("Sorted string array: " + Arrays.toString(fruits));
    }
}
