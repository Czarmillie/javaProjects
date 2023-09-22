import java.util.Scanner;
public class ComparingIntegers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Integer: ");
        int num = input.nextInt();
        int num2 = 100;
        int square = num * num;
        if (num > 100){
            System.out.printf("%d > %d%n", num, num2);
        }
        if (square > 100){
            System.out.printf("%d > %d%n", square, num2);
        }
        if (num == 100){
            System.out.printf("%d == %d%n", num, num2);
        }
        if (square == 100){
            System.out.printf("%d > %d%n", square, num2);
        }
        if (num != 100){
            System.out.printf("%d != %d%n", num, num2);
        }
        if (square != 100){
            System.out.printf("%d != %d%n", square, num2);
        }
        if (num < 100){
            System.out.printf("%d < %d%n", num, num2);
        }
        if (square < 100){
            System.out.printf("%d < %d%n", square, num2);
        }
    }
}