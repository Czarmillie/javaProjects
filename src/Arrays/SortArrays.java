import java.util.Scanner;

public class SortArrays {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] myIntegers = getIntegers(5);
        int[] sorted = sortIntegers(myIntegers);
        printArray(sorted);
    }

    private static int[] getIntegers(int number) {
        int[] array = new int[number];
        System.out.println("Enter " + number + " Integer values: \r");
        for (int num = 0; num < array.length; num++) {
            array[num] = scanner.nextInt();
        }
        return array;
    }

    public static void printArray(int[] array){
        for(int num1 = 0; num1 < array.length; num1++){
            System.out.println("Element " + num1 + " Contents " + array[num1]);
        }
    }

    public static int[]sortIntegers(int[] array){
        int[] sortedArray = new int[array.length];
        for(int num2 = 0; num2 < array.length; num2++){
            sortedArray[num2] = array[num2];
        }
        boolean flag = true;
        int temp;
        while(flag){
            flag = false;
            for(int num3 = 0; num3 < sortedArray.length; num3++){
                if(sortedArray[num3] < sortedArray[num3 + 1]){
                    temp = sortedArray[num3];
                    sortedArray[num3] = sortedArray[num3 + 1];
                    sortedArray[num3 + 1] = temp;
                    flag = true;
                }
            }
        }
        return sortedArray;
    }
}
