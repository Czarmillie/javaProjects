import java.util.Scanner;

public class EvenNumbers4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int totalScores = 10;
        int sum = 0;
        System.out.println("Enter ten scores:");
        for (int evenNumber = 1; evenNumber <= totalScores; evenNumber++) {
            System.out.print("Score" + evenNumber + ": ");
            int score = scanner.nextInt();
            if (score % 2 == 0) {
                sum += score;
            }
        }
        System.out.println("The sum of the even scores is: " + sum);
    }
}
