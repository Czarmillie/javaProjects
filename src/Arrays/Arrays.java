import java.util.Scanner;

public class Arrays {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int[] myIntegers = getIntegers(5);
        for(int num = 0; num < myIntegers.length; num++){
            System.out.println("Element " + num + " Typed value was " + myIntegers[num]);
        }
        System.out.println("The sum is: " + getSum(myIntegers));
    }
    private static int[] getIntegers(int number) {
        System.out.println("Enter " + number + " Integer values: \r");
        int[]values = new int[number];
        for(int num = 0; num < values.length; num++){
            values[num] = scanner.nextInt();
        }
        return values;
    }
    public static int getSum(int[] array){
         int sum = 0;
         for(int num1 = 0; num1 < array.length; num1++){
             sum += array[num1];
         }
         return sum;
    }
}