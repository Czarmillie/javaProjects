import java.util.Scanner;

public class TenScoresAverage9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 10 Scores between 0 and 100: ");
        int totalScores = 10;
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
        double average = (double) sum / totalScores;
        System.out.println("The average of the scores is: " + average);
    }
}
