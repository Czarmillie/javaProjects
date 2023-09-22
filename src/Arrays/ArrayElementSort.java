public class ArrayElementSort {
    public static void main(String[] args) {
        int[] num = {1, 2, 3, 4, 5, 6, 7, 8};
        for (int num1 = 0; num1 < num.length; num1++) {
            int sum = 0;
            for (int num2 = 0; num2 < num.length; num2++) {
                if (num1 != num2) {
                    sum += num[num2];
                }
            }
            System.out.println("Sum of array elements excluding element at index " + num1 + ": " + sum);
        }
    }
}