import java.util.Scanner;

public class Multiples {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first Integer: ");
        int num1 = input.nextInt();
        System.out.print("Enter second integer: ");
        int num2 = input.nextInt();
        if (num1 * 3 == num2 * 2){
            System.out.print("");
        }
    }
}
