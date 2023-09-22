import java.util.Arrays;
public class HighestToLowestIndex {
    public static void main(String[] args) {
        int[] inputArray = {5, 18, 32, 3, 4};
        int[] outputArray = findMinMaxPositions(inputArray);

        System.out.println("Sample Input: " + Arrays.toString(inputArray));
        System.out.println("Sample Output: " + Arrays.toString(outputArray));
    }

    public static int[] findMinMaxPositions(int[] arr) {
        int minIndex = 0;
        int maxIndex = 0;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > arr[maxIndex]) {
                maxIndex = i;
            }

            if (arr[i] < arr[minIndex]) {
                minIndex = i;
            }
        }

        int[] positions = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            if (i == minIndex) {
                positions[i] = maxIndex;
            } else if (i == maxIndex) {
                positions[i] = minIndex;
            } else {
                positions[i] = i;
            }
        }

        return positions;
    }
}