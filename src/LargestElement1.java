public class LargestElement1 {
    public static void main(String[] args) {
    }
    public static int findLargestElement(int[] numbers) {
        int maxElement = numbers[0];

        for (int num1 = 1; num1 < numbers.length; num1++) {
            if (numbers[num1] > maxElement) {
                maxElement = numbers[num1];
            }
        }
        System.out.println(maxElement);
        return maxElement;
    }
}