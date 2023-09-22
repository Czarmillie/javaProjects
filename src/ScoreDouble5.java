import java.util.Scanner;

public class ScoreDouble5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 10 Scores:");
        int sum = 0;
        for (int secondNumbers = 1; secondNumbers <= 10; secondNumbers++) {
            System.out.print("Scores " + secondNumbers + ": ");
            int number = scanner.nextInt();
            if (secondNumbers % 2 == 0) {
                sum += number;
            }
        }
        System.out.println("The sum of the 2nd, 4th, 6th, 8th, and 10th numbers is: " + sum);
    }
}
