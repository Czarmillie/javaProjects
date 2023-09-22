import java.util.Arrays;

public class HighestAndLowestArray {
    public static void main(String[] args) {
        int[] array = new int[]{5, 18, 32, 3, 4};
        System.out.println(Arrays.toString(sort(array)));
        }

    public static int[] sort(int[] array){
        int[] secondArray = new int[array.length];
        System.arraycopy(array, 0, secondArray, 0, array.length);
        return secondArray;
    }

    public int[] sortMethod(int[] secondArray){
        int temp;
        for (int index = 0; index < secondArray.length; index++) {
            for (int index2 = 0; index2 < secondArray.length; index2++) {
                if (secondArray[index] < secondArray[index2]){
                        temp = secondArray[index];
                        secondArray[index] = secondArray[index2];
                        secondArray[index2] = temp;
                }
            }
        }
        return secondArray;
    }

    public static int getPositions(int[] array){
        int positions = 0;
        for (int secondArray = 1; secondArray < array.length; secondArray++) {
            if (array[secondArray] > array[positions]) {
                positions = secondArray;
            }

            if (array[secondArray] < array[positions]) {
                positions = secondArray;
            }
        }
        return positions;
    }
}