import java.util.Scanner;

public class TenScores8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 10 Scores between 0 and 100: ");
        int sum = 0;
        int count = 0;
        while (count < 10) {
            System.out.print("Score " + (count + 1) + ": ");
            int number = scanner.nextInt();
            if (number >= 0 && number <= 100) {
                sum += number;
                count++;
            } else {
                System.out.println("Invalid score! Please enter a number between 0 and 100.");
            }
        }
        System.out.println("The sum of the 10 valid numbers is: " + sum);
    }
}
