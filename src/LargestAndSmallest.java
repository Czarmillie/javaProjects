import java.util.Scanner;

public class LargestAndSmallest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input first Integer: ");
        int num1 = scanner.nextInt();
        System.out.print("Input second Integer: ");
        int num2 = scanner.nextInt();
        System.out.print("Input third Integer: ");
        int num3 = scanner.nextInt();
        System.out.print("Input fourth integer: ");
        int num4 = scanner.nextInt();
        System.out.print("Input fifth integer: ");
        int num5 = scanner.nextInt();
        int largest = Integer.MIN_VALUE;

        if (num1 > largest) {
            largest = num1;
        }
        if (num2 > largest) {
            largest = num2;
        }
        if (num3 > largest) {
            largest = num3;
        }
        if (num4 > largest) {
            largest = num4;
        }
        if (num5 > largest) {
            largest = num5;
        }

        int smallest = Integer.MAX_VALUE;
        if (num1 < smallest) {
            smallest = num1;
        }
        if (num2 < smallest) {
            smallest = num2;
        }
        if (num3 < smallest) {
            smallest = num3;
        }
        if (num4 < smallest) {
            smallest = num4;
        }
        if (num5 < smallest) {
            smallest = num5;
        }
        System.out.println("The largest number is: " + largest);
        System.out.println("The smallest number is: " + smallest);
    }
}