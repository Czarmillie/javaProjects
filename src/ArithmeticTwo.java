import java.util.Scanner;

public class ArithmeticTwo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first integer: ");
        int num1 = input.nextInt();
        System.out.print("Enter second integer: ");
        int num2 = input.nextInt();
        int square = num1 * num1;
        int square2 = num2 * num2;
        int squareSum = square + square2;
        int squareSub = square2 - square;
        System.out.println("The square for the first integer is: " + square);
        System.out.println("The square for the second integer is: " + square2);
        System.out.println("The sum of the squares is: " + squareSum);
        System.out.println("The difference of the squares is:" + squareSub);
    }
}