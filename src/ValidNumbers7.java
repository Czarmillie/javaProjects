import java.util.Scanner;

public class ValidNumbers7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 10 Scores between 0 and 100: ");
        int count = 0;
        while (count < 10) {
            System.out.print("Scores " + (count + 1) + ": ");
            int number = scanner.nextInt();
            if (number >= 0 && number <= 100) {
                System.out.println("Valid Score");
                count++;
            } else {
                System.out.println("Invalid Score!!! Please enter a number between 0 and 100.");
            }
        }
    }
}