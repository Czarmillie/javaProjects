import java.util.Arrays;

public class Fibonacci {

    public static void main(String[] args) {
        Fibonacci fibonacci = new Fibonacci(){
        };
        int counter = 10;
        int firstNumber = 0;
        int secondNumber = 1;
        int[] series = new int[counter];
        series[0] = firstNumber;

        if (counter > 1) {
            series[1] = secondNumber;
            for (int num = 2; num < counter; num++) {
                int nextNumber = firstNumber + secondNumber;
                series[num] = nextNumber;
                firstNumber = secondNumber;
                secondNumber = nextNumber;
            }
        }
        System.out.println("Fibonacci series: " + Arrays.toString(series));
    }
}