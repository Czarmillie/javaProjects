import java.util.Scanner;

public class FibonacciCal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int cou = input.nextInt();
        int element = 10;
        System.out.println("Fibonacci series: " + element);
        for (int num = 0; num < element; num++) {
            System.out.print(fibonacci(num) + " ");
        }
    }
    public static int fibonacci(int element) {
        if (element <= 1) {
            return element;
        }
        return fibonacci(element - 1) + fibonacci(element - 2);
    }
}