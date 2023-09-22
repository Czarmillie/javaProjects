import java.util.Scanner;

public class Multiplication {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int input = scanner.nextInt();
        System.out.print("Enter another number: ");
        int input2 = scanner.nextInt();
        int result = multiplication(input, input2);
        System.out.print("Result: " + result);
    }
    public static int multiplication(int num, int num2) {
        int total = 0;
        for(int counter = 0; counter < num2; counter++){
            total += num;
        }
        return total;
    }
}