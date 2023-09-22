import java.util.Scanner;

public class Average2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int totalScores = 10;
        int sum = 0;
        System.out.println("Enter ten scores:");
        for (int average = 1; average <= totalScores; average++) {
            System.out.print("Score" + average + ": ");
            int score = scanner.nextInt();
            sum += score;
        }
        double average = (double) sum / totalScores;
        System.out.println("The average of the scores is: " + average);
    }
}
