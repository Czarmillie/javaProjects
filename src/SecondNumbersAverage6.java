import java.util.Scanner;

public class SecondNumbersAverage6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 10 Scores:");
        int sum = 0;
        int count = 0;
        for (int second = 1; second <= 10; second++) {
            System.out.print("Score " + second + ": ");
            int number = scanner.nextInt();
            if (second % 2 == 0) {
                sum += number;
                count++;
            }
        }
        double average = (double) sum / count;
        System.out.println("The average of the 2nd, 4th, 6th, 8th, and 10th numbers is: " + average);
    }
}