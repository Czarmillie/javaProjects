public class SwitchElements {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6};
        switchElements(numbers);
        for (int value : numbers){
            System.out.print(value + ",");
        }
    }

    public static void switchElements(int[] arr) {
        for (int index = 0; index < arr.length - 1; index += 2) {
            int temp = arr[index];
            arr[index] = arr[index + 1];
            arr[index + 1] = temp;
        }
    }
}