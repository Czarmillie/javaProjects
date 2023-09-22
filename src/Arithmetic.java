import java.util.Scanner;

public class Arithmetic {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input first Integer: ");
        int input1 = scanner.nextInt();
        System.out.print("Input second Integer: ");
        int input2 = scanner.nextInt();
        System.out.print("Input third Integer: ");
        int input3 = scanner.nextInt();
        int sum = input1 + input2 + input3;
        int average = input1 + input2 + input3 / 3;
        int product = input1 * input2 * input3;
        int largest = Integer.MIN_VALUE;
        if (input1 > largest) {
            largest = input1;
        }
        if (input2 > largest){
            largest = input2;
        }
        if (input3 > largest){
            largest = input3;
        }
        int smallest = Integer.MAX_VALUE;
        if (input1 < smallest) {
            smallest = input1;
        }
        if (input2 < smallest){
            smallest = input2;
        }
        if (input3 < smallest){
            smallest = input3;
        }
        System.out.println("The sum is: " + sum);
        System.out.println("The average is: " + average);
        System.out.println("The product is: " + product);
        System.out.println("The largest is: " + largest);
        System.out.println("The smallest is: " + smallest);
    }
}