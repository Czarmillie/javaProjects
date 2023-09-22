import java.util.Scanner;

public class ScoreAndAverage3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int scores = 10;
        int totalScores = 10;
        int sum = 0;
        System.out.println("Enter ten scores:");
        for (int score1 = 1; score1 <= scores; score1++) {
            System.out.print("Score" + score1 + ": ");
            int score = scanner.nextInt();
            sum += score;
        }
        double average = (double) sum / totalScores;
        System.out.println("The average of the scores is: " + average);
        System.out.println("The sum of the scores provided is: " + sum);
    }
}